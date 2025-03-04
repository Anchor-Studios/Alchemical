
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.alchemical.client.gui.AlchemyStandRecipeScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlchemicalModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AlchemicalModMenus.ALCHEMY_STAND_RECIPE.get(), AlchemyStandRecipeScreen::new);
	}
}
