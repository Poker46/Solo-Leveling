
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
public class SpearItem extends SololevelingModElements.ModElement {
	@ObjectHolder("sololeveling:spear")
	public static final Item block = null;
	public SpearItem(SololevelingModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FinalSwordItem.block));
			}
		}, 3, 4f, new Item.Properties().group(IdtItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("spear"));
	}
}
