package com.archi.radium.api.radiations.util;

public interface IRadiationEmitter {

    boolean isPersistent();

    float getTicks();

    float getFrequency();

    float getStrength();

    double getRadius();

    RadiationInstance getParticleEmitted();
}
