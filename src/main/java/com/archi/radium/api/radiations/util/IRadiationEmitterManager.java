package com.archi.radium.api.radiations.util;

import com.archi.radium.api.radiations.RadiationEmission;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import java.util.List;

public interface IRadiationEmitterManager {

    public List<RadiationEmission> getPermanentRadiationEmitters(Level level);

    public void addRadiationEmitters(List<RadiationEmission> emitterList, Level level);

    public boolean removeRadiationEmitters(BlockPos pos, Level level);

    public List<RadiationEmission> getEmittersOfPos(BlockPos pos, Level level);

    public boolean removeEmissionOfPos(BlockPos pos, Level level, int index);
}
