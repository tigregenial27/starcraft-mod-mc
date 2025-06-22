package net.mcreator.starcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class BespingasEnTicksAleatoriosDelClienteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 1, 0);
	}
}
