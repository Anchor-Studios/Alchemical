package net.alchemical.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.alchemical.init.AlchemicalModMobEffects;
import net.alchemical.init.AlchemicalModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BurningHitHitsTargetProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(AlchemicalModMobEffects.BURNING_HIT)) {
			entity.igniteForSeconds((int) (sourceentity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(AlchemicalModAttributes.BURNING_DURATION)
					? _livingEntity1.getAttribute(AlchemicalModAttributes.BURNING_DURATION).getValue()
					: 0));
		}
	}
}
