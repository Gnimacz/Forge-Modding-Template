package com.your_mod;

import com.your_mod.feature.blockentities.WaterTankBlockEntity;
import com.your_mod.feature.blocks.WaterTankBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class Temp {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, YourMod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, YourMod.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, YourMod.MODID);

    public static final RegistryObject<Block>
            TEST_BLOCK = BLOCKS.register("test_block",() -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.METAL))),
            TEST_WATER_TANK = BLOCKS.register("water_tank",() -> new WaterTankBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.METAL)));

    public static final RegistryObject<Item>
            TEST_BLOCK_ITEM = ITEMS.register("test_block",() -> new BlockItem(TEST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE))),
            TEST_WATER_TANK_ITEM = ITEMS.register("water_tank",() -> new BlockItem(TEST_WATER_TANK.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockEntityType<?>>
            TEST_WATER_TANK_BLOCK_ENTITY= BLOCK_ENTITY_TYPE.register("water_tank",() -> BlockEntityType.Builder.of(WaterTankBlockEntity::new, TEST_WATER_TANK.get()).build(null));
}
