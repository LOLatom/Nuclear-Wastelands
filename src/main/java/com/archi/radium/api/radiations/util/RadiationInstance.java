package com.archi.radium.api.radiations.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public record RadiationInstance(double mass, int charge, int penetration, double ionization, int speed) implements IRadiationInstance {

    public static final Codec<RadiationInstance> CODEC = RecordCodecBuilder.create(radInstance ->
            radInstance.group(
                    Codec.DOUBLE.fieldOf("mass").forGetter(RadiationInstance::mass),
                    Codec.INT.fieldOf("charge").forGetter(RadiationInstance::charge),
                    Codec.INT.fieldOf("penetration").forGetter(RadiationInstance::penetration),
                    Codec.DOUBLE.fieldOf("ionization").forGetter(RadiationInstance::ionization),
                    Codec.INT.fieldOf("speed").forGetter(RadiationInstance::speed)
            ).apply(radInstance,RadiationInstance::new));

    public static final StreamCodec<ByteBuf, RadiationInstance> STREAM_CODEC = ByteBufCodecs.fromCodec(CODEC);



    @Override
    public double getMass() {
        return this.mass;
    }

    @Override
    public int getCharge() {
        return this.charge;
    }

    @Override
    public int getPenetration() {
        return this.penetration;
    }

    @Override
    public double getIonization() {
        return this.ionization;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }
}
