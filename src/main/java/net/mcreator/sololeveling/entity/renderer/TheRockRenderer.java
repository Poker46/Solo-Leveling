package net.mcreator.sololeveling.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.sololeveling.entity.TheRockEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TheRockRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TheRockEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sololeveling:textures/therock.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer base;
		private final ModelRenderer cube_r1;
		private final ModelRenderer rarm;
		private final ModelRenderer larm;
		private final ModelRenderer busto;
		private final ModelRenderer head;
		public Modelcustom_model() {
			textureWidth = 128;
			textureHeight = 128;
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 20.0F, 0.0F);
			base.setTextureOffset(48, 52).addBox(8.0F, -16.0F, -8.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			base.setTextureOffset(48, 4).addBox(-12.0F, -16.0F, -8.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			base.setTextureOffset(16, 80).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
			base.setTextureOffset(72, 0).addBox(-8.0F, -8.0F, -8.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			base.setTextureOffset(64, 24).addBox(4.0F, -8.0F, -8.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(6.0F, -6.0F, 0.0F);
			base.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
			cube_r1.setTextureOffset(0, 20).addBox(-12.0F, -10.0F, -6.0F, 4.0F, 4.0F, 24.0F, 0.0F, false);
			cube_r1.setTextureOffset(32, 24).addBox(8.0F, -10.0F, -6.0F, 4.0F, 4.0F, 24.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 20).addBox(4.0F, -2.0F, 2.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 32).addBox(-8.0F, -2.0F, 2.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			rarm = new ModelRenderer(this);
			rarm.setRotationPoint(18.0F, -14.0F, 0.0F);
			rarm.setTextureOffset(72, 52).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			rarm.setTextureOffset(0, 76).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 24.0F, 4.0F, 0.0F, false);
			larm = new ModelRenderer(this);
			larm.setRotationPoint(-18.0F, -14.0F, 0.0F);
			larm.setTextureOffset(72, 72).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 24.0F, 4.0F, 0.0F, false);
			larm.setTextureOffset(40, 72).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			busto = new ModelRenderer(this);
			busto.setRotationPoint(-2.0F, -2.0F, 2.0F);
			busto.setTextureOffset(0, 0).addBox(-10.0F, -10.0F, -6.0F, 24.0F, 12.0F, 8.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.setTextureOffset(0, 52).addBox(-6.0F, -46.0F, -10.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			base.render(matrixStack, buffer, packedLight, packedOverlay);
			rarm.render(matrixStack, buffer, packedLight, packedOverlay);
			larm.render(matrixStack, buffer, packedLight, packedOverlay);
			busto.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.larm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.base.rotateAngleY = f2 / 20.f;
			this.rarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
