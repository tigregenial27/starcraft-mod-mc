
package net.mcreator.starcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ProtosslogoItem extends Item {
	public ProtosslogoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
