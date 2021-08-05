/**
 * The Chocolate mod, repository, and source code is licensed under the GNU GPLv3 License
 * For more information, see: https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * Copyright © 2021 RandomKiddo
 */

package io.github.randomkiddo.armor;

import io.github.randomkiddo.Chocolate;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlimeBootsRegistry {
    public static final ArmorMaterial ARMOR_MATERIAL = new SlimeBootsMaterial();
    public static final Item SLIME_BOOTS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.FEET,
            new Item.Settings().group(Chocolate.CHOCOLATE_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("chocolate", "slime_boots"), SLIME_BOOTS);
    }
}
