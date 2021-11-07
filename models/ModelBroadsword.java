// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBroadsword extends EntityModel<Entity> {
	private final ModelRenderer manico;
	private final ModelRenderer manico_r1;
	private final ModelRenderer lama;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public ModelBroadsword() {
		textureWidth = 16;
		textureHeight = 16;

		manico = new ModelRenderer(this);
		manico.setRotationPoint(-8.0F, 16.0F, 8.0F);

		manico_r1 = new ModelRenderer(this);
		manico_r1.setRotationPoint(8.0F, -5.0F, -10.0F);
		manico.addChild(manico_r1);
		setRotationAngle(manico_r1, 1.5708F, 0.0F, 0.0F);
		manico_r1.setTextureOffset(0, 1).addBox(-0.9F, 17.0825F, -0.8894F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		manico_r1.setTextureOffset(0, 3).addBox(-0.75F, 12.0825F, -3.4894F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		manico_r1.setTextureOffset(0, 3).addBox(-0.75F, 12.0825F, 0.0106F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		manico_r1.setTextureOffset(0, 1).addBox(-0.5F, 13.0825F, -0.4894F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		lama = new ModelRenderer(this);
		lama.setRotationPoint(-8.0F, 16.0F, 8.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(8.0F, -5.0F, -10.0F);
		lama.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-0.4F, -6.8699F, -6.8729F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-0.4F, -6.6199F, -6.8729F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(8.0F, -5.0F, -10.0F);
		lama.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-0.35F, -9.3722F, -0.347F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 0).addBox(-0.375F, -9.1972F, -0.372F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 1).addBox(-0.5F, 2.825F, -1.0035F, 1.0F, 9.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 1).addBox(-0.5F, -8.175F, -1.0035F, 1.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.0F, -5.0F, -10.0F);
		lama.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.3562F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-0.4F, -6.6249F, 6.6179F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(8.0F, -5.0F, -10.0F);
		lama.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.9635F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-0.4F, -8.1714F, 3.4491F, 0.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(8.0F, -5.0F, -10.0F);
		lama.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.1781F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-0.4F, -8.1687F, -4.0556F, 0.0F, 1.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		manico.render(matrixStack, buffer, packedLight, packedOverlay);
		lama.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}