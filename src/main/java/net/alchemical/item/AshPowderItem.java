
package net.alchemical.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AshPowderItem extends Item {
	public AshPowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
