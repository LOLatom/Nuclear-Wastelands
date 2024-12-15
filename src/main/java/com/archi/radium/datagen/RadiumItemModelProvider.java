package com.archi.radium.datagen;

import com.archi.radium.RadiumMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RadiumItemModelProvider extends ItemModelProvider {
    public RadiumItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RadiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //basicItem();

    }
}
