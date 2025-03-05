package net.alchemical.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.alchemical.world.inventory.AlchemyStandRecipeMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AlchemyStandRecipeScreen extends AbstractContainerScreen<AlchemyStandRecipeMenu> {
	private final static HashMap<String, Object> guistate = AlchemyStandRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AlchemyStandRecipeScreen(AlchemyStandRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("alchemical:textures/screens/alchemy_stand_recipe.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/energy_bar_50.png"), this.leftPos + 143, this.topPos + 6, 0, 0, 25, 46, 25, 46);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/powder_slot.png"), this.leftPos + 148, this.topPos + 56, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow_right.png"), this.leftPos + 64, this.topPos + 37, 0, 0, 26, 8, 26, 8);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/plus.png"), this.leftPos + 33, this.topPos + 37, 0, 0, 7, 8, 7, 8);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/potion_slot.png"), this.leftPos + 13, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/redstone_place.png"), this.leftPos + 44, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.alchemical.alchemy_stand_recipe.label_alchemy_stand"), 6, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.alchemical.alchemy_stand_recipe.label_inventory"), 6, 72, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
