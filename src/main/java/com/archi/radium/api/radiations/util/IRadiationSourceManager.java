package com.archi.radium.api.radiations.util;

import com.archi.radium.api.radiations.RadiationRaysSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.LevelVersion;

import java.util.List;

public interface IRadiationSourceManager {

    public List<RadiationRaysSource> getPermanentRadiationSources(Level level);

    public void addRadiation(RadiationRaysSource source, Level level);

    public void addPermanentRadiation(RadiationRaysSource source, Level level);
}
