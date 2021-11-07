
package net.mcreator.sololeveling.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sololeveling.item.PokeriteItem;
import net.mcreator.sololeveling.SololevelingModElements;

@SololevelingModElements.ModElement.Tag
public class IdtItemGroup extends SololevelingModElements.ModElement {
	public IdtItemGroup(SololevelingModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabidt") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PokeriteItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
