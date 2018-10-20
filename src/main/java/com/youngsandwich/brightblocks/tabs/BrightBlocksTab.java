package com.youngsandwich.brightblocks.tabs;

import com.youngsandwich.brightblocks.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BrightBlocksTab extends CreativeTabs
	{
		public BrightBlocksTab(String label)
		{
			super("brightblockstab");
		}
		
		public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.BRIGHT_COBBLESTONE);
	}

}

