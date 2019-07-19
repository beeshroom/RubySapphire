package bee.beeshroom.RubySapphire.tabs;

import bee.beeshroom.RubySapphire.init.ModBlocks;
import bee.beeshroom.RubySapphire.init.ModItems;
import bee.beeshroom.RubySapphire.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RubySapphireTab extends CreativeTabs
{
	public RubySapphireTab(String label) {super("rubysapphiretab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.RUBY_ORE);}

	}

	
