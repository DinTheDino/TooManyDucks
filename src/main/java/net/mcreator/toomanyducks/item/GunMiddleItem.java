
package net.mcreator.toomanyducks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class GunMiddleItem extends Item {
	public GunMiddleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("gun_middle");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
