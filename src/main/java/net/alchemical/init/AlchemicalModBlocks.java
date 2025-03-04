
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alchemical.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.alchemical.block.AlchemyStandBlock;
import net.alchemical.AlchemicalMod;

public class AlchemicalModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlchemicalMod.MODID);
	public static final DeferredBlock<Block> ALCHEMY_STAND = REGISTRY.register("alchemy_stand", AlchemyStandBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
