
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starcraft.item.ZerglogoItem;
import net.mcreator.starcraft.item.VulturevehicleItem;
import net.mcreator.starcraft.item.VultureprojectileItem;
import net.mcreator.starcraft.item.VespingasItem;
import net.mcreator.starcraft.item.TerranlogoItem;
import net.mcreator.starcraft.item.ScItem;
import net.mcreator.starcraft.item.ProtosslogoItem;
import net.mcreator.starcraft.item.MineralItem;
import net.mcreator.starcraft.item.HidraliscoitemprojectileItem;
import net.mcreator.starcraft.item.GoliathreideableitemItem;
import net.mcreator.starcraft.item.GoliatharmItem;
import net.mcreator.starcraft.item.FusilgausItem;
import net.mcreator.starcraft.item.DraprojitemItem;
import net.mcreator.starcraft.item.BuleditemItem;
import net.mcreator.starcraft.item.BladeItem;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarcraftMod.MODID);
	public static final RegistryObject<Item> BLADE = REGISTRY.register("blade", () -> new BladeItem());
	public static final RegistryObject<Item> ZEALOT_SPAWN_EGG = REGISTRY.register("zealot_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.ZEALOT, -6711040, -16724788, new Item.Properties()));
	public static final RegistryObject<Item> OVERLORD_SPAWN_EGG = REGISTRY.register("overlord_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.OVERLORD, -10079488, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> ZERGLING_SPAWN_EGG = REGISTRY.register("zergling_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.ZERGLING, -10079488, -13434829, new Item.Properties()));
	public static final RegistryObject<Item> BULEDITEM = REGISTRY.register("buleditem", () -> new BuleditemItem());
	public static final RegistryObject<Item> FUSILGAUS = REGISTRY.register("fusilgaus", () -> new FusilgausItem());
	public static final RegistryObject<Item> MARINE_SPAWN_EGG = REGISTRY.register("marine_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.MARINE, -13421773, -16763956, new Item.Properties()));
	public static final RegistryObject<Item> GOLIATHARM = REGISTRY.register("goliatharm", () -> new GoliatharmItem());
	public static final RegistryObject<Item> GOLIATH_SPAWN_EGG = REGISTRY.register("goliath_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.GOLIATH, -10066330, -16763956, new Item.Properties()));
	public static final RegistryObject<Item> TERRANLOGO = REGISTRY.register("terranlogo", () -> new TerranlogoItem());
	public static final RegistryObject<Item> ZERGLOGO = REGISTRY.register("zerglogo", () -> new ZerglogoItem());
	public static final RegistryObject<Item> PROTOSSLOGO = REGISTRY.register("protosslogo", () -> new ProtosslogoItem());
	public static final RegistryObject<Item> SC = REGISTRY.register("sc", () -> new ScItem());
	public static final RegistryObject<Item> GOLIATHREIDEABLEITEM = REGISTRY.register("goliathreideableitem", () -> new GoliathreideableitemItem());
	public static final RegistryObject<Item> DRAPROJITEM = REGISTRY.register("draprojitem", () -> new DraprojitemItem());
	public static final RegistryObject<Item> DRAGOON_SPAWN_EGG = REGISTRY.register("dragoon_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.DRAGOON, -6711040, -16777063, new Item.Properties()));
	public static final RegistryObject<Item> HIDRALISCOITEMPROJECTILE = REGISTRY.register("hidraliscoitemprojectile", () -> new HidraliscoitemprojectileItem());
	public static final RegistryObject<Item> HYDRALISK_SPAWN_EGG = REGISTRY.register("hydralisk_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.HYDRALISK, -10079488, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> MINERAL = REGISTRY.register("mineral", () -> new MineralItem());
	public static final RegistryObject<Item> MINERALBLOCK = block(StarcraftModBlocks.MINERALBLOCK);
	public static final RegistryObject<Item> MINERALCLUSTER = block(StarcraftModBlocks.MINERALCLUSTER);
	public static final RegistryObject<Item> VULTUREPROJECTILE = REGISTRY.register("vultureprojectile", () -> new VultureprojectileItem());
	public static final RegistryObject<Item> VULTURE_SPAWN_EGG = REGISTRY.register("vulture_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.VULTURE, -10066330, -16763956, new Item.Properties()));
	public static final RegistryObject<Item> VULTUREVEHICLE = REGISTRY.register("vulturevehicle", () -> new VulturevehicleItem());
	public static final RegistryObject<Item> VESPINGAS_BUCKET = REGISTRY.register("vespingas_bucket", () -> new VespingasItem());
	public static final RegistryObject<Item> GOLIATHVEHICLE_SPAWN_EGG = REGISTRY.register("goliathvehicle_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.GOLIATHVEHICLE, -10066330, -16724788, new Item.Properties()));
	public static final RegistryObject<Item> VULTUREVEHICLEENTITY_SPAWN_EGG = REGISTRY.register("vulturevehicleentity_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.VULTUREVEHICLEENTITY, -10066330, -16737895, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
