package com.archi.radium.datagen;

import com.archi.radium.common.init.RadiumBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class RadiumBlockLootTableProvider extends BlockLootSubProvider {

    protected RadiumBlockLootTableProvider( HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        RadiumBlocks.BLOCKS.getEntries().stream().forEach((deferredHolder)->{
            dropSelf(deferredHolder.get());
        });
        /*RadiumBlocks.ORE_BLOCKS.getEntries().stream().forEach((deferredHolder)->{
            dropSelf(deferredHolder.get());
        });*/
        /*dropOther(RadiumBlocks.LIMESTONE.get(),RadiumBlocks.COBBLED_LIMESTONE.asItem());
        dropOther(RadiumBlocks.OXIDE_LIMESTONE.get(),RadiumBlocks.COBBLED_OXIDE_LIMESTONE.asItem());

        dropOther(RadiumBlocks.GREENSLATE.get(),RadiumBlocks.COBBLED_GREENSLATE.asItem());

        //create
        dropOther(RadiumBlocks.SHALE.get(),RadiumBlocks.COBBLED_SHALE.asItem());
        dropOther(RadiumBlocks.SLIGHTLY_HARDEN_SHALE.get(),RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE.asItem());
        dropOther(RadiumBlocks.HARDEN_SHALE.get(),RadiumBlocks.HARDEN_COBBLED_SHALE.asItem());
        dropOther(RadiumBlocks.HIGHLY_HARDEN_SHALE.get(),RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE.asItem());*/
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RadiumBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
