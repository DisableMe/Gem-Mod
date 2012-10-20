package disableme.mods.tutorial;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemSword;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import disableme.mods.tutorial.common.CommonProxyTutorial;

public class ItemTutorialSword extends ItemSword{
	
	public ItemTutorialSword(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		this.setTabToDisplayOn(CreativeTabs.tabCombat);
	}
	public String getTextureFile(){
		return CommonProxyTutorial.ITEMS_PNG;
	}
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.epic;
	}
	
}
