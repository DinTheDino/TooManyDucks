
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanyducks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.toomanyducks.item.RubberduckiumSwordItem;
import net.mcreator.toomanyducks.item.RubberduckiumShovelItem;
import net.mcreator.toomanyducks.item.RubberduckiumPickaxeItem;
import net.mcreator.toomanyducks.item.RubberduckiumItem;
import net.mcreator.toomanyducks.item.RubberduckiumHoeItem;
import net.mcreator.toomanyducks.item.RubberduckiumAxeItem;
import net.mcreator.toomanyducks.item.RubberduckiumArmorItem;
import net.mcreator.toomanyducks.item.NineteenDollarFortniteCardItem;
import net.mcreator.toomanyducks.item.MegaBreadItem;
import net.mcreator.toomanyducks.item.GunStockItem;
import net.mcreator.toomanyducks.item.GunMiddleItem;
import net.mcreator.toomanyducks.item.FortnitescarItem;
import net.mcreator.toomanyducks.item.ChickennuggetItem;
import net.mcreator.toomanyducks.item.ChickenNuggetPantsItem;
import net.mcreator.toomanyducks.item.BulletItem;
import net.mcreator.toomanyducks.item.BreadcrumbsnotrecipeItem;
import net.mcreator.toomanyducks.item.BarrelItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToomanyducksModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RUBBERDUCKIUM = register(new RubberduckiumItem());
	public static final Item RUBBERDUCKIUM_ORE = register(ToomanyducksModBlocks.RUBBERDUCKIUM_ORE, ToomanyducksModTabs.TAB_TOO_MANY_DUCKS);
	public static final Item RUBBERDUCKIUM_BLOCK = register(ToomanyducksModBlocks.RUBBERDUCKIUM_BLOCK, ToomanyducksModTabs.TAB_TOO_MANY_DUCKS);
	public static final Item RUBBERDUCKIUM_PICKAXE = register(new RubberduckiumPickaxeItem());
	public static final Item RUBBERDUCKIUM_AXE = register(new RubberduckiumAxeItem());
	public static final Item RUBBERDUCKIUM_SWORD = register(new RubberduckiumSwordItem());
	public static final Item RUBBERDUCKIUM_SHOVEL = register(new RubberduckiumShovelItem());
	public static final Item RUBBERDUCKIUM_HOE = register(new RubberduckiumHoeItem());
	public static final Item RUBBERDUCKIUM_ARMOR_HELMET = register(new RubberduckiumArmorItem.Helmet());
	public static final Item RUBBERDUCKIUM_ARMOR_CHESTPLATE = register(new RubberduckiumArmorItem.Chestplate());
	public static final Item RUBBERDUCKIUM_ARMOR_LEGGINGS = register(new RubberduckiumArmorItem.Leggings());
	public static final Item RUBBERDUCKIUM_ARMOR_BOOTS = register(new RubberduckiumArmorItem.Boots());
	public static final Item MEGA_BREAD = register(new MegaBreadItem());
	public static final Item CHICKENNUGGET = register(new ChickennuggetItem());
	public static final Item BREADCRUMBSNOTRECIPE = register(new BreadcrumbsnotrecipeItem());
	public static final Item CHICKEN_NUGGET_ORE = register(ToomanyducksModBlocks.CHICKEN_NUGGET_ORE, ToomanyducksModTabs.TAB_TOO_MANY_DUCKS);
	public static final Item FORTNITESCAR = register(new FortnitescarItem());
	public static final Item BULLET = register(new BulletItem());
	public static final Item CHICKEN_NUGGET_PANTS_LEGGINGS = register(new ChickenNuggetPantsItem.Leggings());
	public static final Item BARREL = register(new BarrelItem());
	public static final Item NINETEEN_DOLLAR_FORTNITE_CARD = register(new NineteenDollarFortniteCardItem());
	public static final Item GUN_MIDDLE = register(new GunMiddleItem());
	public static final Item GUN_STOCK = register(new GunStockItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
