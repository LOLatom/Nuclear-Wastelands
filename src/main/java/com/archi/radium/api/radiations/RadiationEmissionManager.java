package com.archi.radium.api.radiations;

import com.archi.radium.api.radiations.util.IRadiationEmitterManager;
import com.archi.radium.common.init.RadiumAttachmentTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.List;

public class RadiationEmissionManager implements IRadiationEmitterManager {
    @Override
    public List<RadiationEmission> getPermanentRadiationEmitters(Level level) {
        return List.of();
    }

    @Override
    public void addRadiationEmitters(List<RadiationEmission> emitterList, Level level) {
            if (!emitterList.isEmpty()) {
                HashMap<BlockPos, List<RadiationEmission>> emitters = level.getChunkAt(emitterList.get(0).position()).getData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS);
                emitters.put(emitterList.get(0).position(), emitterList);
            }
    }

    @Override
    public boolean removeRadiationEmitters(BlockPos pos, Level level) {
        HashMap<BlockPos, List<RadiationEmission>> emitters = level.getChunkAt(pos).getData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS);
        if (!emitters.isEmpty()) {
            emitters.remove(pos);
            level.getChunkAt(pos).setData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS, emitters);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<RadiationEmission> getEmittersOfPos(BlockPos pos, Level level) {
        HashMap<BlockPos, List<RadiationEmission>> emitters = level.getChunkAt(pos).getData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS);
        if (!emitters.isEmpty()) {
            return emitters.get(pos);
        }else {
            return List.of();
        }
    }

    @Override
    public boolean removeEmissionOfPos(BlockPos pos, Level level, int index) {
        HashMap<BlockPos, List<RadiationEmission>> emitters = level.getChunkAt(pos).getData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS);
        if (!emitters.isEmpty()) {
            if (!emitters.get(pos).isEmpty() && emitters.get(pos).size() > index) {
                emitters.get(pos).remove(index);
                level.getChunkAt(pos).setData(RadiumAttachmentTypes.PERMANENT_RADIATION_EMITTERS, emitters);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }



}
