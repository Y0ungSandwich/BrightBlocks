package com.youngsandwich.brightblocks;

import com.youngsandwich.brightblocks.proxy.CommonProxy;
import com.youngsandwich.brightblocks.tabs.BrightBlocksTab;
import com.youngsandwich.brightblocks.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.Version )
public class BrightBlocks 
{
	public static final CreativeTabs brightblockstab = new BrightBlocksTab("brightblockstab");
	
	@Instance
	public static BrightBlocks instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
