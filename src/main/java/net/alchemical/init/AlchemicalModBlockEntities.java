
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.alchemical.block.entity.AlchemyStandBlockEntity;
import net.alchemical.AlchemicalMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AlchemicalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AlchemicalMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ALCHEMY_STAND = register("alchemy_stand", AlchemicalModBlocks.ALCHEMY_STAND, AlchemyStandBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ALCHEMY_STAND.get(), (blockEntity, side) -> ((AlchemyStandBlockEntity) blockEntity).getItemHandler());
	}
}
