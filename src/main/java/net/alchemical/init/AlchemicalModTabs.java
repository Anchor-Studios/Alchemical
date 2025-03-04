
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.alchemical.AlchemicalMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AlchemicalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlchemicalMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALCHEMICAL = REGISTRY.register("alchemical",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alchemical.alchemical")).icon(() -> new ItemStack(AlchemicalModItems.CRIMSON_POWDER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlchemicalModItems.WOODEN_PESTLE.get());
				tabData.accept(AlchemicalModItems.STONE_PESTLE.get());
				tabData.accept(AlchemicalModItems.IRON_PESTLE.get());
				tabData.accept(AlchemicalModItems.GOLDEN_PESTLE.get());
				tabData.accept(AlchemicalModItems.DIAMOND_PESTLE.get());
				tabData.accept(AlchemicalModItems.NETHERITE_PESTLE.get());
				tabData.accept(AlchemicalModItems.CRIMSON_POWDER.get());
				tabData.accept(AlchemicalModItems.ASH_POWDER.get());
				tabData.accept(AlchemicalModBlocks.ALCHEMY_STAND.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AlchemicalModItems.CRIMSON_POWDER.get());
			tabData.accept(AlchemicalModItems.ASH_POWDER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AlchemicalModItems.WOODEN_PESTLE.get());
			tabData.accept(AlchemicalModItems.STONE_PESTLE.get());
			tabData.accept(AlchemicalModItems.IRON_PESTLE.get());
			tabData.accept(AlchemicalModItems.GOLDEN_PESTLE.get());
			tabData.accept(AlchemicalModItems.DIAMOND_PESTLE.get());
			tabData.accept(AlchemicalModItems.NETHERITE_PESTLE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(AlchemicalModBlocks.ALCHEMY_STAND.get().asItem());
		}
	}
}
