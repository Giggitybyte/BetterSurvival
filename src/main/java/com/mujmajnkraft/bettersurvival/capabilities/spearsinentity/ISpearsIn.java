package com.mujmajnkraft.bettersurvival.capabilities.spearsinentity;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

public interface ISpearsIn {
	
	public void addSpear (ItemStack spear);
	
	public ArrayList<ItemStack> getSpearsIn();

}
