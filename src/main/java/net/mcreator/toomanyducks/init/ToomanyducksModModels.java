
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanyducks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.toomanyducks.client.model.ModelFortnite_scar_model;
import net.mcreator.toomanyducks.client.model.ModelBullet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ToomanyducksModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBullet.LAYER_LOCATION, ModelBullet::createBodyLayer);
		event.registerLayerDefinition(ModelFortnite_scar_model.LAYER_LOCATION, ModelFortnite_scar_model::createBodyLayer);
	}
}
