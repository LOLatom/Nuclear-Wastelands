package com.archi.radium.datagen;

import com.archi.radium.RadiumMod;
import com.archi.radium.common.init.RadiumBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RadiumBlockTagProvider extends BlockTagsProvider {
    public RadiumBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RadiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // is MINED WITH A PICKAXE !!!!!
        //
        //

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RadiumBlocks.HIGHLY_IRRADIATED_MUD.get())
                .add(RadiumBlocks.IRRADIATED_MUD.get())
                .add(RadiumBlocks.MILDLY_IRRADIATED_MUD.get())
                .add(RadiumBlocks.LOW_IRRADIATED_MUD.get())

                .add(RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS.get())
                .add(RadiumBlocks.IRRADIATED_MUD_BRICKS.get())
                .add(RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS.get())
                .add(RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS.get())

                .add(RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS_SLAB.get())
                .add(RadiumBlocks.IRRADIATED_MUD_BRICKS_SLAB.get())
                .add(RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS_SLAB.get())
                .add(RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS_SLAB.get())

                .add(RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS_STAIRS.get())
                .add(RadiumBlocks.IRRADIATED_MUD_BRICKS_STAIRS.get())
                .add(RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS_STAIRS.get())
                .add(RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS_STAIRS.get())

                .add(RadiumBlocks.LIMESTONE.get())
                .add(RadiumBlocks.COBBLED_LIMESTONE.get())
                .add(RadiumBlocks.OXIDE_LIMESTONE.get())
                .add(RadiumBlocks.COBBLED_OXIDE_LIMESTONE.get())

                .add(RadiumBlocks.SHALE.get())
                .add(RadiumBlocks.SHALE_SLAB.get())
                .add(RadiumBlocks.SHALE_STAIRS.get())

                .add(RadiumBlocks.COBBLED_SHALE.get())
                .add(RadiumBlocks.COBBLED_SHALE_SLAB.get())
                .add(RadiumBlocks.COBBLED_SHALE_STAIRS.get())

                .add(RadiumBlocks.SLIGHTLY_HARDEN_SHALE.get())
                .add(RadiumBlocks.SLIGHTLY_HARDEN_SHALE_SLAB.get())
                .add(RadiumBlocks.SLIGHTLY_HARDEN_SHALE_STAIRS.get())

                .add(RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE.get())
                .add(RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE_SLAB.get())
                .add(RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE_STAIRS.get())

                .add(RadiumBlocks.HARDEN_SHALE.get())
                .add(RadiumBlocks.HARDEN_SHALE_SLAB.get())
                .add(RadiumBlocks.HARDEN_SHALE_STAIRS.get())

                .add(RadiumBlocks.HARDEN_COBBLED_SHALE.get())
                .add(RadiumBlocks.HARDEN_COBBLED_SHALE_SLAB.get())
                .add(RadiumBlocks.HARDEN_COBBLED_SHALE_STAIRS.get())

                .add(RadiumBlocks.HIGHLY_HARDEN_SHALE.get())
                .add(RadiumBlocks.HIGHLY_HARDEN_SHALE_SLAB.get())
                .add(RadiumBlocks.HIGHLY_HARDEN_SHALE_STAIRS.get())

                .add(RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE.get())
                .add(RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE_SLAB.get())
                .add(RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE_STAIRS.get())

                .add(RadiumBlocks.GREENSLATE.get())
                .add(RadiumBlocks.GREENSLATE_SLAB.get())
                .add(RadiumBlocks.GREENSLATE_STAIRS.get())

                .add(RadiumBlocks.COBBLED_GREENSLATE.get())
                .add(RadiumBlocks.COBBLED_GREENSLATE_SLAB.get())
                .add(RadiumBlocks.COBBLED_GREENSLATE_STAIRS.get())

                .add(RadiumBlocks.MONGANITE_ORE.get())
                .add(RadiumBlocks.LEAD_ORE.get())
                .add(RadiumBlocks.BERYL_ORE.get())
                .add(RadiumBlocks.LIMESTONE_COAL_ORE.get())
                .add(RadiumBlocks.TUNGSTEN_ORE.get())
                .add(RadiumBlocks.URANINITE_ORE.get())
                .add(RadiumBlocks.AUTUNITE_ORE.get());






        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(RadiumBlocks.HIGHLY_IRRADIATED_DIRT.get())
                .add(RadiumBlocks.IRRADIATED_DIRT.get())
                .add(RadiumBlocks.MILDLY_IRRADIATED_DIRT.get())
                .add(RadiumBlocks.LOW_IRRADIATED_DIRT.get())

                .add(RadiumBlocks.HIGHLY_IRRADIATED_CRACKED_MUD.get())
                .add(RadiumBlocks.IRRADIATED_CRACKED_MUD.get())
                .add(RadiumBlocks.MILDLY_IRRADIATED_CRACKED_MUD.get())
                .add(RadiumBlocks.LOW_IRRADIATED_CRACKED_MUD.get());


    }
}
