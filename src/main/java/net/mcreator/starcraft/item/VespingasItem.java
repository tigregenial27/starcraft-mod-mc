
package net.mcreator.starcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.starcraft.init.StarcraftModFluids;

public class VespingasItem extends BucketItem {
	public VespingasItem() {
		super(StarcraftModFluids.VESPINGAS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE));
	}
}
