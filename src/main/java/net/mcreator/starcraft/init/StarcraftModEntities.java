
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.starcraft.entity.ZerglingEntity;
import net.mcreator.starcraft.entity.ZealotEntity;
import net.mcreator.starcraft.entity.VulturevehicleentityEntity;
import net.mcreator.starcraft.entity.VultureprojectieEntity;
import net.mcreator.starcraft.entity.VultureEntity;
import net.mcreator.starcraft.entity.OverlordEntity;
import net.mcreator.starcraft.entity.MarineEntity;
import net.mcreator.starcraft.entity.HydraliskEntity;
import net.mcreator.starcraft.entity.GoliathvehicleEntity;
import net.mcreator.starcraft.entity.GoliathEntity;
import net.mcreator.starcraft.entity.DragoonprojectileEntity;
import net.mcreator.starcraft.entity.DragoonEntity;
import net.mcreator.starcraft.entity.BuledEntity;
import net.mcreator.starcraft.entity.AcidEntity;
import net.mcreator.starcraft.StarcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StarcraftMod.MODID);
	public static final RegistryObject<EntityType<ZealotEntity>> ZEALOT = register("zealot",
			EntityType.Builder.<ZealotEntity>of(ZealotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZealotEntity::new).fireImmune().sized(0.6f, 2.8f));
	public static final RegistryObject<EntityType<OverlordEntity>> OVERLORD = register("overlord",
			EntityType.Builder.<OverlordEntity>of(OverlordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OverlordEntity::new)

					.sized(2.2f, 3.6f));
	public static final RegistryObject<EntityType<ZerglingEntity>> ZERGLING = register("zergling",
			EntityType.Builder.<ZerglingEntity>of(ZerglingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZerglingEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<BuledEntity>> BULED = register("buled",
			EntityType.Builder.<BuledEntity>of(BuledEntity::new, MobCategory.MISC).setCustomClientFactory(BuledEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MarineEntity>> MARINE = register("marine",
			EntityType.Builder.<MarineEntity>of(MarineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarineEntity::new)

					.sized(0.6f, 2.3f));
	public static final RegistryObject<EntityType<GoliathEntity>> GOLIATH = register("goliath",
			EntityType.Builder.<GoliathEntity>of(GoliathEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoliathEntity::new)

					.sized(3.2f, 4f));
	public static final RegistryObject<EntityType<DragoonprojectileEntity>> DRAGOONPROJECTILE = register("dragoonprojectile", EntityType.Builder.<DragoonprojectileEntity>of(DragoonprojectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DragoonprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DragoonEntity>> DRAGOON = register("dragoon",
			EntityType.Builder.<DragoonEntity>of(DragoonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragoonEntity::new).fireImmune().sized(4.4f, 2.6f));
	public static final RegistryObject<EntityType<AcidEntity>> ACID = register("acid",
			EntityType.Builder.<AcidEntity>of(AcidEntity::new, MobCategory.MISC).setCustomClientFactory(AcidEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HydraliskEntity>> HYDRALISK = register("hydralisk",
			EntityType.Builder.<HydraliskEntity>of(HydraliskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HydraliskEntity::new)

					.sized(0.6f, 2.5f));
	public static final RegistryObject<EntityType<VultureprojectieEntity>> VULTUREPROJECTIE = register("vultureprojectie", EntityType.Builder.<VultureprojectieEntity>of(VultureprojectieEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VultureprojectieEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(1f, 1f));
	public static final RegistryObject<EntityType<VultureEntity>> VULTURE = register("vulture",
			EntityType.Builder.<VultureEntity>of(VultureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VultureEntity::new)

					.sized(5.5f, 1.8f));
	public static final RegistryObject<EntityType<GoliathvehicleEntity>> GOLIATHVEHICLE = register("goliathvehicle",
			EntityType.Builder.<GoliathvehicleEntity>of(GoliathvehicleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoliathvehicleEntity::new)

					.sized(3.2f, 4f));
	public static final RegistryObject<EntityType<VulturevehicleentityEntity>> VULTUREVEHICLEENTITY = register("vulturevehicleentity",
			EntityType.Builder.<VulturevehicleentityEntity>of(VulturevehicleentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(VulturevehicleentityEntity::new)

					.sized(5.5f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZealotEntity.init();
			OverlordEntity.init();
			ZerglingEntity.init();
			MarineEntity.init();
			GoliathEntity.init();
			DragoonEntity.init();
			HydraliskEntity.init();
			VultureEntity.init();
			GoliathvehicleEntity.init();
			VulturevehicleentityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZEALOT.get(), ZealotEntity.createAttributes().build());
		event.put(OVERLORD.get(), OverlordEntity.createAttributes().build());
		event.put(ZERGLING.get(), ZerglingEntity.createAttributes().build());
		event.put(MARINE.get(), MarineEntity.createAttributes().build());
		event.put(GOLIATH.get(), GoliathEntity.createAttributes().build());
		event.put(DRAGOON.get(), DragoonEntity.createAttributes().build());
		event.put(HYDRALISK.get(), HydraliskEntity.createAttributes().build());
		event.put(VULTURE.get(), VultureEntity.createAttributes().build());
		event.put(GOLIATHVEHICLE.get(), GoliathvehicleEntity.createAttributes().build());
		event.put(VULTUREVEHICLEENTITY.get(), VulturevehicleentityEntity.createAttributes().build());
	}
}
