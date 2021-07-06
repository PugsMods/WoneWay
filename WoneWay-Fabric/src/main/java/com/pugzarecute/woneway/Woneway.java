/*
 * Copyright (C) 2021 PugzAreCute
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.pugzarecute.woneway;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Woneway implements ModInitializer {
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("woneway", "seethrough_diamond_ore"), new SeeThroughBlock());
        Registry.register(Registry.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(new SeeThroughBlock(), new FabricItemSettings().group(ItemGroup.MISC)));
        WoneWayBlocks.init();
    }
}
