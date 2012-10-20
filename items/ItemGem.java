package disableme.mods.tutorial;

import disableme.mods.tutorial.common.CommonProxyTutorial;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemGem extends Item {

	public ItemGem(int par1) {
		super(par1);
		this.setTabToDisplayOn(CreativeTabs.tabTools);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}

}
