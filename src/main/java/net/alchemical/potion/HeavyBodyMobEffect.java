
package net.alchemical.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.alchemical.AlchemicalMod;

public class HeavyBodyMobEffect extends MobEffect {
	public HeavyBodyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -12035747);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.heavy_body_0"), 3, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.heavy_body_1"), 0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.heavy_body_2"), -0.15, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(AlchemicalMod.MODID, "effect.heavy_body_3"), -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
	}
}
