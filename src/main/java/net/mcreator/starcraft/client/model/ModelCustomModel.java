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
public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("starcraft", "model_custom_model"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelCustomModel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(48, 33).addBox(-3.0F, -5.0F, -5.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 60).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 45)
						.addBox(3.0F, -3.0F, -9.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(68, 0).addBox(3.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 4)
						.addBox(-5.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 20).addBox(3.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 20)
						.addBox(3.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 58).addBox(-5.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 56)
						.addBox(-5.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 16).addBox(3.5F, -2.6F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 65)
						.addBox(-4.5F, -2.6F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 22).addBox(-5.0F, -3.0F, -9.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -8.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -8.0F, 12.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-4.0F, -12.0F, -6.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 63)
						.addBox(2.0F, -12.0F, -6.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56).addBox(2.0F, -12.0F, -11.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 56)
						.addBox(-4.0F, -12.0F, -11.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 52).addBox(-4.0F, -12.0F, -16.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(2.0F, -12.0F, -16.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 64).addBox(2.6F, -11.5F, -20.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 69)
						.addBox(-3.5F, -9.0F, -12.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 69).addBox(-3.5F, -9.0F, -15.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 65)
						.addBox(-3.4F, -11.5F, -20.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 48).addBox(2.5F, -9.0F, -15.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 69)
						.addBox(2.5F, -9.0F, -12.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 43).addBox(-1.0F, 5.0F, 12.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(6.0F, -13.0F, -7.0F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(24, 25).addBox(-6.0F, -13.0F, -7.0F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 45).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 6.0F, -0.6545F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(0.1F, 19.0F, -2.0F));
		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(68, 43).addBox(0.0F, -4.2942F, -0.0981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8).addBox(3.0F, -4.2942F, -0.0981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 5.0F, -9.0F, -1.309F, 0.0F, 0.0F));
		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 63).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9F, -1.0F, -2.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(64, 69).addBox(1.0F, 4.0803F, 1.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 20).addBox(4.0F, 4.0803F, 1.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1F, -0.1F, 3.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 16).addBox(-2.0F, 4.0803F, -0.4036F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -0.1F, 6.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 52).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -0.1F, 6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-0.1F, 19.0F, 0.0F));
		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(68, 65).addBox(0.0F, -4.2942F, -0.0981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 60).addBox(3.0F, -4.2942F, -0.0981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9F, 5.0F, -11.0F, -1.309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(75, 0).addBox(1.0F, 4.0803F, 1.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 20).addBox(4.0F, 4.0803F, 1.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, -0.1F, 1.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 60).addBox(-2.0F, 4.0803F, -0.4036F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, -0.1F, 4.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 63).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, -0.1F, 4.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(24, 63).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 8).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9F, -1.0F, -4.0F, -1.0472F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
