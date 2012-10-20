package disableme.mods.tutorial;

import disableme.mods.tutorial.common.CommonProxyTutorial;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;

public class GemBoots extends ItemArmor{

	public GemBoots(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
		this.setTabToDisplayOn(CreativeTabs.tabCombat);
	}
	public String getArmorTextureFile(ItemStack par1){
		if(par1.itemID==mod_tutorial.GemHelmet.shiftedIndex||par1.itemID==mod_tutorial.GemPlate.shiftedIndex||par1.itemID==mod_tutorial.GemBoots.shiftedIndex){
			return "/disableme/mods/tutorial/textures/armor1";
		}if(par1.itemID==mod_tutorial.GemLegs.shiftedIndex){
			return "/disableme/mods/tutorial/textures/armor2";
		}return "/disableme/mods/tutorial/textures/armor2";
		
	}
	
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}

}