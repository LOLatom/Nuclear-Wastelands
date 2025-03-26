package com.archi.radium.mixin.common;

import com.archi.radium.api.accessors.ChunkMapAccessor;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ChunkMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ChunkMap.class)
public abstract class ChunkMapMixin implements ChunkMapAccessor {


    @Shadow protected abstract Iterable<ChunkHolder> getChunks();

    @Override
    public Iterable<ChunkHolder> accessGetChunks() {
        return getChunks();
    }
}
