
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.starcraft.fluid.types.VespingasFluidType;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, StarcraftMod.MODID);
	public static final RegistryObject<FluidType> VESPINGAS_TYPE = REGISTRY.register("vespingas", () -> new VespingasFluidType());
}
