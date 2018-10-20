package com.youngsandwich.brightblocks.blocks;

import com.youngsandwich.brightblocks.BrightBlocks;
import com.youngsandwich.brightblocks.init.ModBlocks;
import com.youngsandwich.brightblocks.init.ModItems;
import com.youngsandwich.brightblocks.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;



public class BrightBlockBase extends Block implements IHasModel
{
	public BrightBlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BrightBlocks.brightblockstab);
		setLightLevel(1.0F);
		setSoundType(SoundType.GLASS);
		setHardness(0.3F);

      
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	



	@Override
	public void registerModels() 
	{
		BrightBlocks.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}