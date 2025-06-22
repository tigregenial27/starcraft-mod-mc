
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.VulturevehicleentityEntity;
import net.mcreator.starcraft.client.model.ModelVulture;

public class VulturevehicleentityRenderer extends MobRenderer<VulturevehicleentityEntity, ModelVulture<VulturevehicleentityEntity>> {
	public VulturevehicleentityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVulture<VulturevehicleentityEntity>(context.bakeLayer(ModelVulture.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(VulturevehicleentityEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/vulture_reideable.png");
	}
}
