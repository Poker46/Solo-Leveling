
package net.mcreator.sololeveling.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sololeveling.itemgroup.IdtItemGroup;
import net.mcreator.sololeveling.SololevelingModElements;

@SololevelingModElements.ModElement.Tag
public class NetheriteHammerItem extends SololevelingModElements.ModElement {
	@ObjectHolder("sololeveling:netherite_hammer")
	public static final Item block = null;
	public NetheriteHammerItem(SololevelingModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 3, -3.5f, new Item.Properties().group(IdtItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("netherite_hammer"));
	}
}
