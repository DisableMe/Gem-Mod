package disableme.mods.tutorial;

import net.minecraft.src.Block;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import disableme.mods.tutorial.common.CommonProxyTutorial;

@Mod(modid="Tutorialmod",name="Tutorial Mod",version="0.0.2")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class mod_tutorial {
	
	//Blocks
	public static Block TutorialBlock;
	public static Block GemBlock;
	public static Block TextureBlock;
	//Items
	public static Item GemStone;
	public static Item TutorialSword;
	public static Item GemPickaxe;
	public static Item GemShovel;
	public static Item GemChisel;
	public static Item Gem;
	public static Item GemHelmet;
	public static Item GemPlate;
	public static Item GemLegs;
	public static Item GemBoots;
	public static Item GemHoe;
	
	public int TutorialBlockID;
	public int GemBlockID;
	public int TextureBlockID;
	public int GemID;
	public int RawGemID;
	public int GemSwordID;
	public int GemPickaxeID;
	public int GemShovelID;
	public int GemChiselID;
	public int GemHoeID;
	
	/*
	 * Tool Material
	 */
	static EnumToolMaterial EnumToolMaterialTutorial = EnumHelper.addToolMaterial("Tutorial", 5, 200, 10.0F, 24, 30);
	static EnumToolMaterial EnumToolMaterialChisel = EnumHelper.addToolMaterial("Chisel", 5, 20, 0.2F, 2, 0);
	static EnumToolMaterial EnumGemToolMaterial = EnumHelper.addToolMaterial("GemTools", 5, 600, 10.0F, 6, 30);
	static EnumArmorMaterial EnumArmourMaterial = EnumHelper.addArmorMaterial("Armour", 35, new int[]{4,9,7,6}, 15);
	
	@SidedProxy(clientSide="disableme.mods.tutorial.client.ClientProxyTutorial", serverSide="disableme.mods.tutorial.common.CommonProxyTutorial")
	public static CommonProxyTutorial proxy;

	@PreInit
	public void PreLoad(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//Blocks
		TutorialBlockID = config.getOrCreateIntProperty("Gem Ore", Configuration.CATEGORY_BLOCK, 255).getInt();
		GemBlockID = config.getOrCreateIntProperty("Block of Gem", Configuration.CATEGORY_BLOCK, 3000).getInt();
		TextureBlockID = config.getOrCreateIntProperty("Texture Block", Configuration.CATEGORY_BLOCK, 3001).getInt();
		
		//Items
		GemID = config.getOrCreateIntProperty("Cut Gem", Configuration.CATEGORY_ITEM, 505).getInt();
		RawGemID = config.getOrCreateIntProperty("Raw Gem", Configuration.CATEGORY_ITEM, 500).getInt();
		GemSwordID = config.getOrCreateIntProperty("Gem Sword", Configuration.CATEGORY_ITEM, 501).getInt();
		GemPickaxeID = config.getOrCreateIntProperty("Gem Pickaxe", Configuration.CATEGORY_ITEM, 502).getInt();
		GemShovelID = config.getOrCreateIntProperty("Gem Shovel", Configuration.CATEGORY_ITEM, 503).getInt();
		GemChiselID = config.getOrCreateIntProperty("Gem Chisel", Configuration.CATEGORY_ITEM, 504).getInt();
		GemHoeID = config.getOrCreateIntProperty("Gem Hoe", Configuration.CATEGORY_ITEM, 510).getInt();
		
		config.save();
		
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		
		//Block Declaration
		TutorialBlock = new BlockTutorial(TutorialBlockID, 0).setBlockName("TutorialBlock").setHardness(1F).setResistance(5F);
		GemBlock = new GemBlock(GemBlockID, 1).setBlockName("GemBlock").setHardness(2F).setResistance(5F);
		TextureBlock = new BlockTextureBlock(TextureBlockID, 2).setBlockName("TextureBlock");
		//Item Declaration
		
		GemStone = new ItemTutorial(500).setItemName("GemStone").setIconIndex(0);
		TutorialSword = new ItemTutorialSword(501, EnumToolMaterialTutorial).setItemName("TutorialSword").setIconIndex(1);
		GemPickaxe = new GemPickaxe(502, EnumGemToolMaterial).setItemName("GemPickaxe").setIconIndex(2);
		GemShovel = new GemShovel(503, EnumGemToolMaterial).setItemName("GemShovel").setIconIndex(3);
		GemChisel = new GemChisel(504, EnumToolMaterialChisel).setItemName("GemChisel").setIconIndex(4);
		Gem = new ItemGem(GemID).setItemName("Gem").setIconIndex(5);
		GemHelmet = new GemHelmet(506,EnumArmourMaterial,ModLoader.addArmor("Helmet"),0).setItemName("GemHelmet").setIconIndex(6);
		GemPlate = new GemPlate(507,EnumArmourMaterial,ModLoader.addArmor("GemPlate"),1).setItemName("GemPlate").setIconIndex(7);
		GemLegs = new GemLegs(508,EnumArmourMaterial,ModLoader.addArmor("GemLegs"),2).setItemName("GemLegs").setIconIndex(8);
		GemBoots = new GemBoots(509,EnumArmourMaterial,ModLoader.addArmor("GemBoots"),3).setItemName("GemBoots").setIconIndex(9);
		GemHoe = new GemHoe(510,EnumGemToolMaterial).setItemName("GemHoe").setIconIndex(10);

		
		//Recipes
		GameRegistry.addRecipe(new ItemStack(TutorialBlock,1), new Object[]{
			"X X","   ","X X", 'X', Block.dirt
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.TutorialSword,1), new Object[]{
			" S "," S "," X ",'S',mod_tutorial.Gem,'X',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemChisel,1), new Object[]{
			"  X"," X ","S  ",'X',mod_tutorial.GemStone,'S',Item.stick
		});
		GameRegistry.addShapelessRecipe(new ItemStack(mod_tutorial.Gem,1), mod_tutorial.GemChisel, mod_tutorial.GemStone);
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemPickaxe,1), new Object[]{
			"XXX"," S "," S ",'X',mod_tutorial.Gem,'S',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemShovel,1), new Object[]{
			" X "," S "," S ",'X',mod_tutorial.Gem,'S',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemBlock,1), new Object[]{
			"XXX","XXX","XXX",'X',mod_tutorial.Gem
		});
		GameRegistry.addShapelessRecipe(new ItemStack(TextureBlock,1), new Object[]{
			Block.dirt
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemHelmet,1), new Object[]{
			"XXX","X X","   ",'X',mod_tutorial.Gem
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemPlate,1), new Object[]{
			"X X","XXX","XXX",'X',mod_tutorial.Gem
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemLegs,1), new Object[]{
			"XXX","X X","X X",'X',mod_tutorial.Gem
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemBoots,1), new Object[]{
			"   ","X X","X X",'X',mod_tutorial.Gem
		});
		GameRegistry.addRecipe(new ItemStack(mod_tutorial.GemHoe,1), new Object[]{
			" XX"," S "," S ",'X',mod_tutorial.Gem,'S',Item.stick
		});
		//Block Registration
		GameRegistry.registerBlock(TutorialBlock);
		GameRegistry.registerBlock(GemBlock);
		GameRegistry.registerBlock(TextureBlock);
		GameRegistry.registerWorldGenerator(new WorldGenTutorial());
		//Block Names
		LanguageRegistry.addName(TutorialBlock, "Tutorial Block");
		LanguageRegistry.addName(GemBlock, "Block of Gem");
		LanguageRegistry.addName(TextureBlock, "Texture Block");
		//Item Names
		LanguageRegistry.addName(GemStone, "Gem Stone");
		LanguageRegistry.addName(GemPickaxe, "Gem Pickaxe");
		LanguageRegistry.addName(GemShovel, "Gem Shovel");
		LanguageRegistry.addName(GemChisel, "Raw Gem Chisel");
		LanguageRegistry.addName(Gem, "Cut Gem");
		LanguageRegistry.addName(TutorialSword, "Sword of the Gods");
		LanguageRegistry.addName(GemHelmet , "Gem Helmet");
		LanguageRegistry.addName(GemPlate , "Gem Chestplate");
		LanguageRegistry.addName(GemLegs , "Gem Leggings");
		LanguageRegistry.addName(GemBoots , "Gem Boots");
		
		proxy.registerRenderThings();
	}
	
}
