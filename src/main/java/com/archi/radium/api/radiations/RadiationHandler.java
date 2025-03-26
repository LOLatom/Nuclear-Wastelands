package com.archi.radium.api.radiations;

import com.archi.radium.RadiumMod;
import com.archi.radium.api.accessors.ChunkMapAccessor;
import com.archi.radium.api.radiations.util.IRadiationEmitterManager;
import com.archi.radium.common.init.RadiumAttachmentTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityEvent;
import net.neoforged.neoforge.event.tick.LevelTickEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@EventBusSubscriber(modid = RadiumMod.MODID, bus = EventBusSubscriber.Bus.GAME)
public class RadiationHandler {


    @SubscribeEvent
    public static void tickChunk(LevelTickEvent.Pre event) {
        if (event.getLevel() instanceof ServerLevel serverLevel) {
            if (serverLevel.getChunkSource().chunkMap instanceof ChunkMapAccessor chunkMapAccessor) {
                for (ChunkHolder chunkHolder : chunkMapAccessor.accessGetChunks()) {
                    if (chunkHolder.getTickingChunk() != null) {

                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void addReceiversOnSpawn(EntityEvent.EntityConstructing event) {
        if (!event.getEntity().hasData(RadiumAttachmentTypes.RADIATION_RECEIVERS)) {
            event.getEntity().setData(RadiumAttachmentTypes.RADIATION_RECEIVERS,new ArrayList<>());
        }

    }

    public static void addRadiationEmitters(Level level, List<RadiationEmission> emitterList) {
        if (emitterList.isEmpty()) {
            throw new UnsupportedOperationException("There is no Emitters");
        }

        IRadiationEmitterManager manager = level.getChunkAt(emitterList.get(0).position()).getData(RadiumAttachmentTypes.RADIATION_EMITTER_MANAGER);
        HashMap<BlockPos, List<RadiationEmission>> map = level.getChunkAt(emitterList.get(0).position()).getData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS);
        for (Map.Entry<BlockPos, List<RadiationEmission>> entry : map.entrySet()) {
            if (entry.getKey() == emitterList.get(0).position()) {
                throw new UnsupportedOperationException("Emitter is already present at this position");
            }
        }
        System.out.println("Emitters :{" + emitterList + "} have been set at : " + emitterList.get(0).position());
        manager.addRadiationEmitters(emitterList,level);
    }

    public static void removeRadiationEmitters(Level level, BlockPos pos) {
        if (pos == null) {
            throw new UnsupportedOperationException("Position cannot be null");
        }

        IRadiationEmitterManager manager = level.getChunkAt(pos).getData(RadiumAttachmentTypes.RADIATION_EMITTER_MANAGER);
        manager.removeRadiationEmitters(pos,level);
    }

    public static List<RadiationEmission> getEmittersOfPos(Level level, BlockPos pos) {
        if (pos == null) {
            throw new UnsupportedOperationException("Position cannot be null");
        }
        IRadiationEmitterManager manager = level.getChunkAt(pos).getData(RadiumAttachmentTypes.RADIATION_EMITTER_MANAGER);
        return manager.getEmittersOfPos(pos,level);
    }

}
