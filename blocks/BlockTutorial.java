package disableme.mods.tutorial;

import java.util.Random;

import cpw.mods.fml.common.toposort.ModSorter;

import disableme.mods.tutorial.common.CommonProxyTutorial;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockTutorial extends Block {

	public BlockTutorial(int par1, int par2) {
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile(){
		return CommonProxyTutorial.BLOCKS_PNG;
	}
	public int idDropped(int par1, Random random, int par2){
        
        return mod_tutorial.GemStone.shiftedIndex;
        
}

public int quantityDropped(Random par1Random){
        return 1;
}

}
