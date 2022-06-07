
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanyducks.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.toomanyducks.world.biome.RubberLandsBiome;
import net.mcreator.toomanyducks.ToomanyducksMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToomanyducksModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome RUBBER_LANDS = register("rubber_lands", RubberLandsBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(ToomanyducksMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RubberLandsBiome.init();
		});
	}
}
