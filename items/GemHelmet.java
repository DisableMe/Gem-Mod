package disableme.mods.tutorial;

import disableme.mods.tutorial.common.CommonProxyTutorial;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class GemHelmet extends ItemArmor implements IArmorTextureProvider{

	public GemHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
		this.setTabToDisplayOn(CreativeTabs.tabCombat);
	}
	public String getArmorTextureFile(ItemStack par1){
		if(par1.itemID==mod_tutorial.GemHelmet.shiftedIndex||par1.itemID==mod_tutorial.GemPlate.shiftedIndex||par1.itemID==mod_tutorial.GemBoots.shiftedIndex){
			return "/textures/armor1";
		}if(par1.itemID==mod_tutorial.GemLegs.shiftedIndex){
			return "/textures/armor2";
		}return "/textures/armor2";
		
	}
	
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}
	

}
