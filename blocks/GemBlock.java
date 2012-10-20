package disableme.mods.tutorial;

import disableme.mods.tutorial.common.CommonProxyTutorial;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class GemBlock extends Block {

	public GemBlock(int par1, int par2) {
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile(){
		return CommonProxyTutorial.BLOCKS_PNG;
	}

}
