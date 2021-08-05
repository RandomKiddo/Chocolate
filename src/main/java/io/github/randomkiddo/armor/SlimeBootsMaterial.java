/**
 * The Chocolate mod, repository, and source code is licensed under the GNU GPLv3 License
 * For more information, see: https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * Copyright © 2021 RandomKiddo
 */

package io.github.randomkiddo.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SlimeBootsMaterial implements ArmorMaterial {
    @Override public int getDurability(EquipmentSlot slot) { return 55; }
    @Override public int getProtectionAmount(EquipmentSlot slot) { return 1; }
    @Override public int getEnchantability() { return 1; }
    @Override public SoundEvent getEquipSound() { return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER; }
    @Override public Ingredient getRepairIngredient() { return Ingredient.ofItems(Items.SLIME_BLOCK); }
    @Override public String getName() { return "SlimeBootsMaterial"; }
    @Override public float getToughness() { return 1.0f; }
    @Override public float getKnockbackResistance() { return 0.0f; }
}
