package com.archi.radium.common.other;

import com.archi.radium.RadiumMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class RadiumTab extends CreativeModeTab {
    protected RadiumTab(Builder builder) {
        super(builder);
    }

    @Override
    public ResourceLocation getTabsImage() {
        return ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"textures/gui/radium_tabs.png");
    }
}
