/*/*
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
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or combining it with Minecraft (or a modified version of that library),
 * containing parts covered by the terms of All Rights Reserved, the licensors of this Program grant you additional permission to convey the resulting work.
 * {Corresponding Source for a non-source form of such a combination shall include the source code for the parts of Minecraft used as well as that of the covered work.}
 *\/
//BROKEN CLASS DUE TO 1.17.1
package com.pugzarecute.woneway.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.*;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

@JeiPlugin
public class WoneWayJei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return null;
    }

    @Override
    public void registerItemSubtypes(@Nonnull ISubtypeRegistration registration) {}

    @Override
    public void registerIngredients(@Nonnull IModIngredientRegistration registration) {}

    @Override
    public void registerCategories(@Nonnull IRecipeCategoryRegistration registration) {}

    @Override
    public void registerVanillaCategoryExtensions(@Nonnull IVanillaCategoryExtensionRegistration registration) {}

    @Override
    public void registerRecipes(@Nonnull IRecipeRegistration registration) {}

    @Override
    public void registerRecipeTransferHandlers(@Nonnull IRecipeTransferRegistration registration) {}

    @Override
    public void registerRecipeCatalysts(@Nonnull IRecipeCatalystRegistration registration) {}

    @Override
    public void registerGuiHandlers(@Nonnull IGuiHandlerRegistration registration) {}

    @Override
    public void registerAdvanced(@Nonnull IAdvancedRegistration registration) {}

    @Override
    public void onRuntimeAvailable(@Nonnull IJeiRuntime jeiRuntime) {}
}
*/