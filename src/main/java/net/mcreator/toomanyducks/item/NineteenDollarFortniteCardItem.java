
package net.mcreator.toomanyducks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class NineteenDollarFortniteCardItem extends Item {
	public NineteenDollarFortniteCardItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("nineteen_dollar_fortnite_card");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
