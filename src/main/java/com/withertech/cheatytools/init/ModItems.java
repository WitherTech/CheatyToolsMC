package com.withertech.cheatytools.init;

import java.util.ArrayList;
import java.util.List;

import com.withertech.cheatytools.items.ItemBase;
import com.withertech.cheatytools.items.armor.ArmorBase;
import com.withertech.cheatytools.items.tools.ToolAxe;
import com.withertech.cheatytools.items.tools.ToolPickaxe;
import com.withertech.cheatytools.items.tools.ToolSpade;
import com.withertech.cheatytools.items.tools.ToolSword;
import com.withertech.cheatytools.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_CHEATY = EnumHelper.addToolMaterial("material_cheaty", 1000000000, 1000000000, 1000000000.0F, 1000000000.0F, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_CHEATY = EnumHelper.addArmorMaterial("armor_material_cheaty", Reference.MOD_ID + ":cheaty", 1000000000, new int[] {1000000000, 1000000000, 1000000000, 1000000000}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Items
	//public static final Item SUPER_CHEATY_TEMP = new ItemBase("super_cheaty_temp");
	
	//Tools
	public static final ItemSword SUPER_CHEATY_SWORD = new ToolSword("super_cheaty_sword", MATERIAL_CHEATY);
	public static final ItemSpade SUPER_CHEATY_SHOVEL = new ToolSpade("super_cheaty_shovel", MATERIAL_CHEATY);
	public static final ItemPickaxe SUPER_CHEATY_PICKAXE = new ToolPickaxe("super_cheaty_pickaxe", MATERIAL_CHEATY);
	public static final ItemAxe SUPER_CHEATY_AXE = new ToolAxe("super_cheaty_axe", MATERIAL_CHEATY);
	
	//Armor
	public static final Item SUPER_CHEATY_HELMET = new ArmorBase("super_cheaty_helmet", ARMOR_MATERIAL_CHEATY, 1, EntityEquipmentSlot.HEAD);
	public static final Item SUPER_CHEATY_CHESTPLATE = new ArmorBase("super_cheaty_chestplate", ARMOR_MATERIAL_CHEATY, 1, EntityEquipmentSlot.CHEST);
	public static final Item SUPER_CHEATY_LEGGINGS = new ArmorBase("super_cheaty_leggings", ARMOR_MATERIAL_CHEATY, 2, EntityEquipmentSlot.LEGS);
	public static final Item SUPER_CHEATY_BOOTS = new ArmorBase("super_cheaty_boots", ARMOR_MATERIAL_CHEATY, 1, EntityEquipmentSlot.FEET);
	
}
