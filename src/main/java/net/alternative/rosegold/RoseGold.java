package net.alternative.rosegold;

import net.alternative.rosegold.block.ModBlocks;
import net.alternative.rosegold.item.ModItemGroup;
import net.alternative.rosegold.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoseGold implements ModInitializer {
	public static final String MOD_ID = "rosegold";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}