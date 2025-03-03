
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.alchemical.potion.HeavyBodyMobEffect;
import net.alchemical.potion.FreezingHitMobEffect;
import net.alchemical.potion.BurningHitMobEffect;
import net.alchemical.AlchemicalMod;

public class AlchemicalModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, AlchemicalMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> BURNING_HIT = REGISTRY.register("burning_hit", () -> new BurningHitMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FREEZING_HIT = REGISTRY.register("freezing_hit", () -> new FreezingHitMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> HEAVY_BODY = REGISTRY.register("heavy_body", () -> new HeavyBodyMobEffect());
}
