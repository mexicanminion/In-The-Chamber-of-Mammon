package net.chamber.item;

import net.chamber.InTheChamberOfMammon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // ----------------
    //  ADDING ITEMS TO MINECRAFT
    // ----------------
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item PALACINKY = registerItem("palacinky", new Item(new FabricItemSettings()));

    // ----------------
    //  ADDING ITEMS TO CREATIVE TAB MENU
    // ----------------
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(RUBY);
    }
    private static void addItemsToFoodAndDrinksTabItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(PALACINKY);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(InTheChamberOfMammon.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        InTheChamberOfMammon.LOGGER.info("Registering Mod Items for " + InTheChamberOfMammon.MOD_ID);

        // Adds items to the Ingredients tab in the Tab Menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);

        // Adds items to the Food & Drinks tab in the Tab Menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinksTabItemGroup);
    }
}
