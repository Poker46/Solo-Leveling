
package net.mcreator.sololeveling.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sololeveling.itemgroup.IdtItemGroup;
import net.mcreator.sololeveling.SololevelingModElements;

@SololevelingModElements.ModElement.Tag
public class FinalSwordItem extends SololevelingModElements.ModElement {
	@ObjectHolder("sololeveling:final_sword")
	public static final Item block = null;
	public FinalSwordItem(SololevelingModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SuperCoreItem.block));
			}
		}, 3, -2f, new Item.Properties().group(IdtItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("final_sword"));
	}
}
