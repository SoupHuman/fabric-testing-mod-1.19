package net.souphuman.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.souphuman.testingmod.TestingMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup MONEY;

    public static void registerItemGroups() {
        MONEY = FabricItemGroup.builder(new Identifier(TestingMod.Mod_ID, "money"))
                .displayName(Text.translatable("itemgroup.money"))
                .icon(() -> new ItemStack(ModItems.MONEY)).build();
    }
}
