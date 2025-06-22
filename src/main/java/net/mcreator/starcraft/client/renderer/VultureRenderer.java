
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.VultureEntity;
import net.mcreator.starcraft.client.model.ModelVulture;

public class VultureRenderer extends MobRenderer<VultureEntity, ModelVulture<VultureEntity>> {
	public VultureRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVulture<VultureEntity>(context.bakeLayer(ModelVulture.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(VultureEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/vulture.png");
	}
}
