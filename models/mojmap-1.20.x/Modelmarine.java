// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmarine<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "marine"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart leftarm;

	public Modelmarine(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -12.0F, -3.0F, 10.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-11.0F, -16.0F, -4.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 11)
						.addBox(4.0F, -16.0F, -4.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(4.0F, -18.0F, -2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition RightArm_r1 = Body.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(32, 22).addBox(-8.0F, -1.0F, -3.0F, 5.0F, 13.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -11.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(20, 43)
						.addBox(0.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 48)
						.addBox(4.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 57)
						.addBox(0.0F, 3.0F, -1.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 34)
						.addBox(6.0F, 1.0F, -1.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(0.0F, -4.0F, -1.0F, 12.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 22)
						.addBox(12.0F, -4.0F, -1.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 28)
						.addBox(12.0F, 0.0F, -1.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -6.0F, -5.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 43)
				.addBox(-3.0F, 0.0F, -3.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(50, 40)
				.addBox(-2.0F, 0.0F, -3.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(30, 40)
				.addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -2.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}