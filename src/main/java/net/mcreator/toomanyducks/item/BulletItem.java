
package net.mcreator.toomanyducks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.toomanyducks.init.ToomanyducksModTabs;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("bullet");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
