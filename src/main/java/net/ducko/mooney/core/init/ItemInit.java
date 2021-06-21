package net.ducko.mooney.core.init;

import net.ducko.mooney.Mooney;
import net.ducko.mooney.common.items.CoinPress;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			Mooney.MOD_ID);
	
	public static final RegistryObject<Item> CRESCENT_COIN = ITEMS.register("crescent_coin", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(16)));
	
	public static final RegistryObject<Item> QUARTER_COIN = ITEMS.register("quarter_coin", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(16)));
	
	public static final RegistryObject<Item> GIBBOUN_COIN = ITEMS.register("gibboun_coin", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(16)));
	
	public static final RegistryObject<Item> MOON_COIN = ITEMS.register("moon_coin", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(16)));
	
	public static final RegistryObject<Item> MOON_KEY = ITEMS.register("coin_press", 
			() -> new CoinPress(new Item.Properties()
					.tab(ItemGroup.TAB_MISC)
					.stacksTo(1)
					.fireResistant()));
}
