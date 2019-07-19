package bee.beeshroom.RubySapphire.items;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item  {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rubysapphiretab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	/*@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
		
	} */

}
