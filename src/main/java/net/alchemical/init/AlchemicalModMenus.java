
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.alchemical.world.inventory.AlchemyStandRecipeMenu;
import net.alchemical.AlchemicalMod;

public class AlchemicalModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AlchemicalMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<AlchemyStandRecipeMenu>> ALCHEMY_STAND_RECIPE = REGISTRY.register("alchemy_stand_recipe", () -> IMenuTypeExtension.create(AlchemyStandRecipeMenu::new));
}
