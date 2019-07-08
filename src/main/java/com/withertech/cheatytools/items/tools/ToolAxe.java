package com.withertech.cheatytools.items.tools;

import com.withertech.cheatytools.Main;
import com.withertech.cheatytools.init.ModItems;
import com.withertech.cheatytools.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{
	
	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 1000000000.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
