
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanyducks.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.toomanyducks.block.RubberduckiumOreBlock;
import net.mcreator.toomanyducks.block.RubberduckiumBlockBlock;
import net.mcreator.toomanyducks.block.ChickenNuggetOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToomanyducksModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block RUBBERDUCKIUM_ORE = register(new RubberduckiumOreBlock());
	public static final Block RUBBERDUCKIUM_BLOCK = register(new RubberduckiumBlockBlock());
	public static final Block CHICKEN_NUGGET_ORE = register(new ChickenNuggetOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RubberduckiumOreBlock.registerRenderLayer();
		}
	}
}
