package com.archi.radium.common.init;

import com.archi.radium.RadiumMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RadiumItemTABS {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RadiumMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RADIUM_MAIN_TAB = CREATIVE_MODE_TABS.register("radium_main_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.radium")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> RadiumBlocks.IRRADIATED_MUD.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                /*output.accept(RadiumBlockItems.HIGHLY_IRRADIATED_MUD.get());
                output.accept(RadiumBlockItems.IRRADIATED_MUD.get());
                output.accept(RadiumBlockItems.MILDLY_IRRADIATED_MUD.get());
                output.accept(RadiumBlockItems.LOW_IRRADIATED_MUD.get());
                output.accept(RadiumBlockItems.HIGHLY_IRRADIATED_CRACKED_MUD.get());
                output.accept(RadiumBlockItems.IRRADIATED_CRACKED_MUD.get());
                output.accept(RadiumBlockItems.MILDLY_IRRADIATED_CRACKED_MUD.get());
                output.accept(RadiumBlockItems.LOW_IRRADIATED_CRACKED_MUD.get());
                output.accept(RadiumBlockItems.HIGHLY_IRRADIATED_DIRT.get());
                output.accept(RadiumBlockItems.IRRADIATED_DIRT.get());
                output.accept(RadiumBlockItems.MILDLY_IRRADIATED_DIRT.get());
                output.accept(RadiumBlockItems.LOW_IRRADIATED_DIRT.get());
                output.accept(RadiumBlockItems.HIGHLY_IRRADIATED_MUD_BRICKS.get());
                output.accept(RadiumBlockItems.IRRADIATED_MUD_BRICKS.get());
                output.accept(RadiumBlockItems.MILDLY_IRRADIATED_MUD_BRICKS.get());
                output.accept(RadiumBlockItems.LOW_IRRADIATED_MUD_BRICKS.get());

                output.accept(RadiumBlockItems.HIGHLY_IRRADIATED_MUD_BRICKS_STAIRS.get());
                output.accept(RadiumBlockItems.IRRADIATED_MUD_BRICKS_STAIRS.get());
                output.accept(RadiumBlockItems.MILDLY_IRRADIATED_MUD_BRICKS_STAIRS.get());
                output.accept(RadiumBlockItems.LOW_IRRADIATED_MUD_BRICKS_STAIRS.get());

                output.accept(RadiumBlockItems.HIGHLY_IRRADIATED_MUD_BRICKS_SLAB.get());
                output.accept(RadiumBlockItems.IRRADIATED_MUD_BRICKS_SLAB.get());
                output.accept(RadiumBlockItems.MILDLY_IRRADIATED_MUD_BRICKS_SLAB.get());
                output.accept(RadiumBlockItems.LOW_IRRADIATED_MUD_BRICKS_SLAB.get());*/
                RadiumBlocks.BLOCKS.getEntries().stream().forEach((deferredHolder)-> {
                    output.accept(deferredHolder.get().asItem());
                });
            }).build());

}
