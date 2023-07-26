package io.github.akashiikun.backbarrel.registry;

import io.github.akashiikun.backbarrel.BackBarrelMod;
import io.github.akashiikun.backbarrel.block.entity.BackBarrelBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;


public class ModBlockEntities {
    public static final BlockEntityType<BackBarrelBlockEntity> BACK_BARREL = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(BackBarrelMod.MOD_ID, "back_barrel"), FabricBlockEntityTypeBuilder.create(BackBarrelBlockEntity::new, ModBlocks.BACK_BARREL).build());

    public static void registerBlockEntities() {
        BackBarrelMod.LOGGER.info("Registering Block Entities for " + BackBarrelMod.MOD_ID);
    }
}
