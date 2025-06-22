
package net.mcreator.starcraft.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.mcreator.starcraft.procedures.BespingasEnTicksAleatoriosDelClienteProcedure;
import net.mcreator.starcraft.procedures.BespingasAlEntidadColisionarConElBloqueProcedure;
import net.mcreator.starcraft.init.StarcraftModFluids;

public class VespingasBlock extends LiquidBlock {
	public VespingasBlock() {
		super(() -> StarcraftModFluids.VESPINGAS.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		BespingasAlEntidadColisionarConElBloqueProcedure.execute(entity);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		BespingasEnTicksAleatoriosDelClienteProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
