
package net.mcreator.starcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoliatharmItem extends Item {
	public GoliatharmItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
