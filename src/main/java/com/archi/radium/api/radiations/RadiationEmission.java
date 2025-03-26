package com.archi.radium.api.radiations;

import com.archi.radium.api.radiations.util.IRadiationEmitter;
import com.archi.radium.api.radiations.util.RadiationInstance;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public record RadiationEmission(RadiationInstance radiationInstance, float frequency, float strength, double radius, BlockPos position , boolean persistent, int ticks) implements IRadiationEmitter {

    public static final RadiationEmission EMPTY = new RadiationEmission(new RadiationInstance(0D,0,0,0D,0),0,0,0, new BlockPos(0,0,0),false,0);

    public static final Codec<RadiationEmission> CODEC = RecordCodecBuilder.create(radiationRay ->
            radiationRay.group(
                    RadiationInstance.CODEC.fieldOf("radiationType").forGetter(RadiationEmission::radiationInstance),
                    Codec.FLOAT.fieldOf("frequency").forGetter(RadiationEmission::frequency),
                    Codec.FLOAT.fieldOf("strength").forGetter(RadiationEmission::strength),
                    Codec.DOUBLE.fieldOf("radius").forGetter(RadiationEmission::radius),
                    BlockPos.CODEC.fieldOf("position").forGetter(RadiationEmission::position),
                    Codec.BOOL.fieldOf("isPersistent").forGetter(RadiationEmission::isPersistent),
                    Codec.INT.fieldOf("ticks").forGetter(RadiationEmission::ticks)
    ).apply(radiationRay, RadiationEmission::new));

    public static final StreamCodec<ByteBuf, RadiationEmission> STREAM_CODEC = ByteBufCodecs.fromCodec(CODEC);

    @Override
    public boolean isPersistent() {
        return this.persistent;
    }

    @Override
    public float getTicks() {
        return this.ticks;
    }

    @Override
    public float getFrequency() {
        return this.frequency;
    }

    @Override
    public float getStrength() {
        return this.strength;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public RadiationInstance getParticleEmitted() {
        return this.radiationInstance;
    }

    public enum RadiationType {
        BLOCK, ENTITY, ITEM
    }
}
