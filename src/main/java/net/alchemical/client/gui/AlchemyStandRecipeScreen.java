package net.alchemical.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.alchemical.world.inventory.AlchemyStandRecipeMenu;
import net.alchemical.procedures.CraftArrow9Procedure;
import net.alchemical.procedures.CraftArrow99Procedure;
import net.alchemical.procedures.CraftArrow999Procedure;
import net.alchemical.procedures.CraftArrow998Procedure;
import net.alchemical.procedures.CraftArrow997Procedure;
import net.alchemical.procedures.CraftArrow996Procedure;
import net.alchemical.procedures.CraftArrow995Procedure;
import net.alchemical.procedures.CraftArrow994Procedure;
import net.alchemical.procedures.CraftArrow993Procedure;
import net.alchemical.procedures.CraftArrow992Procedure;
import net.alchemical.procedures.CraftArrow991Procedure;
import net.alchemical.procedures.CraftArrow98Procedure;
import net.alchemical.procedures.CraftArrow97Procedure;
import net.alchemical.procedures.CraftArrow96Procedure;
import net.alchemical.procedures.CraftArrow95Procedure;
import net.alchemical.procedures.CraftArrow94Procedure;
import net.alchemical.procedures.CraftArrow93Procedure;
import net.alchemical.procedures.CraftArrow92Procedure;
import net.alchemical.procedures.CraftArrow91Procedure;
import net.alchemical.procedures.CraftArrow8Procedure;
import net.alchemical.procedures.CraftArrow7Procedure;
import net.alchemical.procedures.CraftArrow6Procedure;
import net.alchemical.procedures.CraftArrow5Procedure;
import net.alchemical.procedures.CraftArrow4Procedure;
import net.alchemical.procedures.CraftArrow3Procedure;
import net.alchemical.procedures.CraftArrow2Procedure;
import net.alchemical.procedures.CraftArrow1Procedure;

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

		if (CraftArrow1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow_right.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/plus.png"), this.leftPos + 36, this.topPos + 32, 0, 0, 7, 8, 7, 8);

		guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/redstone_place.png"), this.leftPos + 32, this.topPos + 47, 0, 0, 16, 16, 16, 16);

		if (CraftArrow2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow1.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow2.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow3.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow4.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow5.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow6.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow7.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow8.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow91Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow9.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow92Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow91.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow93Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow92.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow94Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow93.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow95Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow94.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow96Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow95.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow97Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow96.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow98Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow97.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow99Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow98.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow991Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow99.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow992Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow991.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow993Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow992.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow994Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow993.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow995Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow994.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow996Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow995.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow997Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow996.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow998Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow997.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
		if (CraftArrow999Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("alchemical:textures/screens/arrow998.png"), this.leftPos + 79, this.topPos + 32, 0, 0, 26, 8, 26, 8);
		}
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
