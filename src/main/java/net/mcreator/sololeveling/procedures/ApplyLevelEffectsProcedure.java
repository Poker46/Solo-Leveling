package net.mcreator.sololeveling.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sololeveling.SololevelingModVariables;
import net.mcreator.sololeveling.SololevelingMod;

import java.util.Map;

public class ApplyLevelEffectsProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SololevelingMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ApplyLevelEffects!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double damage_val = 0;
		damage_val = (double) (1 + (((sourceentity.getCapability(SololevelingModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SololevelingModVariables.PlayerVariables())).level) * 0.1));
		{
			Entity _ent = sourceentity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						(("attribute @s minecraft:generic.attack_damage base set ") + ""
								+ ((new java.text.DecimalFormat("#.#").format(damage_val)))));
			}
		}
	}
}
