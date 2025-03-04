
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.alchemical.AlchemicalMod;

public class AlchemicalModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, AlchemicalMod.MODID);
	public static final DeferredHolder<Potion, Potion> FIERY_BLOWS = REGISTRY.register("fiery_blows", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.BURNING_HIT, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> LONG_FIERY_BLOWS = REGISTRY.register("long_fiery_blows", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.BURNING_HIT, 9600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> STRONG_FIERY_BLOWS = REGISTRY.register("strong_fiery_blows", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.BURNING_HIT, 1600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> ICY_GRASP = REGISTRY.register("icy_grasp", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.FREEZING_HIT, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> LONG_ICY_GRASP = REGISTRY.register("long_icy_grasp", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.FREEZING_HIT, 9600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> STRONG_ICY_GRASP = REGISTRY.register("strong_icy_grasp", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.FREEZING_HIT, 1600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> IRON_WEIGHT = REGISTRY.register("iron_weight", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.HEAVY_BODY, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> STRONG_IRON_WEIGHT = REGISTRY.register("strong_iron_weight", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.HEAVY_BODY, 600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> RESISTANCE = REGISTRY.register("resistance", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> LONG_RESISTANCE = REGISTRY.register("long_resistance", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2000, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> STRONG_RESISTANCE = REGISTRY.register("strong_resistance", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> VAMPIRIC = REGISTRY.register("vampiric", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.LIFESTEAL, 1200, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> LONG_VAMPIRIC = REGISTRY.register("long_vampiric", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.LIFESTEAL, 2900, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> STRONG_VAMPIRIC = REGISTRY.register("strong_vampiric", () -> new Potion(new MobEffectInstance(AlchemicalModMobEffects.LIFESTEAL, 400, 1, false, true)));
}
