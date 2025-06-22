
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.DragoonEntity;
import net.mcreator.starcraft.client.model.Modeldragoon;

public class DragoonRenderer extends MobRenderer<DragoonEntity, Modeldragoon<DragoonEntity>> {
	public DragoonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragoon<DragoonEntity>(context.bakeLayer(Modeldragoon.LAYER_LOCATION)), 3.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragoonEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/dragoon.png");
	}
}
