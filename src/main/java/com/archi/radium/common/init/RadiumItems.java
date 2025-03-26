package com.archi.radium.common.init;

import com.archi.radium.RadiumMod;
import com.archi.radium.common.items.Nuclean;
import foundry.veil.platform.registry.RegistryObject;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RadiumItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RadiumMod.MODID);

    public static final DeferredItem<Item> RAW_MONGANITE = ITEMS.registerSimpleItem("raw_monganite", new Item.Properties());

    public static final DeferredItem<Item> RAW_LEAD = ITEMS.registerSimpleItem("raw_lead", new Item.Properties());

    public static final DeferredItem<Item> BERYL_CRYSTAL = ITEMS.registerSimpleItem("beryl_crystal", new Item.Properties());

    public static final DeferredItem<Item> RAW_TUNGSTEN = ITEMS.registerSimpleItem("raw_tungsten", new Item.Properties());

    public static final DeferredItem<Item> URANINITE_CRYSTAL = ITEMS.registerSimpleItem("uraninite_crystal", new Item.Properties());

    public static final DeferredItem<Item> AUTUNITE_SHARD = ITEMS.registerSimpleItem("autunite_shard", new Item.Properties());

    public static final DeferredItem<Item> AUTUNITE_CLUMP = ITEMS.registerSimpleItem("autunite_clump", new Item.Properties());

    public static final DeferredItem<Item> AUTUNITE_CHUNK = ITEMS.registerSimpleItem("autunite_chunk", new Item.Properties());

    public static final DeferredItem<Item> NUCLEAN = ITEMS.registerItem("nuclean", Nuclean::new ,new Item.Properties().stacksTo(1));

}
