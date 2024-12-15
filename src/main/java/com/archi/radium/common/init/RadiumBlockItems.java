package com.archi.radium.common.init;

import com.archi.radium.RadiumMod;
import foundry.veil.platform.registry.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RadiumBlockItems {
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(RadiumMod.MODID);

    /*public static final DeferredItem<BlockItem> IRRADIATED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("irradiated_mud", RadiumBlocks.IRRADIATED_MUD);

    public static final DeferredItem<BlockItem> IRRADIATED_CRACKED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("irradiated_cracked_mud", RadiumBlocks.IRRADIATED_CRACKED_MUD);

    public static final DeferredItem<BlockItem> IRRADIATED_DIRT = BLOCK_ITEMS.registerSimpleBlockItem("irradiated_dirt", RadiumBlocks.IRRADIATED_DIRT);

    public static final DeferredItem<BlockItem> HIGHLY_IRRADIATED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("highly_irradiated_mud", RadiumBlocks.HIGHLY_IRRADIATED_MUD);

    public static final DeferredItem<BlockItem> HIGHLY_IRRADIATED_CRACKED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("highly_irradiated_cracked_mud", RadiumBlocks.HIGHLY_IRRADIATED_CRACKED_MUD);

    public static final DeferredItem<BlockItem> HIGHLY_IRRADIATED_DIRT = BLOCK_ITEMS.registerSimpleBlockItem("highly_irradiated_dirt", RadiumBlocks.HIGHLY_IRRADIATED_DIRT);

    public static final DeferredItem<BlockItem> MILDLY_IRRADIATED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("mildly_irradiated_mud", RadiumBlocks.MILDLY_IRRADIATED_MUD);

    public static final DeferredItem<BlockItem> MILDLY_IRRADIATED_CRACKED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("mildly_irradiated_cracked_mud", RadiumBlocks.MILDLY_IRRADIATED_CRACKED_MUD);

    public static final DeferredItem<BlockItem> MILDLY_IRRADIATED_DIRT = BLOCK_ITEMS.registerSimpleBlockItem("mildly_irradiated_dirt", RadiumBlocks.MILDLY_IRRADIATED_DIRT);

    public static final DeferredItem<BlockItem> LOW_IRRADIATED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("low_irradiated_mud", RadiumBlocks.LOW_IRRADIATED_MUD);

    public static final DeferredItem<BlockItem> LOW_IRRADIATED_CRACKED_MUD = BLOCK_ITEMS.registerSimpleBlockItem("low_irradiated_cracked_mud", RadiumBlocks.LOW_IRRADIATED_CRACKED_MUD);

    public static final DeferredItem<BlockItem> LOW_IRRADIATED_DIRT = BLOCK_ITEMS.registerSimpleBlockItem("low_irradiated_dirt", RadiumBlocks.LOW_IRRADIATED_DIRT);

    public static final DeferredItem<BlockItem> HIGHLY_IRRADIATED_MUD_BRICKS = BLOCK_ITEMS.registerSimpleBlockItem("highly_irradiated_mud_bricks", RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS);

    public static final DeferredItem<BlockItem> HIGHLY_IRRADIATED_MUD_BRICKS_STAIRS = BLOCK_ITEMS.registerSimpleBlockItem("highly_irradiated_mud_bricks_stairs", RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS_STAIRS);

    public static final DeferredItem<BlockItem> HIGHLY_IRRADIATED_MUD_BRICKS_SLAB = BLOCK_ITEMS.registerSimpleBlockItem("highly_irradiated_mud_bricks_slab", RadiumBlocks.HIGHLY_IRRADIATED_MUD_BRICKS_SLAB);

    public static final DeferredItem<BlockItem> IRRADIATED_MUD_BRICKS = BLOCK_ITEMS.registerSimpleBlockItem("irradiated_mud_bricks", RadiumBlocks.IRRADIATED_MUD_BRICKS);

    public static final DeferredItem<BlockItem> IRRADIATED_MUD_BRICKS_STAIRS = BLOCK_ITEMS.registerSimpleBlockItem("irradiated_mud_bricks_stairs", RadiumBlocks.IRRADIATED_MUD_BRICKS_STAIRS);

    public static final DeferredItem<BlockItem> IRRADIATED_MUD_BRICKS_SLAB = BLOCK_ITEMS.registerSimpleBlockItem("irradiated_mud_bricks_slab", RadiumBlocks.IRRADIATED_MUD_BRICKS_SLAB);

    public static final DeferredItem<BlockItem> MILDLY_IRRADIATED_MUD_BRICKS = BLOCK_ITEMS.registerSimpleBlockItem("mildly_irradiated_mud_bricks", RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS);

    public static final DeferredItem<BlockItem> MILDLY_IRRADIATED_MUD_BRICKS_STAIRS = BLOCK_ITEMS.registerSimpleBlockItem("mildly_irradiated_mud_bricks_stairs", RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS_STAIRS);

    public static final DeferredItem<BlockItem> MILDLY_IRRADIATED_MUD_BRICKS_SLAB = BLOCK_ITEMS.registerSimpleBlockItem("mildly_irradiated_mud_bricks_slab", RadiumBlocks.MILDLY_IRRADIATED_MUD_BRICKS_SLAB);

    public static final DeferredItem<BlockItem> LOW_IRRADIATED_MUD_BRICKS = BLOCK_ITEMS.registerSimpleBlockItem("low_irradiated_mud_bricks", RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS);

    public static final DeferredItem<BlockItem> LOW_IRRADIATED_MUD_BRICKS_STAIRS = BLOCK_ITEMS.registerSimpleBlockItem("low_irradiated_mud_bricks_stairs", RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS_STAIRS);

    public static final DeferredItem<BlockItem> LOW_IRRADIATED_MUD_BRICKS_SLAB = BLOCK_ITEMS.registerSimpleBlockItem("low_irradiated_mud_bricks_slab", RadiumBlocks.LOW_IRRADIATED_MUD_BRICKS_SLAB);


    public static final DeferredItem<BlockItem> LIMESTONE = BLOCK_ITEMS.registerSimpleBlockItem("limestone", RadiumBlocks.LIMESTONE);

    public static final DeferredItem<BlockItem> COBBLED_LIMESTONE = BLOCK_ITEMS.registerSimpleBlockItem("cobbled_limestone", RadiumBlocks.COBBLED_LIMESTONE);

    public static final DeferredItem<BlockItem> OXIDE_LIMESTONE = BLOCK_ITEMS.registerSimpleBlockItem("oxide_limestone", RadiumBlocks.OXIDE_LIMESTONE);

    public static final DeferredItem<BlockItem> COBBLED_OXIDE_LIMESTONE = BLOCK_ITEMS.registerSimpleBlockItem("cobbled_oxide_limestone", RadiumBlocks.COBBLED_OXIDE_LIMESTONE);*/

    public static void registerItemsForBlocks() {
        RadiumBlocks.STONE_BLOCKS.getEntries().stream().forEach((deferredHolder)-> {
            BLOCK_ITEMS.registerSimpleBlockItem(deferredHolder.getId().getPath(),deferredHolder);
        });
        RadiumBlocks.BLOCKS.getEntries().stream().forEach((deferredHolder)-> {
            BLOCK_ITEMS.registerSimpleBlockItem(deferredHolder.getId().getPath(),deferredHolder);
        });
    }
}
