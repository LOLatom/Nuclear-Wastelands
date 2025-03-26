package com.archi.radium.api.accessors;

import net.minecraft.server.level.ChunkHolder;

public interface ChunkMapAccessor {


    public Iterable<ChunkHolder> accessGetChunks();

}
