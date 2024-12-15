package com.archi.radium.datagen;

import com.archi.radium.RadiumMod;
import com.archi.radium.common.init.RadiumBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class RadiumBlockStateProvider extends BlockStateProvider {

    public RadiumBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RadiumMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(RadiumBlocks.HIGHLY_IRRADIATED_MUD);
        blockWithItem(RadiumBlocks.IRRADIATED_MUD);
        blockWithItem(RadiumBlocks.MILDLY_IRRADIATED_MUD);
        blockWithItem(RadiumBlocks.LOW_IRRADIATED_MUD);

        blockWithItem(RadiumBlocks.HIGHLY_IRRADIATED_CRACKED_MUD);
        blockWithItem(RadiumBlocks.IRRADIATED_CRACKED_MUD);
        blockWithItem(RadiumBlocks.MILDLY_IRRADIATED_CRACKED_MUD);
        blockWithItem(RadiumBlocks.LOW_IRRADIATED_CRACKED_MUD);

        blockWithItem(RadiumBlocks.HIGHLY_IRRADIATED_DIRT);
        blockWithItem(RadiumBlocks.IRRADIATED_DIRT);
        blockWithItem(RadiumBlocks.MILDLY_IRRADIATED_DIRT);
        blockWithItem(RadiumBlocks.LOW_IRRADIATED_DIRT);

        blockWithItem(RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS);
        blockWithItem(RadiumBlocks.IRRADIATED_MUD_BRICKS);
        blockWithItem(RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS);
        blockWithItem(RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS);

        stairsWithItem(RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS_STAIRS,RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS);
        stairsWithItem(RadiumBlocks.IRRADIATED_MUD_BRICKS_STAIRS,RadiumBlocks.IRRADIATED_MUD_BRICKS);
        stairsWithItem(RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS_STAIRS,RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS);
        stairsWithItem(RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS_STAIRS,RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS);
        slabWithItem(RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS_SLAB,RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS);
        slabWithItem(RadiumBlocks.IRRADIATED_MUD_BRICKS_SLAB,RadiumBlocks.IRRADIATED_MUD_BRICKS);
        slabWithItem(RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS_SLAB,RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS);
        slabWithItem(RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS_SLAB,RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS);

        blockWithItem(RadiumBlocks.LIMESTONE);
        blockWithItem(RadiumBlocks.COBBLED_LIMESTONE);
        blockWithItem(RadiumBlocks.OXIDE_LIMESTONE);
        blockWithItem(RadiumBlocks.COBBLED_OXIDE_LIMESTONE);

        everythingWithItem(RadiumBlocks.GREENSLATE_STAIRS,RadiumBlocks.GREENSLATE_SLAB,RadiumBlocks.GREENSLATE);

        everythingWithItem(RadiumBlocks.COBBLED_GREENSLATE_STAIRS,RadiumBlocks.COBBLED_GREENSLATE_SLAB,RadiumBlocks.COBBLED_GREENSLATE);


        everythingWithItem(RadiumBlocks.SHALE_STAIRS,RadiumBlocks.SHALE_SLAB,RadiumBlocks.SHALE);
        everythingWithItem(RadiumBlocks.SLIGHTLY_HARDEN_SHALE_STAIRS,RadiumBlocks.SLIGHTLY_HARDEN_SHALE_SLAB,RadiumBlocks.SLIGHTLY_HARDEN_SHALE);
        everythingWithItem(RadiumBlocks.HARDEN_SHALE_STAIRS,RadiumBlocks.HARDEN_SHALE_SLAB,RadiumBlocks.HARDEN_SHALE);
        everythingWithItem(RadiumBlocks.HIGHLY_HARDEN_SHALE_STAIRS,RadiumBlocks.HIGHLY_HARDEN_SHALE_SLAB,RadiumBlocks.HIGHLY_HARDEN_SHALE);

        everythingWithItem(RadiumBlocks.COBBLED_SHALE_STAIRS,RadiumBlocks.COBBLED_SHALE_SLAB,RadiumBlocks.COBBLED_SHALE);
        everythingWithItem(RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE_STAIRS,RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE_SLAB,RadiumBlocks.SLIGHTLY_HARDEN_COBBLED_SHALE);
        everythingWithItem(RadiumBlocks.HARDEN_COBBLED_SHALE_STAIRS,RadiumBlocks.HARDEN_COBBLED_SHALE_SLAB,RadiumBlocks.HARDEN_COBBLED_SHALE);
        everythingWithItem(RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE_STAIRS,RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE_SLAB,RadiumBlocks.HIGHLY_HARDEN_COBBLED_SHALE);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
    }
    private void slabWithItem(DeferredBlock<?> deferredBlock, DeferredBlock<?> base) {
        slabBlock((SlabBlock) deferredBlock.get(), blockTexture(base.get()),blockTexture(base.get()));
        this.simpleBlockItem(deferredBlock.get(), models().slab(name(deferredBlock.get()),blockTexture(base.get()),blockTexture(base.get()),blockTexture(base.get())));
    }
    private void stairsWithItem(DeferredBlock<?> deferredBlock, DeferredBlock<?> base) {
        stairsBlock((StairBlock) deferredBlock.get(), blockTexture(base.get()));
        this.simpleBlockItem(deferredBlock.get(), models().stairs(name(deferredBlock.get()),blockTexture(base.get()),blockTexture(base.get()),blockTexture(base.get())));
    }
    private void everythingWithItem(DeferredBlock<?> stairs,DeferredBlock<?> slab, DeferredBlock<?> base) {
        blockWithItem(base);
        stairsWithItem(stairs,base);
        slabWithItem(slab,base);
    }

    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return this.key(block).getPath();
    }



}
