
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.registries.BuiltInRegistries;

import net.alchemical.AlchemicalMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AlchemicalModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, AlchemicalMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> BURNING_DURATION = REGISTRY.register("burning_duration", () -> new RangedAttribute("attribute.alchemical.burning_duration", 0, 0, 15).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> FREEZING_DURATION = REGISTRY.register("freezing_duration", () -> new RangedAttribute("attribute.alchemical.freezing_duration", 0, 0, 15).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.getTypes().forEach(entity -> event.add(entity, BURNING_DURATION));
		event.getTypes().forEach(entity -> event.add(entity, FREEZING_DURATION));
	}
}
