package com.archi.radium.helper;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.Heightmap;

import java.util.ArrayList;
import java.util.List;

public class BlockHelper {

    public static List<Block> raycastToBlockPos(Level world, BlockPos start, BlockPos end) {

        List<Block> blocks = new ArrayList<>();

        double startX = start.getX() + 0.5; // Centering to account for block precision
        double startY = start.getY() + 0.5;
        double startZ = start.getZ() + 0.5;

        double endX = end.getX() + 0.5;
        double endY = end.getY() + 0.5;
        double endZ = end.getZ() + 0.5;

        double deltaX = endX - startX;
        double deltaY = endY - startY;
        double deltaZ = endZ - startZ;

        double maxDelta = Math.max(Math.abs(deltaX), Math.max(Math.abs(deltaY), Math.abs(deltaZ)));
        double stepX = deltaX / maxDelta; // Increment for X-axis
        double stepY = deltaY / maxDelta; // Increment for Y-axis
        double stepZ = deltaZ / maxDelta; // Increment for Z-axis

        double x = startX;
        double y = startY;
        double z = startZ;

        for (int i = 0; i <= maxDelta; i++) {
            BlockPos toCheck = new BlockPos((int) Math.floor(x), (int) Math.floor(y), (int) Math.floor(z));
            if (!toCheck.equals(start) && !toCheck.equals(end)) {
                blocks.add(world.getBlockState(toCheck).getBlock());
            }
            x += stepX;
            y += stepY;
            z += stepZ;
        }

        return blocks;
    }

    public static List<BlockPos> getBlocksInBox(BlockPos start, BlockPos end) {
        List<BlockPos> blocks = new ArrayList<>();

        int minX = Math.min(start.getX(), end.getX());
        int minY = Math.min(start.getY(), end.getY());
        int minZ = Math.min(start.getZ(), end.getZ());
        int maxX = Math.max(start.getX(), end.getX());
        int maxY = Math.max(start.getY(), end.getY());
        int maxZ = Math.max(start.getZ(), end.getZ());

        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                for (int z = minZ; z <= maxZ; z++) {
                    blocks.add(new BlockPos(x, y, z));
                }
            }
        }

        return blocks;
    }

    public static List<BlockPos> getBlocksInSphere(BlockPos center, int radius) {
        List<BlockPos> blocks = new ArrayList<>();

        int radiusSq = radius * radius;

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    if (x * x + y * y + z * z <= radiusSq) {
                        blocks.add(center.offset(x, y, z));
                    }
                }
            }
        }

        return blocks;
    }

    public static List<BlockPos> getSurfaceBlocks(Level world, BlockPos center, int radius) {
        List<BlockPos> surfaceBlocks = new ArrayList<>();

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                BlockPos pos = center.offset(x, 0, z);
                BlockPos surface = world.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING, pos);
                if (!world.getBlockState(surface).isAir()) {
                    surfaceBlocks.add(surface);
                }
            }
        }

        return surfaceBlocks;
    }

    public static BlockPos findNearestBlock(Level world, BlockPos start, Block targetBlock, int maxRadius) {
        for (int radius = 1; radius <= maxRadius; radius++) {
            List<BlockPos> blocks = getBlocksInSphere(start, radius);
            for (BlockPos pos : blocks) {
                if (world.getBlockState(pos).getBlock().equals(targetBlock)) {
                    return pos;
                }
            }
        }
        return null; // Return null if no block found
    }

}
