
package net.alchemical.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.GuiGraphics;

import net.alchemical.init.AlchemicalModJeiPlugin;
import net.alchemical.init.AlchemicalModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class AlchemyRecipeCategory implements IRecipeCategory<AlchemyRecipe> {
	public final static ResourceLocation UID = ResourceLocation.parse("alchemical:alchemy");
	public final static ResourceLocation TEXTURE = ResourceLocation.parse("alchemical:textures/screens/alchemy_stand_recipe.png");
	private final IDrawable background;
	private final IDrawable icon;

	public AlchemyRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 0, 0);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(AlchemicalModBlocks.ALCHEMY_STAND.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<AlchemyRecipe> getRecipeType() {
		return AlchemicalModJeiPlugin.Alchemy_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Alchemy");
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public int getWidth() {
		return this.background.getWidth();
	}

	@Override
	public int getHeight() {
		return this.background.getHeight();
	}

	@Override
	public void draw(AlchemyRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
		this.background.draw(guiGraphics);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, AlchemyRecipe recipe, IFocusGroup focuses) {
	}
}
