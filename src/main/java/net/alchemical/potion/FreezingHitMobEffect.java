
package net.alchemical.potion;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.alchemical.init.AlchemicalModAttributes;
import net.alchemical.AlchemicalMod;

public class FreezingHitMobEffect extends MobEffect {
	public FreezingHitMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -11807755);
		this.addAttributeModifier(AlchemicalModAttributes.FREEZING_DURATION, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.freezing_hit_0"), 3, AttributeModifier.Operation.ADD_VALUE);
	}
}
