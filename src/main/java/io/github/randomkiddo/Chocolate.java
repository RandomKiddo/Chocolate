/**
 * The Chocolate mod, repository, and source code is licensed under the GNU GPLv3 License
 * For more information, see: https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * Copyright © 2021 RandomKiddo
 */

package io.github.randomkiddo;

import io.github.randomkiddo.enchants.AdrenalineEnchantment;
import io.github.randomkiddo.enchants.LightweightEnchantment;
import io.github.randomkiddo.enchants.WinceEnchantment;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Chocolate implements ModInitializer {
	@Override
	public void onInitialize() {
		Registry.register(
				Registry.ENCHANTMENT,
				new Identifier("chocolate", "adrenaline"),
				new AdrenalineEnchantment()
		);
		Registry.register(
				Registry.ENCHANTMENT,
				new Identifier("chocolate", "lightweight"),
				new LightweightEnchantment()
		);
		Registry.register(
				Registry.ENCHANTMENT,
				new Identifier("chocolate", "wince"),
				new WinceEnchantment()
		);
	}
}
