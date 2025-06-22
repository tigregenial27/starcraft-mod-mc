
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starcraft.client.model.Modelzealot;
import net.mcreator.starcraft.client.model.Modeloverlord;
import net.mcreator.starcraft.client.model.Modelmarine;
import net.mcreator.starcraft.client.model.Modelgoliad;
import net.mcreator.starcraft.client.model.Modeldragoon;
import net.mcreator.starcraft.client.model.ModelVulture;
import net.mcreator.starcraft.client.model.ModelHydralisk;
import net.mcreator.starcraft.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarcraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modeloverlord.LAYER_LOCATION, Modeloverlord::createBodyLayer);
		event.registerLayerDefinition(ModelVulture.LAYER_LOCATION, ModelVulture::createBodyLayer);
		event.registerLayerDefinition(Modelmarine.LAYER_LOCATION, Modelmarine::createBodyLayer);
		event.registerLayerDefinition(Modelgoliad.LAYER_LOCATION, Modelgoliad::createBodyLayer);
		event.registerLayerDefinition(Modeldragoon.LAYER_LOCATION, Modeldragoon::createBodyLayer);
		event.registerLayerDefinition(Modelzealot.LAYER_LOCATION, Modelzealot::createBodyLayer);
		event.registerLayerDefinition(ModelHydralisk.LAYER_LOCATION, ModelHydralisk::createBodyLayer);
	}
}
