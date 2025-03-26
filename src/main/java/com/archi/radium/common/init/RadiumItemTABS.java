package com.archi.radium.common.init;

import com.archi.radium.RadiumMod;
import com.archi.radium.common.other.RadiumTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RadiumItemTABS {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RadiumMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RADIUM_MAIN_TAB = CREATIVE_MODE_TABS.register("radium_main_tab", () -> RadiumTab.builder()
            .title(Component.translatable("itemGroup.radium")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .withTabsImage(ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"textures/gui/radium_tabs.png"))
            .icon(() -> RadiumBlocks.IRRADIATED_MUD.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {

                RadiumBlocks.BLOCKS.getEntries().stream().forEach((deferredHolder)-> {
                    output.accept(deferredHolder.get().asItem());
                });
                RadiumBlocks.ORE_BLOCKS.getEntries().stream().forEach((deferredHolder)-> {
                    output.accept(deferredHolder.get().asItem());
                });
                RadiumItems.ITEMS.getEntries().stream().forEach((deferredHolder)-> {
                    output.accept(deferredHolder.get().asItem());
                });
            }).withTabsImage(ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"textures/gui/radium_tabs.png"))
            .backgroundTexture(ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"textures/gui/radium_creative_inv.png"))
            .hideTitle().build());

}
