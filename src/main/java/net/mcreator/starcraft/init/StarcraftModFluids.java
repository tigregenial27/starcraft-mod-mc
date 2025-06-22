
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.starcraft.fluid.VespingasFluid;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, StarcraftMod.MODID);
	public static final RegistryObject<FlowingFluid> VESPINGAS = REGISTRY.register("vespingas", () -> new VespingasFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_VESPINGAS = REGISTRY.register("flowing_vespingas", () -> new VespingasFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(VESPINGAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VESPINGAS.get(), RenderType.translucent());
		}
	}
}
