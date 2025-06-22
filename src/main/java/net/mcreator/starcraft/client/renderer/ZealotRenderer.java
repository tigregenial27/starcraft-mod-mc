
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.ZealotEntity;
import net.mcreator.starcraft.client.model.Modelzealot;

public class ZealotRenderer extends MobRenderer<ZealotEntity, Modelzealot<ZealotEntity>> {
	public ZealotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzealot<ZealotEntity>(context.bakeLayer(Modelzealot.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZealotEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/zealot.png");
	}
}
