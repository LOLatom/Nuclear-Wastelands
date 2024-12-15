package com.archi.radium.datagen;

import com.archi.radium.RadiumMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = RadiumMod.MODID,bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper =event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookUpProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(),new LootTableProvider(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(RadiumBlockLootTableProvider::new, LootContextParamSets.BLOCK)),
                lookUpProvider));

        BlockTagsProvider blockTagsProvider = new RadiumBlockTagProvider(packOutput,lookUpProvider,existingFileHelper);


        generator.addProvider(event.includeServer(),blockTagsProvider);

        generator.addProvider(event.includeClient(), new RadiumItemModelProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeClient(), new RadiumBlockStateProvider(packOutput,existingFileHelper));
    }
}
