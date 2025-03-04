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
public class LifestealHitHitsTargetProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity sourceentity, double amount) {
		execute(null, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity sourceentity, double amount) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE)
				? _livingEntity0.getAttribute(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE).getValue()
				: 0) > 0) {
			if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) <= (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1))) {
				if ((sourceentity instanceof LivingEntity _livEnt
						? _livEnt.getMaxHealth()
						: -1) > (amount * (sourceentity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE)
								? _livingEntity4.getAttribute(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE).getValue()
								: 0)) / 100 + (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((amount * (sourceentity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE)
								? _livingEntity6.getAttribute(AlchemicalModAttributes.LIFESTEAL_PERCENTAGE).getValue()
								: 0)) / 100 + (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)));
				} else {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				}
			}
		}
	}
}
