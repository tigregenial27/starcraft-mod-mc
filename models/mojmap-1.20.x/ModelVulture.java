// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVulture<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vulture"), "main");
	private final ModelPart head;
	private final ModelPart bb_main;

	public ModelVulture(ModelPart root) {
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(128, 92).addBox(
				-6.0F, -8.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.0F, 6.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -22.0F, 7.0F, 16.0F, 18.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-24.0F, -18.0F, 9.0F, 16.0F, 14.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 74)
						.addBox(8.0F, -18.0F, 9.0F, 16.0F, 14.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(74, 57)
						.addBox(-8.0F, -6.0F, -7.0F, 16.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-8.0F, -17.0F, -24.0F, 16.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(74, 73)
						.addBox(-6.0F, -15.0F, -37.0F, 12.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
						.addBox(-4.0F, -13.0F, -50.0F, 8.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(140, 0)
						.addBox(-4.0F, -13.0F, -57.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(140, 14)
						.addBox(2.0F, -13.0F, -57.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 112)
						.addBox(8.0F, -22.0F, 20.0F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(80, 112)
						.addBox(5.0F, -25.0F, 20.0F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(118, 112)
						.addBox(-8.0F, -25.0F, 20.0F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(124, 73)
						.addBox(-11.0F, -22.0F, 20.0F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(74, 97)
						.addBox(-8.0F, -26.0F, 7.0F, 16.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(138, 131)
						.addBox(-4.0F, -23.0F, 1.0F, 8.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(134, 57)
						.addBox(-4.0F, -10.0F, -7.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(100, 139)
						.addBox(0.0F, -10.0F, -7.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(100, 131)
						.addBox(-6.0F, -16.0F, -31.0F, 12.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(64, 131)
						.addBox(-4.0F, -14.0F, -47.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(74, 30).addBox(-6.0F, -1.0F, -25.0F, 8.0F, 1.0F, 26.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -16.0F, -25.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 131)
						.addBox(-4.0F, -2.0F, -13.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 131)
						.addBox(7.0F, -2.0F, -13.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -21.0F, 6.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}