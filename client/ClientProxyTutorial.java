package disableme.mods.tutorial.client;

import net.minecraftforge.client.MinecraftForgeClient;
import disableme.mods.tutorial.common.CommonProxyTutorial;

public class ClientProxyTutorial extends CommonProxyTutorial{
	
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/disableme/mods/tutorial/textures/blocks.png");
	}

}
