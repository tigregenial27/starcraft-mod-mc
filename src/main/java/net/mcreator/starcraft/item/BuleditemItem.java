
package net.mcreator.starcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BuleditemItem extends Item {
	public BuleditemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
