package disableme.mods.tutorial;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;
import disableme.mods.tutorial.common.CommonProxyTutorial;

public class GemHoe extends ItemHoe{
	
	public GemHoe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}
	
}
