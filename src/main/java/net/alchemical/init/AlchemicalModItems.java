
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.alchemical.item.WoodenPestleItem;
import net.alchemical.item.StonePestleItem;
import net.alchemical.item.NetheritePestleItem;
import net.alchemical.item.IronPestleItem;
import net.alchemical.item.GoldenPestleItem;
import net.alchemical.item.DiamondPestleItem;
import net.alchemical.item.CrimsonPowderItem;
import net.alchemical.item.AshPowderItem;
import net.alchemical.AlchemicalMod;

public class AlchemicalModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlchemicalMod.MODID);
	public static final DeferredItem<Item> CRIMSON_POWDER = REGISTRY.register("crimson_powder", CrimsonPowderItem::new);
	public static final DeferredItem<Item> WOODEN_PESTLE = REGISTRY.register("wooden_pestle", WoodenPestleItem::new);
	public static final DeferredItem<Item> STONE_PESTLE = REGISTRY.register("stone_pestle", StonePestleItem::new);
	public static final DeferredItem<Item> IRON_PESTLE = REGISTRY.register("iron_pestle", IronPestleItem::new);
	public static final DeferredItem<Item> GOLDEN_PESTLE = REGISTRY.register("golden_pestle", GoldenPestleItem::new);
	public static final DeferredItem<Item> DIAMOND_PESTLE = REGISTRY.register("diamond_pestle", DiamondPestleItem::new);
	public static final DeferredItem<Item> NETHERITE_PESTLE = REGISTRY.register("netherite_pestle", NetheritePestleItem::new);
	public static final DeferredItem<Item> ASH_POWDER = REGISTRY.register("ash_powder", AshPowderItem::new);
	public static final DeferredItem<Item> ALCHEMY_STAND = block(AlchemicalModBlocks.ALCHEMY_STAND);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
