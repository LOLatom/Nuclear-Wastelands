package com.archi.radium.api.radiations;

import com.archi.radium.api.radiations.util.IRadiationSource;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public record RadiationRaysSource(float frequency, float strength, double radius, BlockPos position , boolean persistent, int ticks) implements IRadiationSource {

    public static final RadiationRaysSource EMPTY = new RadiationRaysSource(0,0,0, new BlockPos(0,0,0),false,0);

    public static final Codec<RadiationRaysSource> CODEC = RecordCodecBuilder.create(radiationRay ->
            radiationRay.group(
                    Codec.FLOAT.fieldOf("frequency").forGetter(RadiationRaysSource::frequency),
                    Codec.FLOAT.fieldOf("strength").forGetter(RadiationRaysSource::strength),
                    Codec.DOUBLE.fieldOf("radius").forGetter(RadiationRaysSource::radius),
                    BlockPos.CODEC.fieldOf("position").forGetter(RadiationRaysSource::position),
                    Codec.BOOL.fieldOf("isPersistent").forGetter(RadiationRaysSource::isPersistent),
                    Codec.INT.fieldOf("ticks").forGetter(RadiationRaysSource::ticks)
    ).apply(radiationRay,RadiationRaysSource::new));

    public static final StreamCodec<ByteBuf, RadiationRaysSource> STREAM_CODEC = ByteBufCodecs.fromCodec(CODEC);

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

    public enum RadiationType {
        BLOCK, ENTITY, ITEM
    }
}
