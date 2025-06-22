
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.starcraft.block.VespingasBlock;
import net.mcreator.starcraft.block.MineralclusterBlock;
import net.mcreator.starcraft.block.MineralblockBlock;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarcraftMod.MODID);
	public static final RegistryObject<Block> MINERALBLOCK = REGISTRY.register("mineralblock", () -> new MineralblockBlock());
	public static final RegistryObject<Block> MINERALCLUSTER = REGISTRY.register("mineralcluster", () -> new MineralclusterBlock());
	public static final RegistryObject<Block> VESPINGAS = REGISTRY.register("vespingas", () -> new VespingasBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
