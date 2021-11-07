
package net.mcreator.sololeveling.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.sololeveling.itemgroup.IdtItemGroup;
import net.mcreator.sololeveling.SololevelingModElements;

@SololevelingModElements.ModElement.Tag
public class PokeriteItem extends SololevelingModElements.ModElement {
	@ObjectHolder("sololeveling:pokerite")
	public static final Item block = null;
	public PokeriteItem(SololevelingModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(IdtItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("pokerite");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
