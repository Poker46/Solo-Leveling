package net.mcreator.sololeveling.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sololeveling.SololevelingModVariables;
import net.mcreator.sololeveling.SololevelingMod;

import java.util.Map;
import java.util.HashMap;

public class UpdateLevelProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SololevelingMod.LOGGER.warn("Failed to load dependency entity for procedure UpdateLevel!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SololevelingMod.LOGGER.warn("Failed to load dependency sourceentity for procedure UpdateLevel!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((sourceentity instanceof PlayerEntity)) {
			if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("forge:custom_mob").toLowerCase(java.util.Locale.ENGLISH)))
					.contains(entity.getType()))) {
				{
					double _setval = (double) (((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SololevelingModVariables.PlayerVariables())).level_progress) + 5);
					sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.level_progress = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if ((((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SololevelingModVariables.PlayerVariables())).level_progress) >= 100)) {
					{
						double _setval = (double) (((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SololevelingModVariables.PlayerVariables())).level) + 1);
						sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.level = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = (double) 0;
						sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.level_progress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("sourceentity", sourceentity);
						ApplyLevelEffectsProcedure.executeProcedure($_dependencies);
					}
				}
			} else if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("forge:custom_boss").toLowerCase(java.util.Locale.ENGLISH)))
					.contains(entity.getType()))) {
				{
					double _setval = (double) (((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SololevelingModVariables.PlayerVariables())).level_progress) + 20);
					sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.level_progress = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if ((((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SololevelingModVariables.PlayerVariables())).level_progress) >= 100)) {
					{
						double _setval = (double) (((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SololevelingModVariables.PlayerVariables())).level) + 1);
						sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.level = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = (double) 0;
						sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.level_progress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("sourceentity", sourceentity);
						ApplyLevelEffectsProcedure.executeProcedure($_dependencies);
					}
				}
			}
		}
	}
}
