package net.ducko.mooney.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoinPress extends Item {

	public CoinPress(Properties properties) {
		super(properties);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		return stack.copy();
	}

	
	
}
