package bee.beeshroom.RubySapphire.items;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item  {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rubysapphiretab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	  public boolean isBeaconPayment(ItemStack stack)
	    {
	        return this == ModItems.RUBY || this == ModItems.SAPPHIRE;
	    }
	
	/*@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
		
	} */

}
