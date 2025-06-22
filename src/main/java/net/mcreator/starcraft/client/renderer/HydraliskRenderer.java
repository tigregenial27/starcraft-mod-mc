
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.HydraliskEntity;
import net.mcreator.starcraft.client.model.ModelHydralisk;

public class HydraliskRenderer extends MobRenderer<HydraliskEntity, ModelHydralisk<HydraliskEntity>> {
	public HydraliskRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHydralisk<HydraliskEntity>(context.bakeLayer(ModelHydralisk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HydraliskEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/hydralisk.png");
	}
}
