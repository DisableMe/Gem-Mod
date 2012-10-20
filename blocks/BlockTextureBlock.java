package disableme.mods.tutorial;

import disableme.mods.tutorial.common.CommonProxyTutorial;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockTextureBlock extends Block {

	public BlockTextureBlock(int par1, int par2){
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public int getBlockTextureFromSide(int i){
		switch(i){
		case 0: return 2;
		case 1: return 3;
		default: return 4;
		}
	}
	public String getTextureFile(){
		return CommonProxyTutorial.BLOCKS_PNG;
	}

}
