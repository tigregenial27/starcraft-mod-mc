
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.GoliathvehicleEntity;
import net.mcreator.starcraft.client.model.Modelgoliad;

public class GoliathvehicleRenderer extends MobRenderer<GoliathvehicleEntity, Modelgoliad<GoliathvehicleEntity>> {
	public GoliathvehicleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgoliad<GoliathvehicleEntity>(context.bakeLayer(Modelgoliad.LAYER_LOCATION)), 1.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoliathvehicleEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/goliad_reideable.png");
	}
}
