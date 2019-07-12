package com.withertech.cheatytools.items.food;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase
{
	List<PotionEffect> effectList;
	PotionEffect effect;
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isAnimalFood, List<PotionEffect> effectList)
	{
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		
		this.effectList = effectList;
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			for(int i = 0; i < effectList.size(); i++)
			{
				effect = effectList.get(i);
				player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));

			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
}
