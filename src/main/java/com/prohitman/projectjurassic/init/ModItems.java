package com.prohitman.projectjurassic.init;

import com.prohitman.projectjurassic.ProjectJurassic;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectJurassic.MOD_ID);

    public static final RegistryObject<Item> EMPTY_AMBER = ITEMS.register("empty_amber", () -> new Item(new Item.Properties().stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));
    public static final RegistryObject<Item> FILLED_AMBER = ITEMS.register("filled_amber", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> VELOCIRAPTOR_MEAT = ITEMS.register("velociraptor_meat", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build()).stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));
    public static final RegistryObject<Item> TYRANNOSAURUS_MEAT = ITEMS.register("tyrannosaurus_meat", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build()).stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));
    public static final RegistryObject<Item> TRICERATOPS_MEAT = ITEMS.register("triceratops_meat", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build()).stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));
    public static final RegistryObject<Item> GALLIMIMUS_MEAT = ITEMS.register("gallimimus_meat", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build()).stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));
    public static final RegistryObject<Item> DILOPHOSAURUS_MEAT = ITEMS.register("dilophosaurus_meat", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build()).stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));
    public static final RegistryObject<Item> BRACHIOSAURUS_MEAT = ITEMS.register("brachiosaurus_meat", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build()).stacksTo(64).tab(ModItemGroups.PROJECT_JURASSIC)));

}
