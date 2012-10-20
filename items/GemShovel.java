package disableme.mods.tutorial;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSpade;
import disableme.mods.tutorial.common.CommonProxyTutorial;

public class GemShovel extends ItemSpade{
	
	public GemShovel(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}
	
}
