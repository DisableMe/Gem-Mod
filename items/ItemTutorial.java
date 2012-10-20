package disableme.mods.tutorial;

import disableme.mods.tutorial.common.CommonProxyTutorial;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTutorial extends Item {

	public ItemTutorial(int par1) {
		super(par1);
		this.setTabToDisplayOn(CreativeTabs.tabMaterials);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}

}
