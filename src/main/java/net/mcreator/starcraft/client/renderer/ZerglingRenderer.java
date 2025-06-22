
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.ZerglingEntity;
import net.mcreator.starcraft.client.model.ModelCustomModel;

public class ZerglingRenderer extends MobRenderer<ZerglingEntity, ModelCustomModel<ZerglingEntity>> {
	public ZerglingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel<ZerglingEntity>(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZerglingEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/zergling.png");
	}
}
