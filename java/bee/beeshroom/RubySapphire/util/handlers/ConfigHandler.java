/* package bee.beeshroom.RubySapphire.util.handlers;

import java.io.File;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
public static Configuration config;



public static Boolean SpawnSapphireOre;

public static void init(File file)
{
	config = new Configuration(file);
	
	String category;
	
	category = "Sapphire";
	config.addCustomCategoryComment(category, "Should Sapphires spawn in the world?");
			SpawnSapphireOre = config.getBoolean("SpawnSapphireOre", category, true, "Should Sapphires spawn in the world?");
			
			config.save();
}

	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
			
}


}
*/