package com.your_mod.feature.blockentities;

import com.your_mod.Temp;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class WaterTankBlockEntity extends BlockEntity {
    public WaterTankBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(Temp.TEST_WATER_TANK_BLOCK_ENTITY.get(), blockPos, blockState);
    }
}
