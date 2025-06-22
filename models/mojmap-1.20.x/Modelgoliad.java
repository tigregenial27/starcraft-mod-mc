// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgoliad<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "goliad"), "main");
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelgoliad(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(114, 145)
						.addBox(11.0F, -25.0F, 3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 156)
						.addBox(-13.0F, -25.0F, 3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-23.0F, -32.0F, -11.0F, 10.0F, 13.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(132, 0)
						.addBox(-24.0F, -31.0F, -9.0F, 1.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(132, 93)
						.addBox(23.0F, -31.0F, -9.0F, 1.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 112)
						.addBox(13.0F, -32.0F, -11.0F, 10.0F, 13.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 144)
						.addBox(13.0F, -27.0F, -15.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 144)
						.addBox(-23.0F, -27.0F, -15.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(164, 10)
						.addBox(-19.0F, -26.9F, -22.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 112)
						.addBox(19.0F, -22.9F, -33.0F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 176)
						.addBox(16.0F, -26.9F, -22.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(74, 32)
						.addBox(-22.0F, -22.9F, -33.0F, 3.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(148, 37)
						.addBox(-17.0F, -3.0F, -15.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(148, 26)
						.addBox(-53.0F, -3.0F, -15.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.0F, -23.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(62, 61).addBox(-3.0695F, -36.4127F, -11.0F, 8.0F, 28.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.1687F, 0.045F, 0.258F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 61).addBox(-4.8787F, -36.3258F, -11.0F, 8.0F, 28.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.1687F, -0.045F, -0.258F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(132, 139).addBox(-6.0F, -38.0F, 7.0F, 12.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -19.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -36.0F, -11.0F, 14.0F, 38.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(124, 61)
						.addBox(-15.2F, 34.0F, -7.0F, 10.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(22, 156)
						.addBox(-14.2F, 37.0F, -15.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(130, 158)
						.addBox(-9.2F, 37.0F, -15.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.9F, -15.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(160, 119)
						.addBox(-4.0F, -2.0F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(152, 159)
						.addBox(-9.0F, -2.0F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 39.0F, -12.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r1 = RightLeg.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(102, 53).addBox(-0.1F, -6.0F, -5.0F, 4.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1F, 20.2F, 19.9F, 0.829F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r2 = RightLeg.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(86, 137)
						.addBox(-0.1F, -23.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 133)
						.addBox(-0.1F, -8.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(132, 119)
						.addBox(-2.1F, -22.0F, -3.0F, 8.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 93)
						.addBox(5.9F, -28.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(108, 153)
						.addBox(6.9F, -29.0F, -3.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 153)
						.addBox(-2.1F, -29.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(148, 48)
						.addBox(-2.1F, -7.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1F, 20.2F, 19.9F, 0.829F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r3 = RightLeg.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(100, 112).addBox(-2.1F, -21.0F, -4.0F, 8.0F, 21.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1F, 36.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(124, 77)
						.addBox(6.0F, 34.0F, -7.0F, 10.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(158, 139)
						.addBox(7.0F, 37.0F, -15.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(158, 149)
						.addBox(12.0F, 37.0F, -15.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.9F, -15.0F, 0.0F));

		PartDefinition LeftLeg_r4 = LeftLeg.addOrReplaceChild("LeftLeg_r4",
				CubeListBuilder.create().texOffs(124, 100)
						.addBox(-2.1F, -28.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 156)
						.addBox(-8.1F, -29.0F, -3.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(82, 153)
						.addBox(-1.1F, -29.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(114, 141)
						.addBox(0.9F, -23.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 133)
						.addBox(-1.1F, -22.0F, -3.0F, 8.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 53)
						.addBox(0.9F, -8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 141)
						.addBox(-1.1F, -7.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.1F, 20.2F, 19.9F, 0.829F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r5 = LeftLeg
				.addOrReplaceChild("LeftLeg_r5",
						CubeListBuilder.create().texOffs(132, 26).addBox(-0.1F, -6.0F, -5.0F, 4.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(9.1F, 20.2F, 19.9F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(164, 0)
						.addBox(-4.0F, -2.0F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(160, 129)
						.addBox(-9.0F, -2.0F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 39.0F, -12.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition LeftLeg_r6 = LeftLeg.addOrReplaceChild("LeftLeg_r6",
				CubeListBuilder.create().texOffs(116, 32).addBox(-2.1F, -21.0F, -4.0F, 8.0F, 21.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1F, 36.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}