package com.archi.radium.common.blocks.ores;

import com.archi.radium.api.radiations.RadiationEmission;
import com.archi.radium.api.radiations.RadiationHandler;
import com.archi.radium.api.radiations.helper.RadiationHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class UraniniteOre extends Block {

    public UraniniteOre(Properties properties) {
        super(properties);
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        List<RadiationEmission> emitterList = new ArrayList<>();
        emitterList.add(new RadiationEmission(RadiationHelper.getGamma(),120,0.5F,10,pos,true,0));
        emitterList.add(new RadiationEmission(RadiationHelper.getAlpha(),40,3F,2,pos,true,0));
        emitterList.add(new RadiationEmission(RadiationHelper.getBeta(),80,1.5F,5,pos,true,0));
        RadiationHandler.addRadiationEmitters(level,emitterList);
    }

    @Override
    protected void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        super.onRemove(state, level, pos, newState, movedByPiston);
        RadiationHandler.removeRadiationEmitters(level,pos);
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.tick(state, level, pos, random);
        System.out.println(RadiationHandler.getEmittersOfPos(level,pos));
        //state.getTags().
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(state, level, pos, random);
        System.out.println(RadiationHandler.getEmittersOfPos(level,pos));
    }
}
