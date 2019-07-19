package bee.beeshroom.RubySapphire.items.tools;

import java.util.List;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ToolPickaxe extends ItemPickaxe
{


	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rubysapphiretab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	
	/*
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add("unimplemented");
    } */
	
}
