package disableme.mods.tutorial;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTutorial implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		switch(world.provider.worldType){
		
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		
		}

	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10;i++){
		int Xcoord = blockX+random.nextInt(16);
		int Ycoord = random.nextInt(16);
		int Zcoord = blockZ+random.nextInt(16);
		
		(new WorldGenMinable(disableme.mods.tutorial.mod_tutorial.TutorialBlock.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
