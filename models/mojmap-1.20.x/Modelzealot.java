// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelzealot<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zealot"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelzealot(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(48, 26)
				.addBox(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, -2.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 30)
						.addBox(-2.0F, -6.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -13.0F, -3.0F, 10.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-4, 101)
						.addBox(-4.0F, 1.0F, -1.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -2.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(48, 36).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -12.4F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(48, 46).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -13.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r3 = Body
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(18, 15).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 5.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -15.0F, -1.0F));

		PartDefinition cube_r5 = RightArm
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-4.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition RightArm_r1 = RightArm
				.addOrReplaceChild("RightArm_r1",
						CubeListBuilder.create().texOffs(52, 10).addBox(-1.0F, 13.0F, -2.0F, 1.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.2F, 1.1F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition RightArm_r2 = RightArm
				.addOrReplaceChild("RightArm_r2",
						CubeListBuilder.create().texOffs(0, 58).addBox(-2.0F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.3F, 1.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition RightArm_r3 = RightArm
				.addOrReplaceChild("RightArm_r3",
						CubeListBuilder.create().texOffs(24, 46).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 17.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(16, 46)
						.addBox(-0.8452F, -0.1874F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 43)
						.addBox(-1.8452F, 6.8126F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(1.1548F, 14.8126F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 56)
						.addBox(1.1548F, 20.8126F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -15.0F, -1.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 56)
						.addBox(-2.9641F, 25.0F, -8.3301F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 60)
						.addBox(-2.9641F, 25.0F, -10.3301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 59)
						.addBox(0.0359F, 25.0F, -10.3301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -2.0F, -1.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(52, 20).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9641F, 25.0F, -4.3301F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r1 = RightLeg.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(20, 68).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0641F, 8.0F, -4.7301F, 2.5307F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r2 = RightLeg.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(36, 13).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0641F, 12.0F, 1.6699F, -1.9635F, 0.0F, 0.0F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0641F, 13.0F, -0.3301F, -0.3054F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(36, 26)
						.addBox(-0.8817F, 25.0F, -7.1421F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 58)
						.addBox(-0.8817F, 25.0F, -9.1421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 59)
						.addBox(2.1183F, 25.0F, -9.1421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, -2.0F, -2.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition LeftLeg_r3 = LeftLeg.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(2, 68).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0183F, 8.0F, -3.5421F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(32, 55).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1183F, 25.0F, -3.1421F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r4 = LeftLeg.addOrReplaceChild("LeftLeg_r4",
				CubeListBuilder.create().texOffs(16, 30).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0183F, 13.0F, 0.8579F, -0.3054F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r5 = LeftLeg.addOrReplaceChild("LeftLeg_r5",
				CubeListBuilder.create().texOffs(36, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0183F, 12.0F, 2.8579F, -1.9635F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}