
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.MarineEntity;
import net.mcreator.starcraft.client.model.Modelmarine;

public class MarineRenderer extends MobRenderer<MarineEntity, Modelmarine<MarineEntity>> {
	public MarineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarine<MarineEntity>(context.bakeLayer(Modelmarine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarineEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/marine.png");
	}
}
