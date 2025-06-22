package net.mcreator.starcraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeloverlord<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("starcraft", "modeloverlord"), "main");
	public final ModelPart overlord;

	public Modeloverlord(ModelPart root) {
		this.overlord = root.getChild("overlord");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition overlord = partdefinition.addOrReplaceChild("overlord",
				CubeListBuilder.create().texOffs(96, 97).addBox(-15.0F, 1.0F, 5.0F, 3.0F, 31.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 97).addBox(-3.0F, 1.0F, -15.0F, 3.0F, 33.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 108)
						.addBox(-3.0F, 1.0F, 16.0F, 3.0F, 26.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 108).addBox(-3.0F, 1.0F, 2.0F, 3.0F, 29.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 74)
						.addBox(12.0F, 1.0F, 12.0F, 3.0F, 38.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 108).addBox(12.0F, 1.0F, -1.0F, 3.0F, 23.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 74)
						.addBox(10.0F, 16.0F, -15.0F, 7.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 108).addBox(12.0F, 1.0F, -13.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 74)
						.addBox(-15.0F, 1.0F, -17.0F, 3.0F, 39.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 74).addBox(-8.0F, -10.0F, -29.0F, 15.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-15.0F, 1.0F, -5.0F, 3.0F, 37.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-22.0F, -33.0F, -20.0F, 43.0F, 34.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -41.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -41.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, -41.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -41.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.0F, -41.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -41.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -41.0F, -13.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -41.0F, -14.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.0F, -41.0F, -14.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -19.0F, -28.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -18.0F, -28.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(162, 4).addBox(17.0F, 22.0F, -10.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -1.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		overlord.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.overlord.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.overlord.xRot = headPitch / (180F / (float) Math.PI);
	}
}
