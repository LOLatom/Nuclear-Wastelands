package com.archi.radium.worldgen.registries;

import com.archi.radium.RadiumMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;

public class RadiumDimension {

    public static final ResourceKey<LevelStem> RADIUM_WORLD_STEM = ResourceKey.create(Registries.LEVEL_STEM,
            ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"the_wastelands"));

    public static final ResourceKey<Level> RADIUM_WORLD_KEY = ResourceKey.create(Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"the_wastelands"));

    public static final ResourceKey<DimensionType> RADIUM_WORLD_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            ResourceLocation.fromNamespaceAndPath(RadiumMod.MODID,"the_wastelands_type"));

}
