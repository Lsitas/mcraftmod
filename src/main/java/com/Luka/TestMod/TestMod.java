package com.Luka.TestMod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod {
	public static final String MODID = "testmod";
	public static final String VERSION = "1.0";
	public static ToolMaterial titaniumMaterial;
	public static Item titaniumPickaxe;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		titaniumMaterial = EnumHelper.addToolMaterial("Titanium", 3,1561, 40f,20f,10);
		titaniumPickaxe = new TitaniumPickaxe(titaniumMaterial);
		if(event.getSide() == Side.CLIENT){
			registerItems();
		}
		
		addRecipies();
	}
	public void registerItems(){
		ModelLoader.setCustomModelResourceLocation(titaniumPickaxe,0,new ModelResourceLocation(titaniumPickaxe.getRegistryName(),"inventory"));
	}
	
	
	public void addRecipies(){
		GameRegistry.addRecipe(new ItemStack(titaniumPickaxe,1), new Object[]{
				"ttt"," s "," s ",
				Character.valueOf('t'),Blocks.DIRT,
				Character.valueOf('s'),Items.STICK
				
		});
		
	
		
	}
	
	
	
	
	
	
}
