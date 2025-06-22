
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.starcraft.client.renderer.ZerglingRenderer;
import net.mcreator.starcraft.client.renderer.ZealotRenderer;
import net.mcreator.starcraft.client.renderer.VulturevehicleentityRenderer;
import net.mcreator.starcraft.client.renderer.VultureRenderer;
import net.mcreator.starcraft.client.renderer.OverlordRenderer;
import net.mcreator.starcraft.client.renderer.MarineRenderer;
import net.mcreator.starcraft.client.renderer.HydraliskRenderer;
import net.mcreator.starcraft.client.renderer.GoliathvehicleRenderer;
import net.mcreator.starcraft.client.renderer.GoliathRenderer;
import net.mcreator.starcraft.client.renderer.DragoonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StarcraftModEntities.ZEALOT.get(), ZealotRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.OVERLORD.get(), OverlordRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.ZERGLING.get(), ZerglingRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.BULED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.MARINE.get(), MarineRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.GOLIATH.get(), GoliathRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.DRAGOONPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.DRAGOON.get(), DragoonRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.ACID.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.HYDRALISK.get(), HydraliskRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.VULTUREPROJECTIE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.VULTURE.get(), VultureRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.GOLIATHVEHICLE.get(), GoliathvehicleRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.VULTUREVEHICLEENTITY.get(), VulturevehicleentityRenderer::new);
	}
}
