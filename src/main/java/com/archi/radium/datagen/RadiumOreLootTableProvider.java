package com.archi.radium.datagen;

import com.archi.radium.common.init.RadiumBlockItems;
import com.archi.radium.common.init.RadiumBlocks;
import com.archi.radium.common.init.RadiumItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class RadiumOreLootTableProvider extends BlockLootSubProvider {
    public RadiumOreLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }


    @Override
    protected void generate() {
        dropOther(RadiumBlocks.MONGANITE_ORE.get(), RadiumItems.RAW_MONGANITE.get());
        dropOther(RadiumBlocks.LEAD_ORE.get(), RadiumItems.RAW_LEAD.get());
        dropOther(RadiumBlocks.BERYL_ORE.get(), RadiumItems.BERYL_CRYSTAL.get());
        dropOther(RadiumBlocks.TUNGSTEN_ORE.get(), RadiumItems.RAW_TUNGSTEN.get());
        dropOther(RadiumBlocks.LIMESTONE_COAL_ORE.get(), Items.COAL);
        dropOther(RadiumBlocks.URANINITE_ORE.get(), RadiumItems.URANINITE_CRYSTAL.get());
        dropSelf(RadiumBlocks.AUTUNITE_ORE.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RadiumBlocks.ORE_BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
