package net.chamber.item;

import net.chamber.InTheChamberOfMammon;
import net.chamber.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // ----------------
    // ADDING MOD ITEMS TO THEIR OWN GROUP
    // ----------------
    public static final ItemGroup CHAMBER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(InTheChamberOfMammon.MOD_ID, "chamber"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chamber"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);

                        entries.add(ModItems.PALACINKY);
                    }).build());

    public static void registerItemGroups()
    {
        InTheChamberOfMammon.LOGGER.info("Registering Item Groups for " + InTheChamberOfMammon.MOD_ID);
    }
}
