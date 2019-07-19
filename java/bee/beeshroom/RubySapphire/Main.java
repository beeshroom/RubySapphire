package bee.beeshroom.RubySapphire;

import java.io.File;

import bee.beeshroom.RubySapphire.init.ModRecipes;
import bee.beeshroom.RubySapphire.tabs.RubySapphireTab;
import bee.beeshroom.RubySapphire.util.Reference;
import bee.beeshroom.RubySapphire.util.compat.OreDictionaryCompat;
//import bee.beeshroom.RubySapphire.util.handlers.ConfigHandler;
import bee.beeshroom.RubySapphire.util.handlers.RegistryHandler;
import bee.beeshroom.RubySapphire.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	
	public static File config;
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs rubysapphiretab = new RubySapphireTab("rubysapphiretab");
	
	/*@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy; */
	{
	
	}
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) //(RegistryHandler.PreInitRegistries(event);)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		//MinecraftForge.EVENT_BUS.register(new MobDropsHandler());	
		//ConfigHandler.registerConfig(event);
	}

	
			@EventHandler
			public static void init(FMLInitializationEvent event)
			{
				//MinecraftForge.EVENT_BUS.register(new LootHandler());

			    ModRecipes.init();
			    
			    OreDictionaryCompat.registerOres();
	
			}
			@EventHandler
			public static void Postinit(FMLPostInitializationEvent event)
			{
			
			}
}	


//ConfigHandler.registerConfig(event);

//ModRecipes.init();


