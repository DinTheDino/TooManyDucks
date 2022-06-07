
package net.mcreator.toomanyducks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.toomanyducks.init.ToomanyducksModTabs;

public class MegaBreadItem extends Item {
	public MegaBreadItem() {
		super(new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(10f)

						.build()));
		setRegistryName("mega_bread");
	}
}
