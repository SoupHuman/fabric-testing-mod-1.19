package net.souphuman.testingmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.souphuman.testingmod.TestingMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.souphuman.testingmod.item.ModItemGroups;

public class ModBlocks {


    public static final Block MONEY_BLOCK = registerBlock("money_block",
            new Block(FabricBlockSettings.of(Material.WOOL)), ModItemGroups.MONEY);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TestingMod.Mod_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TestingMod.Mod_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        TestingMod.LOGGER.info("Registering ModBlocks for " + TestingMod.Mod_ID);
    }
}
