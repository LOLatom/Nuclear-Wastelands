package com.archi.radium.api.radiations.helper;

import com.archi.radium.api.radiations.util.RadiationInstance;

public class RadiationHelper {


    //E = 1/2 mv²
    public static double calculateKineticEnergy(double mass, float speed) {
        return 0.5 * mass * speed * speed;
    }

    public static double calculateRadiationIntensity(double distance, float frequency, float strength) {
        return calculateEmissionPower(frequency,strength) / (distance * distance);
    }

    public static double calculateEmissionPower(float frequency, float strength) {
        return frequency * strength;
    }

    public static int geigerCounterClicks(double intensity) {
        return (int) (intensity * 10);
    }


    public static final int LIGHTSPEED = 300000000;

    public static RadiationInstance getAlpha() {
        return new RadiationInstance(4D,2,1,0.9D,1000000);
    }

    public static RadiationInstance getBeta() {
        return new RadiationInstance(0.00055D,-1,10,0.5D,200000000);
    }

    public static RadiationInstance getGamma() {
        return new RadiationInstance(0D,0,50,0.1D,LIGHTSPEED); //Penetration value is normally 100m
    }

    public static RadiationInstance getNeutron() {
        return new RadiationInstance(1D,0,30,0.3D,20000000); //Penetration value is normally 80m
    }

    public static boolean isAlphaParticle(RadiationInstance instance) {
        return instance.getMass() == 4D &&
                instance.getCharge() == 2 &&
                instance.getPenetration() == 1 &&
                instance.getIonization() == 0.9D &&
                instance.getSpeed() == 1000000;
    }

    public static boolean isBetaParticle(RadiationInstance instance) {
        return instance.getMass() == 0.00055D &&
                instance.getCharge() == -1 &&
                instance.getPenetration() == 10 &&
                instance.getIonization() == 0.5D &&
                instance.getSpeed() == 200000000;
    }

    public static boolean isGammaParticle(RadiationInstance instance) {
        return instance.getMass() == 0D &&
                instance.getCharge() == 0 &&
                instance.getPenetration() == 50 &&
                instance.getIonization() == 0.1D &&
                instance.getSpeed() == LIGHTSPEED;
    }

    public static boolean isNeutronParticle(RadiationInstance instance) {
        return instance.getMass() == 1D &&
                instance.getCharge() == 0 &&
                instance.getPenetration() == 30 &&
                instance.getIonization() == 0.3D &&
                instance.getSpeed() == 20000000;
    }

}
