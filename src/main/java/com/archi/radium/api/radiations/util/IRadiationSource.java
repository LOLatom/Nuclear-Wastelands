package com.archi.radium.api.radiations.util;

public interface IRadiationSource {

    boolean isPersistent();

    float getTicks();

    float getFrequency();

    float getStrength();

    double getRadius();
}
