
package net.mcreator.starcraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.starcraft.init.StarcraftModItems;
import net.mcreator.starcraft.init.StarcraftModFluids;
import net.mcreator.starcraft.init.StarcraftModFluidTypes;
import net.mcreator.starcraft.init.StarcraftModBlocks;

public abstract class VespingasFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> StarcraftModFluidTypes.VESPINGAS_TYPE.get(), () -> StarcraftModFluids.VESPINGAS.get(), () -> StarcraftModFluids.FLOWING_VESPINGAS.get())
			.explosionResistance(100f).levelDecreasePerBlock(5).slopeFindDistance(10).bucket(() -> StarcraftModItems.VESPINGAS_BUCKET.get()).block(() -> (LiquidBlock) StarcraftModBlocks.VESPINGAS.get());

	private VespingasFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SPIT;
	}

	public static class Source extends VespingasFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VespingasFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
