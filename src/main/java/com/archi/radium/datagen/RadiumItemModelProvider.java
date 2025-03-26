package com.archi.radium.datagen;

import com.archi.radium.RadiumMod;
import com.archi.radium.common.init.RadiumItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RadiumItemModelProvider extends ItemModelProvider {
    public RadiumItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RadiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(RadiumItems.RAW_MONGANITE.asItem());
        basicItem(RadiumItems.RAW_LEAD.asItem());
        basicItem(RadiumItems.BERYL_CRYSTAL.asItem());
        basicItem(RadiumItems.RAW_TUNGSTEN.asItem());
        basicItem(RadiumItems.URANINITE_CRYSTAL.asItem());
        basicItem(RadiumItems.AUTUNITE_SHARD.asItem());
        basicItem(RadiumItems.AUTUNITE_CLUMP.asItem());
        basicItem(RadiumItems.AUTUNITE_CHUNK.asItem());
        basicItem(RadiumItems.NUCLEAN.asItem());


    }


}
