package net.mcreator.starcraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modeldragoon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("starcraft", "modeldragoon"), "main");
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modeldragoon(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F, -14.0F, -14.0F, 33.0F, 14.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(116, 0).addBox(-14.0F, -17.0F, -11.0F, 27.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(166, 102).addBox(11.0F, -13.0F, -1.0F, 3.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -15.6F, 9.0F, 0.0F, -0.48F, -1.5708F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 120).addBox(-0.5229F, -13.0343F, -1.0F, 4.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -15.6F, 9.0F, -0.4549F, -0.1586F, -0.3123F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 120).addBox(-16.7831F, -8.0276F, -1.0F, 4.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -15.6F, 9.0F, -0.4549F, 0.1586F, 0.3123F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, -6.0F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(134, 170).addBox(-3.9F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 170)
				.addBox(-3.9F, -14.0F, 1.0F, 4.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 170).addBox(-4.9F, -3.0F, 1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.9F, 28.0F, 35.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2", CubeListBuilder.create().texOffs(84, 119).addBox(-2.3693F, -3.553F, -23.0469F, 8.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.9F, 6.0F, 25.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(166, 92).addBox(-5.9F, -29.0F, -11.0F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-5.9F, -36.0F, -35.0F, 8.0F, 7.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(134, 32)
						.addBox(-5.9F, -35.0F, 0.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(166, 57).addBox(-5.9F, -29.0F, -6.0F, 8.0F, 27.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.9F, 28.0F, 35.0F, 0.1745F, 0.6981F, 0.0F));
		PartDefinition RightLeg_r4 = RightLeg.addOrReplaceChild("RightLeg_r4", CubeListBuilder.create().texOffs(110, 170).addBox(-3.9F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 170)
				.addBox(-3.9F, -14.0F, -1.0F, 4.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(152, 29).addBox(-4.9F, -3.0F, -2.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.1F, 28.0F, -37.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition RightLeg_r5 = RightLeg.addOrReplaceChild("RightLeg_r5", CubeListBuilder.create().texOffs(64, 145).addBox(-3.6721F, -1.7424F, 0.2961F, 8.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.1F, 4.0F, -24.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition RightLeg_r6 = RightLeg.addOrReplaceChild("RightLeg_r6",
				CubeListBuilder.create().texOffs(148, 119).addBox(-5.9F, -29.0F, 6.0F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 79).addBox(-5.9F, -36.0F, 1.0F, 8.0F, 7.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(142, 22)
						.addBox(-5.9F, -35.0F, -1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 146).addBox(-5.9F, -29.0F, -2.0F, 8.0F, 27.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.1F, 28.0F, -37.0F, -0.1745F, 0.6981F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, -5.0F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(122, 170).addBox(-0.1F, -5.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 170)
				.addBox(-0.1F, -16.0F, 1.0F, 4.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(148, 139).addBox(-1.1F, -5.0F, 1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.9F, 29.0F, 35.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(126, 145).addBox(-3.5218F, -1.5486F, -22.1973F, 8.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.9F, 3.0F, 23.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition LeftLeg_r3 = LeftLeg.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(148, 129).addBox(-2.1F, -29.0F, -11.0F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 39).addBox(-2.1F, -36.0F, -34.0F, 8.0F, 7.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(116, 32)
						.addBox(-2.1F, -35.0F, 0.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(166, 22).addBox(-2.1F, -29.0F, -6.0F, 8.0F, 27.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.9F, 27.0F, 35.0F, 0.1745F, -0.6545F, 0.0F));
		PartDefinition LeftLeg_r4 = LeftLeg.addOrReplaceChild("LeftLeg_r4", CubeListBuilder.create().texOffs(146, 170).addBox(-0.1F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 170)
				.addBox(-0.1F, -14.0F, -1.0F, 4.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(162, 139).addBox(-1.1F, -3.0F, -2.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.1F, 27.0F, -37.0F, 0.0F, -0.7418F, 0.0F));
		PartDefinition LeftLeg_r5 = LeftLeg.addOrReplaceChild("LeftLeg_r5", CubeListBuilder.create().texOffs(0, 120).addBox(-4.9844F, -3.7314F, 0.0587F, 8.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.1F, 5.0F, -24.0F, 0.0F, -0.7418F, 0.0F));
		PartDefinition LeftLeg_r6 = LeftLeg.addOrReplaceChild("LeftLeg_r6",
				CubeListBuilder.create().texOffs(116, 22).addBox(-2.1F, -29.0F, 6.0F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 80).addBox(-2.1F, -35.0F, 1.0F, 8.0F, 6.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(64, 137)
						.addBox(-2.1F, -35.0F, -1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 146).addBox(-2.1F, -29.0F, -2.0F, 8.0F, 27.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.1F, 27.0F, -37.0F, -0.1745F, -0.7418F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
