
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> SCWEAPONS = REGISTRY.register("scweapons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.scweapons")).icon(() -> new ItemStack(StarcraftModItems.SC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.FUSILGAUS.get());
				tabData.accept(StarcraftModItems.BLADE.get());
				tabData.accept(StarcraftModItems.GOLIATHARM.get());
				tabData.accept(StarcraftModItems.BULEDITEM.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> PROTOSSMOBS = REGISTRY.register("protossmobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.protossmobs")).icon(() -> new ItemStack(StarcraftModItems.PROTOSSLOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.ZEALOT_SPAWN_EGG.get());
				tabData.accept(StarcraftModItems.DRAGOON_SPAWN_EGG.get());
			}).withTabsBefore(SCWEAPONS.getId()).build());
	public static final RegistryObject<CreativeModeTab> ZERGMOBS = REGISTRY.register("zergmobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.zergmobs")).icon(() -> new ItemStack(StarcraftModItems.ZERGLOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.OVERLORD_SPAWN_EGG.get());
				tabData.accept(StarcraftModItems.ZERGLING_SPAWN_EGG.get());
				tabData.accept(StarcraftModItems.HYDRALISK_SPAWN_EGG.get());
			}).withTabsBefore(PROTOSSMOBS.getId()).build());
	public static final RegistryObject<CreativeModeTab> TERRANMOBS = REGISTRY.register("terranmobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.terranmobs")).icon(() -> new ItemStack(StarcraftModItems.TERRANLOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.MARINE_SPAWN_EGG.get());
				tabData.accept(StarcraftModItems.GOLIATH_SPAWN_EGG.get());
				tabData.accept(StarcraftModItems.VULTURE_SPAWN_EGG.get());
			}).withTabsBefore(ZERGMOBS.getId()).build());
	public static final RegistryObject<CreativeModeTab> SCVEICLES = REGISTRY.register("scveicles",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.scveicles")).icon(() -> new ItemStack(StarcraftModItems.SC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.GOLIATHREIDEABLEITEM.get());
				tabData.accept(StarcraftModItems.VULTUREVEHICLE.get());
			}).withTabsBefore(TERRANMOBS.getId()).build());
	public static final RegistryObject<CreativeModeTab> SCBLOCKS = REGISTRY.register("scblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.scblocks")).icon(() -> new ItemStack(StarcraftModItems.SC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.MINERAL.get());
				tabData.accept(StarcraftModBlocks.MINERALBLOCK.get().asItem());
				tabData.accept(StarcraftModBlocks.MINERALCLUSTER.get().asItem());
				tabData.accept(StarcraftModItems.VESPINGAS_BUCKET.get());
			}).withTabsBefore(SCVEICLES.getId()).build());
}
