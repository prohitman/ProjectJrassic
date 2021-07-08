package com.prohitman.projectjurassic.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroups {
    public static final ItemGroup PROJECT_JURASSIC = (new ItemGroup("projectjurassic") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FILLED_AMBER.get());
        }
    }).hideTitle();
}
