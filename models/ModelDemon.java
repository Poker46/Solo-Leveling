// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelDemon extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rarm;
	private final ModelRenderer learm;
	private final ModelRenderer leleg;
	private final ModelRenderer rleg;

	public ModelDemon() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 2).addBox(3.0F, -32.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 4).addBox(4.0F, -33.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(-5.0F, -33.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-5.0F, -32.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		rarm = new ModelRenderer(this);
		rarm.setRotationPoint(-6.0F, -24.0F, 0.0F);
		body.addChild(rarm);
		rarm.setTextureOffset(24, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		learm = new ModelRenderer(this);
		learm.setRotationPoint(6.0F, -24.0F, 0.0F);
		body.addChild(learm);
		learm.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leleg = new ModelRenderer(this);
		leleg.setRotationPoint(2.0F, -12.0F, 0.0F);
		body.addChild(leleg);
		leleg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rleg = new ModelRenderer(this);
		rleg.setRotationPoint(-2.0F, -12.0F, 0.0F);
		body.addChild(rleg);
		rleg.setTextureOffset(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.learm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.rleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}