
package net.mcreator.toomanyducks.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.toomanyducks.init.ToomanyducksModTabs;
import net.mcreator.toomanyducks.init.ToomanyducksModItems;

public class RubberduckiumShovelItem extends ShovelItem {
	public RubberduckiumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ToomanyducksModItems.RUBBERDUCKIUM));
			}
		}, 1, -3f, new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS));
		setRegistryName("rubberduckium_shovel");
	}
}
