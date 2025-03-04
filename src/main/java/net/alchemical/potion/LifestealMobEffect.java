
package net.alchemical.potion;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.alchemical.init.AlchemicalModAttributes;
import net.alchemical.AlchemicalMod;

public class LifestealMobEffect extends MobEffect {
	public LifestealMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407872);
		this.addAttributeModifier(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.lifesteal_0"), 25, AttributeModifier.Operation.ADD_VALUE);
	}
}
