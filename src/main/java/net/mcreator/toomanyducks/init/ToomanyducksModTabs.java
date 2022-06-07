
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanyducks.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ToomanyducksModTabs {
	public static CreativeModeTab TAB_TOO_MANY_DUCKS;

	public static void load() {
		TAB_TOO_MANY_DUCKS = new CreativeModeTab("tabtoo_many_ducks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ToomanyducksModItems.RUBBERDUCKIUM);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
