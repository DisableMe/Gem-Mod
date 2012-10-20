package disableme.mods.tutorial;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import disableme.mods.tutorial.common.CommonProxyTutorial;

public class GemPickaxe extends ItemPickaxe{
	
	public GemPickaxe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}
	
}
