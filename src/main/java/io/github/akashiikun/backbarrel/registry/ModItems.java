package io.github.akashiikun.backbarrel.registry;

import io.github.akashiikun.backbarrel.BackBarrelMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BackBarrelMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.accept(ModBlocks.BACK_BARREL);
    }

    public static void registerModItems() {
        BackBarrelMod.LOGGER.info("Registering Mod Items for " + BackBarrelMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(ModItems::itemGroupIngredients);
    }
}
