
package net.alchemical.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.alchemical.jei_recipes.AlchemyRecipeCategory;
import net.alchemical.jei_recipes.AlchemyRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;

@JeiPlugin
public class AlchemicalModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<AlchemyRecipe> Alchemy_Type = new mezz.jei.api.recipe.RecipeType<>(AlchemyRecipeCategory.UID, AlchemyRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("alchemical:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new AlchemyRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<AlchemyRecipe> AlchemyRecipes = recipeManager.getAllRecipesFor(AlchemyRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(Alchemy_Type, AlchemyRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(AlchemicalModBlocks.ALCHEMY_STAND.get().asItem()), Alchemy_Type);
	}
}
