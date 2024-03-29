package net.mcreator.sololeveling.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.SlimeModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.sololeveling.entity.EnderPhaseEntity;

@OnlyIn(Dist.CLIENT)
public class EnderPhaseRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EnderPhaseEntity.entity,
					renderManager -> new MobRenderer(renderManager, new SlimeModel(0), 0.5f) {
						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("sololeveling:textures/slime.png");
						}
					});
		}
	}
}
