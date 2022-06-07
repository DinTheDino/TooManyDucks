
package net.mcreator.toomanyducks.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.toomanyducks.init.ToomanyducksModTabs;
import net.mcreator.toomanyducks.init.ToomanyducksModItems;

public abstract class RubberduckiumArmorItem extends ArmorItem {
	public RubberduckiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 75;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 30, 25, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 45;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ToomanyducksModItems.RUBBERDUCKIUM));
			}

			@Override
			public String getName() {
				return "rubberduckium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RubberduckiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS));
			setRegistryName("rubberduckium_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "toomanyducks:textures/models/armor/rubberduckium_layer_1.png";
		}
	}

	public static class Chestplate extends RubberduckiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS));
			setRegistryName("rubberduckium_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "toomanyducks:textures/models/armor/rubberduckium_layer_1.png";
		}
	}

	public static class Leggings extends RubberduckiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS));
			setRegistryName("rubberduckium_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "toomanyducks:textures/models/armor/rubberduckium_layer_2.png";
		}
	}

	public static class Boots extends RubberduckiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ToomanyducksModTabs.TAB_TOO_MANY_DUCKS));
			setRegistryName("rubberduckium_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "toomanyducks:textures/models/armor/rubberduckium_layer_1.png";
		}
	}
}
