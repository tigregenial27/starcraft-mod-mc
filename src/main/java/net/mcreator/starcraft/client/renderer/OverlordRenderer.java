
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.OverlordEntity;
import net.mcreator.starcraft.client.model.Modeloverlord;

public class OverlordRenderer extends MobRenderer<OverlordEntity, Modeloverlord<OverlordEntity>> {
	public OverlordRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloverlord<OverlordEntity>(context.bakeLayer(Modeloverlord.LAYER_LOCATION)), 2.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(OverlordEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/overlord.png");
	}
}
