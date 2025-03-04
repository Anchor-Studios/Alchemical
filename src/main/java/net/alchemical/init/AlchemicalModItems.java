
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.alchemical.item.CrimsonPowderItem;
import net.alchemical.AlchemicalMod;

public class AlchemicalModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlchemicalMod.MODID);
	public static final DeferredItem<Item> CRIMSON_POWDER = REGISTRY.register("crimson_powder", CrimsonPowderItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
