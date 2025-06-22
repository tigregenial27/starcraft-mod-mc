
package net.mcreator.starcraft.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.starcraft.procedures.VultureprojectieCuandoElProyectilAlcancaUnaEntidadVivaProcedure;
import net.mcreator.starcraft.init.StarcraftModItems;
import net.mcreator.starcraft.init.StarcraftModEntities;

import javax.annotation.Nullable;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class VultureprojectieEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(StarcraftModItems.VULTUREPROJECTILE.get());

	public VultureprojectieEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(StarcraftModEntities.VULTUREPROJECTIE.get(), world);
	}

	public VultureprojectieEntity(EntityType<? extends VultureprojectieEntity> type, Level world) {
		super(type, world);
	}

	public VultureprojectieEntity(EntityType<? extends VultureprojectieEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public VultureprojectieEntity(EntityType<? extends VultureprojectieEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Nullable
	@Override
	protected EntityHitResult findHitEntity(Vec3 projectilePosition, Vec3 deltaPosition) {
		double d0 = Double.MAX_VALUE;
		Entity entity = null;
		AABB lookupBox = this.getBoundingBox().expandTowards(deltaPosition).inflate(1.0D);
		for (Entity entity1 : this.level().getEntities(this, lookupBox, this::canHitEntity)) {
			if (entity1 == this.getOwner())
				continue;
			AABB aabb = entity1.getBoundingBox();
			if (aabb.intersects(lookupBox)) {
				double d1 = projectilePosition.distanceToSqr(projectilePosition);
				if (d1 < d0) {
					entity = entity1;
					d0 = d1;
				}
			}
		}
		return entity == null ? null : new EntityHitResult(entity);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		VultureprojectieCuandoElProyectilAlcancaUnaEntidadVivaProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static VultureprojectieEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5.5, 0);
	}

	public static VultureprojectieEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1f, 5.5, 0);
	}

	public static VultureprojectieEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		VultureprojectieEntity entityarrow = new VultureprojectieEntity(StarcraftModEntities.VULTUREPROJECTIE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starcraft:vultureattack")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static VultureprojectieEntity shoot(LivingEntity entity, LivingEntity target) {
		VultureprojectieEntity entityarrow = new VultureprojectieEntity(StarcraftModEntities.VULTUREPROJECTIE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5.5);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starcraft:vultureattack")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
