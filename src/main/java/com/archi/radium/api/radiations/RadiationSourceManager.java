package com.archi.radium.api.radiations;

import com.archi.radium.api.radiations.util.IRadiationSourceManager;
import net.minecraft.world.level.Level;

import java.util.List;

public class RadiationSourceManager implements IRadiationSourceManager {
    @Override
    public List<RadiationRaysSource> getPermanentRadiationSources(Level level) {
        return List.of();
    }

    @Override
    public void addRadiation(RadiationRaysSource source, Level level) {

    }
}
