package com.Luka.TestMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumPickaxe extends ItemPickaxe {

	protected TitaniumPickaxe(ToolMaterial material) {
		super(material);
		this.setRegistryName(TestMod.MODID,"titaniumPickaxe");
		this.setUnlocalizedName("titaniumPickaxe");
		GameRegistry.register(this);
	}

}
