package com.archi.radium.common.init;

import com.archi.radium.RadiumMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RadiumBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RadiumMod.MODID);

    public static final DeferredRegister.Blocks STONE_BLOCKS = DeferredRegister.createBlocks(RadiumMod.MODID);


    public static final DeferredBlock<Block> HIGHLY_IRRADIATED_MUD = BLOCKS.registerSimpleBlock("highly_irradiated_mud", BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HIGHLY_IRRADIATED_CRACKED_MUD = BLOCKS.registerSimpleBlock("highly_irradiated_cracked_mud", BlockBehaviour.Properties.of().destroyTime(4.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HIGHLY_IRRADIATED_DIRT = BLOCKS.registerSimpleBlock("highly_irradiated_dirt", BlockBehaviour.Properties.of().destroyTime(2.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.GRAVEL));


    public static final DeferredBlock<Block> IRRADIATED_MUD = BLOCKS.registerSimpleBlock("irradiated_mud", BlockBehaviour.Properties.of().destroyTime(6F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> IRRADIATED_CRACKED_MUD = BLOCKS.registerSimpleBlock("irradiated_cracked_mud", BlockBehaviour.Properties.of().destroyTime(4F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> IRRADIATED_DIRT = BLOCKS.registerSimpleBlock("irradiated_dirt", BlockBehaviour.Properties.of().destroyTime(2F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.GRAVEL));


    public static final DeferredBlock<Block> MILDLY_IRRADIATED_MUD = BLOCKS.registerSimpleBlock("mildly_irradiated_mud", BlockBehaviour.Properties.of().destroyTime(5.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> MILDLY_IRRADIATED_CRACKED_MUD = BLOCKS.registerSimpleBlock("mildly_irradiated_cracked_mud", BlockBehaviour.Properties.of().destroyTime(3.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> MILDLY_IRRADIATED_DIRT = BLOCKS.registerSimpleBlock("mildly_irradiated_dirt", BlockBehaviour.Properties.of().destroyTime(1.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.GRAVEL));


    public static final DeferredBlock<Block> LOW_IRRADIATED_MUD = BLOCKS.registerSimpleBlock("low_irradiated_mud", BlockBehaviour.Properties.of().destroyTime(5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> LOW_IRRADIATED_CRACKED_MUD = BLOCKS.registerSimpleBlock("low_irradiated_cracked_mud", BlockBehaviour.Properties.of().destroyTime(3F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> LOW_IRRADIATED_DIRT = BLOCKS.registerSimpleBlock("low_irradiated_dirt", BlockBehaviour.Properties.of().destroyTime(1F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.GRAVEL));


    public static final DeferredBlock<Block> HIGHLY_IRRADIATED_MUD_BRICKS = BLOCKS.registerSimpleBlock("highly_irradiated_mud_bricks", BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> HIGHLY_IRRADIATED_MUD_BRICKS_STAIRS = BLOCKS.register("highly_irradiated_mud_bricks_stairs",()->legacyStair(HIGHLY_IRRADIATED_MUD_BRICKS.get()));

    public static final DeferredBlock<Block> HIGHLY_IRRADIATED_MUD_BRICKS_SLAB = BLOCKS.register("highly_irradiated_mud_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS)));

    public static final DeferredBlock<Block> IRRADIATED_MUD_BRICKS = BLOCKS.registerSimpleBlock("irradiated_mud_bricks", BlockBehaviour.Properties.of().destroyTime(6F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> IRRADIATED_MUD_BRICKS_STAIRS = BLOCKS.register("irradiated_mud_bricks_stairs",()->legacyStair(HIGHLY_IRRADIATED_MUD_BRICKS.get()));

    public static final DeferredBlock<Block> IRRADIATED_MUD_BRICKS_SLAB = BLOCKS.register("irradiated_mud_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS)));

    public static final DeferredBlock<Block> MILDLY_IRRADIATED_MUD_BRICKS = BLOCKS.registerSimpleBlock("mildly_irradiated_mud_bricks", BlockBehaviour.Properties.of().destroyTime(5.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> MILDLY_IRRADIATED_MUD_BRICKS_STAIRS = BLOCKS.register("mildly_irradiated_mud_bricks_stairs",()->legacyStair(HIGHLY_IRRADIATED_MUD_BRICKS.get()));

    public static final DeferredBlock<Block> MILDLY_IRRADIATED_MUD_BRICKS_SLAB = BLOCKS.register("mildly_irradiated_mud_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS)));

    public static final DeferredBlock<Block> LOW_IRRADIATED_MUD_BRICKS = BLOCKS.registerSimpleBlock("low_irradiated_mud_bricks", BlockBehaviour.Properties.of().destroyTime(5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS));

    public static final DeferredBlock<Block> LOW_IRRADIATED_MUD_BRICKS_STAIRS = BLOCKS.register("low_irradiated_mud_bricks_stairs",()->legacyStair(HIGHLY_IRRADIATED_MUD_BRICKS.get()));

    public static final DeferredBlock<Block> LOW_IRRADIATED_MUD_BRICKS_SLAB = BLOCKS.register("low_irradiated_mud_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.MUD_BRICKS)));


    public static final DeferredBlock<Block> LIMESTONE = BLOCKS.registerSimpleBlock("limestone", BlockBehaviour.Properties.of().destroyTime(7F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> COBBLED_LIMESTONE = BLOCKS.registerSimpleBlock("cobbled_limestone", BlockBehaviour.Properties.of().destroyTime(7F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> OXIDE_LIMESTONE = BLOCKS.registerSimpleBlock("oxide_limestone", BlockBehaviour.Properties.of().destroyTime(7F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> COBBLED_OXIDE_LIMESTONE = BLOCKS.registerSimpleBlock("cobbled_oxide_limestone", BlockBehaviour.Properties.of().destroyTime(7F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> GREENSLATE = BLOCKS.registerSimpleBlock("greenslate", BlockBehaviour.Properties.of().destroyTime(7F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> GREENSLATE_STAIRS = BLOCKS.register("greenslate_stairs",()->legacyStair(GREENSLATE.get()));

    public static final DeferredBlock<Block> GREENSLATE_SLAB = BLOCKS.register("greenslate_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> COBBLED_GREENSLATE = BLOCKS.registerSimpleBlock("cobbled_greenslate", BlockBehaviour.Properties.of().destroyTime(7F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> COBBLED_GREENSLATE_STAIRS = BLOCKS.register("cobbled_greenslate_stairs",()->legacyStair(COBBLED_GREENSLATE.get()));

    public static final DeferredBlock<Block> COBBLED_GREENSLATE_SLAB = BLOCKS.register("cobbled_greenslate_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(6.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> SHALE = BLOCKS.registerSimpleBlock("shale", BlockBehaviour.Properties.of().destroyTime(10.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> SHALE_STAIRS = BLOCKS.register("shale_stairs",()->legacyStair(SHALE.get()));

    public static final DeferredBlock<Block> SHALE_SLAB = BLOCKS.register("shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(10.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> COBBLED_SHALE = BLOCKS.registerSimpleBlock("cobbled_shale", BlockBehaviour.Properties.of().destroyTime(9.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> COBBLED_SHALE_STAIRS = BLOCKS.register("cobbled_shale_stairs",()->legacyStair(COBBLED_SHALE.get()));

    public static final DeferredBlock<Block> COBBLED_SHALE_SLAB = BLOCKS.register("cobbled_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(9.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> SLIGHTLY_HARDEN_SHALE = BLOCKS.registerSimpleBlock("slightly_harden_shale", BlockBehaviour.Properties.of().destroyTime(14.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> SLIGHTLY_HARDEN_SHALE_STAIRS = BLOCKS.register("slightly_harden_shale_stairs",()->legacyStair(SLIGHTLY_HARDEN_SHALE.get()));

    public static final DeferredBlock<Block> SLIGHTLY_HARDEN_SHALE_SLAB = BLOCKS.register("slightly_harden_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(14.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> SLIGHTLY_HARDEN_COBBLED_SHALE = BLOCKS.registerSimpleBlock("slightly_harden_cobbled_shale", BlockBehaviour.Properties.of().destroyTime(13F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> SLIGHTLY_HARDEN_COBBLED_SHALE_STAIRS = BLOCKS.register("slightly_harden_cobbled_shale_stairs",()->legacyStair(SLIGHTLY_HARDEN_COBBLED_SHALE.get()));

    public static final DeferredBlock<Block> SLIGHTLY_HARDEN_COBBLED_SHALE_SLAB = BLOCKS.register("slightly_harden_cobbled_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(13F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> HARDEN_SHALE = BLOCKS.registerSimpleBlock("harden_shale", BlockBehaviour.Properties.of().destroyTime(16F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HARDEN_SHALE_STAIRS = BLOCKS.register("harden_shale_stairs",()->legacyStair(HARDEN_SHALE.get()));

    public static final DeferredBlock<Block> HARDEN_SHALE_SLAB = BLOCKS.register("harden_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(16F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> HARDEN_COBBLED_SHALE = BLOCKS.registerSimpleBlock("harden_cobbled_shale", BlockBehaviour.Properties.of().destroyTime(14.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HARDEN_COBBLED_SHALE_STAIRS = BLOCKS.register("harden_cobbled_shale_stairs",()->legacyStair(HARDEN_COBBLED_SHALE.get()));

    public static final DeferredBlock<Block> HARDEN_COBBLED_SHALE_SLAB = BLOCKS.register("harden_cobbled_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(14.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> HIGHLY_HARDEN_SHALE = BLOCKS.registerSimpleBlock("highly_harden_shale", BlockBehaviour.Properties.of().destroyTime(20.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HIGHLY_HARDEN_SHALE_STAIRS = BLOCKS.register("highly_harden_shale_stairs",()->legacyStair(HIGHLY_HARDEN_SHALE.get()));

    public static final DeferredBlock<Block> HIGHLY_HARDEN_SHALE_SLAB = BLOCKS.register("highly_harden_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(20.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> HIGHLY_HARDEN_COBBLED_SHALE = BLOCKS.registerSimpleBlock("highly_harden_cobbled_shale", BlockBehaviour.Properties.of().destroyTime(17.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HIGHLY_HARDEN_COBBLED_SHALE_STAIRS = BLOCKS.register("highly_harden_cobbled_shale_stairs",()->legacyStair(HIGHLY_HARDEN_COBBLED_SHALE.get()));

    public static final DeferredBlock<Block> HIGHLY_HARDEN_COBBLED_SHALE_SLAB = BLOCKS.register("highly_harden_cobbled_shale_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(17.5F).mapColor(MapColor.COLOR_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    private static Block legacyStair(Block baseBlock) {
        return new StairBlock(baseBlock.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(baseBlock));
    }

}
