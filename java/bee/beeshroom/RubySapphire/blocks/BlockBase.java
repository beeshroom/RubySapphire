package bee.beeshroom.RubySapphire.blocks;

import bee.beeshroom.RubySapphire.Main;
import bee.beeshroom.RubySapphire.init.ModBlocks;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBase extends Block
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rubysapphiretab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	 public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
	    {
	        return this == ModBlocks.RUBY_BLOCK || this == ModBlocks.SAPPHIRE_BLOCK;
	    }
	
	
	/*@Override
	public void registerModels()
	{

		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}*/

}
