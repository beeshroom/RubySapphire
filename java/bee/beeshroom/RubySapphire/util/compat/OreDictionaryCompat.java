package bee.beeshroom.RubySapphire.util.compat;

import bee.beeshroom.RubySapphire.init.ModBlocks;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("oreRuby", ModBlocks.RUBY_ORE);
		OreDictionary.registerOre("gemRuby", ModItems.RUBY);
		OreDictionary.registerOre("oreSapphire", ModBlocks.SAPPHIRE_ORE);
		OreDictionary.registerOre("gemSapphire", ModItems.SAPPHIRE);
}
}
