
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.GoliathEntity;
import net.mcreator.starcraft.client.model.Modelgoliad;

public class GoliathRenderer extends MobRenderer<GoliathEntity, Modelgoliad<GoliathEntity>> {
	public GoliathRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgoliad<GoliathEntity>(context.bakeLayer(Modelgoliad.LAYER_LOCATION)), 1.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoliathEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/goliad.png");
	}
}
