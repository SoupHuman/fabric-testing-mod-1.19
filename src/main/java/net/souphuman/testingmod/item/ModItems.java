package net.souphuman.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.souphuman.testingmod.TestingMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item MONEY = registerItem("money",
            new Item(new FabricItemSettings()));
    public static final Item RAW_MONEY = registerItem("raw_money",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TestingMod.Mod_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroups.MONEY, MONEY);
        addToItemGroup(ModItemGroups.MONEY, RAW_MONEY);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems() {
        TestingMod.LOGGER.info("Registering Mod Items for Testing Mod");
        addItemsToItemGroup();
    }

}
