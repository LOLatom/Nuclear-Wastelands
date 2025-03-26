package com.archi.radium.api.radiations;

import com.archi.radium.api.radiations.util.IRadiationReceiver;
import com.archi.radium.api.radiations.util.RadiationInstance;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public record RadiationReceiver(RadiationInstance radiations, float intensity) implements IRadiationReceiver {

    public static final RadiationReceiver EMPTY = new RadiationReceiver(new RadiationInstance(0D,0,0,0D,0),0F);

    public static final Codec<RadiationReceiver> CODEC = RecordCodecBuilder.create(radiationReceiverInstance ->
            radiationReceiverInstance.group(
                    RadiationInstance.CODEC.fieldOf("radiationType").forGetter(RadiationReceiver::radiations),
                    Codec.FLOAT.fieldOf("intensity").forGetter(RadiationReceiver::intensity)
            ).apply(radiationReceiverInstance, RadiationReceiver::new));

    public static final StreamCodec<ByteBuf, RadiationReceiver> STREAM_CODEC = ByteBufCodecs.fromCodec(CODEC);


    @Override
    public float getIntensity() {
        return this.intensity;
    }

    @Override
    public RadiationInstance getRadiationInstance() {
        return this.radiations;
    }
}
