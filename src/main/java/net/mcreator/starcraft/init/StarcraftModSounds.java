
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StarcraftMod.MODID);
	public static final RegistryObject<SoundEvent> ZEALTLIVING = REGISTRY.register("zealtliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "zealtliving")));
	public static final RegistryObject<SoundEvent> HURTZEALT = REGISTRY.register("hurtzealt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "hurtzealt")));
	public static final RegistryObject<SoundEvent> HITZEALOT = REGISTRY.register("hitzealot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "hitzealot")));
	public static final RegistryObject<SoundEvent> DEADZEALOT = REGISTRY.register("deadzealot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "deadzealot")));
	public static final RegistryObject<SoundEvent> OVERLORD = REGISTRY.register("overlord", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "overlord")));
	public static final RegistryObject<SoundEvent> OVERLORDDED = REGISTRY.register("overlordded", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "overlordded")));
	public static final RegistryObject<SoundEvent> OVERLORDHURT = REGISTRY.register("overlordhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "overlordhurt")));
	public static final RegistryObject<SoundEvent> ZERGLINGDED = REGISTRY.register("zerglingded", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "zerglingded")));
	public static final RegistryObject<SoundEvent> ZERLINGLIVING = REGISTRY.register("zerlingliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "zerlingliving")));
	public static final RegistryObject<SoundEvent> MARINELIVING = REGISTRY.register("marineliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "marineliving")));
	public static final RegistryObject<SoundEvent> MARINEDEAD = REGISTRY.register("marinedead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "marinedead")));
	public static final RegistryObject<SoundEvent> GOLATIVING = REGISTRY.register("golativing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "golativing")));
	public static final RegistryObject<SoundEvent> GOLIATDEAD = REGISTRY.register("goliatdead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "goliatdead")));
	public static final RegistryObject<SoundEvent> DRAGOONDEAT = REGISTRY.register("dragoondeat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "dragoondeat")));
	public static final RegistryObject<SoundEvent> DROGOONLIVING = REGISTRY.register("drogoonliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "drogoonliving")));
	public static final RegistryObject<SoundEvent> HIDRALISCOLIVING = REGISTRY.register("hidraliscoliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "hidraliscoliving")));
	public static final RegistryObject<SoundEvent> HIDRALISCODEATH = REGISTRY.register("hidraliscodeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "hidraliscodeath")));
	public static final RegistryObject<SoundEvent> BULED = REGISTRY.register("buled", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "buled")));
	public static final RegistryObject<SoundEvent> VULTURELIVING = REGISTRY.register("vultureliving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "vultureliving")));
	public static final RegistryObject<SoundEvent> VULTUREDEATH = REGISTRY.register("vulturedeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "vulturedeath")));
	public static final RegistryObject<SoundEvent> VULTUREATTACK = REGISTRY.register("vultureattack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "vultureattack")));
}
