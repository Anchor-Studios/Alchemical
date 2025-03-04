package net.alchemical.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.alchemical.init.AlchemicalModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FreezingHitHitsTargetProcedure {
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
		if ((sourceentity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(AlchemicalModAttributes.FREEZING_DURATION) ? _livingEntity0.getAttribute(AlchemicalModAttributes.FREEZING_DURATION).getValue() : 0) > 0) {
			entity.setTicksFrozen((int) (entity.getTicksFrozen() + (sourceentity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(AlchemicalModAttributes.FREEZING_DURATION)
					? _livingEntity2.getAttribute(AlchemicalModAttributes.FREEZING_DURATION).getValue()
					: 0) * 20));
		}
	}
}
