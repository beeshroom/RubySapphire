package bee.beeshroom.RubySapphire.items.food;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood
{
	public ItemCustomFood(String name, int amount, boolean iswolffood)
	{
		super(amount, iswolffood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rubysapphiretab);
		
		ModItems.ITEMS.add(this);
		
	}
	/*@Override 
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	} */
}
