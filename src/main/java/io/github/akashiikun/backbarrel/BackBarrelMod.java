package io.github.akashiikun.backbarrel;

import io.github.akashiikun.backbarrel.registry.ModBlockEntities;
import io.github.akashiikun.backbarrel.registry.ModBlocks;
import io.github.akashiikun.backbarrel.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackBarrelMod implements ModInitializer {
	public static final String MOD_ID = "backbarrel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}