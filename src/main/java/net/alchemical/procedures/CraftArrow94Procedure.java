package net.alchemical.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CraftArrow94Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		count = 13;
		if (count * (100 / 27) > ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("done") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1)
				&& (count - 1) * (100 / 27) <= ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("done") instanceof IntegerProperty _getip3
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3)
						: -1)) {
			return true;
		}
		return false;
	}
}
