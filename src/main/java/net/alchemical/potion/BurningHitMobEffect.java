
package net.alchemical.potion;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.alchemical.init.AlchemicalModAttributes;
import net.alchemical.AlchemicalMod;

public class BurningHitMobEffect extends MobEffect {
	public BurningHitMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39424);
		this.addAttributeModifier(AlchemicalModAttributes.BURNING_DURATION, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.burning_hit_0"), 5, AttributeModifier.Operation.ADD_VALUE);
	}
}
