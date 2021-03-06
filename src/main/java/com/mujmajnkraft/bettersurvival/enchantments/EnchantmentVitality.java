package com.mujmajnkraft.bettersurvival.enchantments;

import com.mujmajnkraft.bettersurvival.Reference;
import com.mujmajnkraft.bettersurvival.config.ConfigHandler;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentVitality extends Enchantment {
	public EnchantmentVitality() {
		super(Rarity.RARE, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[]{EntityEquipmentSlot.CHEST});
		this.setRegistryName("vitality");
		this.setName(Reference.MOD_ID + ".vitality");
	}
	
	/**
     * Returns the minimal value of enchantability needed on the enchantment level passed.
     */
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 20 + 15 * (enchantmentLevel - 1);
    }

    /**
     * Returns the maximum value of enchantability nedded on the enchantment level passed.
     */
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 40;
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    public int getMaxLevel()
    {
        return ConfigHandler.vitalitylevel;
    }
    
    public boolean isTreasureEnchantment()
    {
    	if (ConfigHandler.vitality)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	
	public boolean isAllowedOnBooks()
    {
		if (ConfigHandler.vitalitylevel == 0)
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }
}
