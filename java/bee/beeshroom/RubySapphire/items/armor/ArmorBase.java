package bee.beeshroom.RubySapphire.items.armor;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.rubysapphiretab);
			
			ModItems.ITEMS.add(this);
	}

}
