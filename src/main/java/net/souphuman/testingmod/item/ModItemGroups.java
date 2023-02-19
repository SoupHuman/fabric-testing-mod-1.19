package net.souphuman.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.souphuman.testingmod.TestingMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup TEST;

    public static void registerItemGroups() {
        TEST = FabricItemGroup.builder(new Identifier(TestingMod.Mod_ID, "test"))
                .displayName(Text.translatable("itemgroup.test"))
                .icon(() -> new ItemStack(ModItems.FLORIDA)).build();
    }
}
