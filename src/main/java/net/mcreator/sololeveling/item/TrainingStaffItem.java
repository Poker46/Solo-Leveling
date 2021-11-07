
package net.mcreator.sololeveling.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sololeveling.itemgroup.IdtItemGroup;
import net.mcreator.sololeveling.SololevelingModElements;

@SololevelingModElements.ModElement.Tag
public class TrainingStaffItem extends SololevelingModElements.ModElement {
	@ObjectHolder("sololeveling:training_staff")
	public static final Item block = null;
	public TrainingStaffItem(SololevelingModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(IdtItemGroup.tab)) {
		}.setRegistryName("training_staff"));
	}
}
