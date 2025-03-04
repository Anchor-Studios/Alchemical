
package net.alchemical.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.component.DataComponents;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiBrewingRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class AlchemicalModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("alchemical:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		List<ItemStack> ingredientStack = new ArrayList<>();
		List<ItemStack> inputStack = new ArrayList<>();
		ingredientStack.add(new ItemStack(Items.BLAZE_POWDER));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.STRENGTH));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.FIERY_BLOWS));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.REDSTONE));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.FIERY_BLOWS));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.LONG_FIERY_BLOWS));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.GLOWSTONE_DUST));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.FIERY_BLOWS));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.STRONG_FIERY_BLOWS));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.SNOWBALL));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.STRENGTH));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.ICY_GRASP));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.REDSTONE));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.ICY_GRASP));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.LONG_ICY_GRASP));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.REDSTONE));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.ICY_GRASP));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.STRONG_ICY_GRASP));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.RAW_IRON));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.RESISTANCE));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.IRON_WEIGHT));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.GLOWSTONE_DUST));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.IRON_WEIGHT));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.STRONG_IRON_WEIGHT));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.IRON_NUGGET));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.AWKWARD));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.RESISTANCE));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.REDSTONE));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.RESISTANCE));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.LONG_RESISTANCE));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.GLOWSTONE_DUST));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.RESISTANCE));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.STRONG_RESISTANCE));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Blocks.RED_SHULKER_BOX));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.REGENERATION));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.VAMPIRIC));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.REDSTONE));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.VAMPIRIC));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.LONG_VAMPIRIC));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.GLOWSTONE_DUST));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.VAMPIRIC));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(AlchemicalModPotions.STRONG_VAMPIRIC));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}
