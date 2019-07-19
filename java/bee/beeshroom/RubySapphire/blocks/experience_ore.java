package bee.beeshroom.RubySapphire.blocks;

import java.util.Random;

import bee.beeshroom.RubySapphire.init.ModBlocks;
import bee.beeshroom.RubySapphire.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class experience_ore extends BlockBase {

	public experience_ore(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(6.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.3f);
	}
    /**
     * Get the quantity dropped based on the given fortune level
     */
		public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp(this.quantityDropped(random) + random.nextInt(fortune + 1), 0, 0);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
*/
   public int quantityDropped()
    {
	   return 0;
	   
    }
   
 
       
    /**
     * Get the Item that this Block should drop when harvested.*/
     
    public Item getItemDropped(World worldIn, EntityPlayer playerIn)
    {
        return Items.AIR;
         
    } 

    //xp
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        //Random rand = world instanceof World ? ((World)world).rand : new Random();
     /*   if (this.getItemDropped(/*state, rand, fortune) != Item.getItemFromBlock(this))
        {
          int i = 0;

            {
                i = MathHelper.getInt(rand, 1, 5);
            }

            return i;
        } */
        return 22; 
    } 
    
    //TESTING
    

   /* @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, Random rand)
    {
        {
            this.spawnParticles(worldIn, pos);
        }
    }

    private void spawnParticles(World worldIn, BlockPos pos)
    {
        Random random = worldIn.rand;
        double d0 = 0.0625D;

        for (int i = 0; i < 6; ++i)
        {
            double d1 = (double)((float)pos.getX() + random.nextFloat());
            double d2 = (double)((float)pos.getY() + random.nextFloat());
            double d3 = (double)((float)pos.getZ() + random.nextFloat());

            if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube())
            {
                d2 = (double)pos.getY() + 0.0625D + 1.0D;
            }

            if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube())
            {
                d2 = (double)pos.getY() - 0.0625D;
            }

            if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube())
            {
                d3 = (double)pos.getZ() + 0.0625D + 1.0D;
            }

            if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube())
            {
                d3 = (double)pos.getZ() - 0.0625D;
            }

            if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube())
            {
                d1 = (double)pos.getX() + 0.0625D + 1.0D;
            }

            if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube())
            {
                d1 = (double)pos.getX() - 0.0625D;
            }

            if (d1 < (double)pos.getX() || d1 > (double)(pos.getX() + 1) || d2 < 0.0D || d2 > (double)(pos.getY() + 1) || d3 < (double)pos.getZ() || d3 > (double)(pos.getZ() + 1))
            {
                worldIn.spawnParticle(EnumParticleTypes.BLOCK_CRACK, d1, d2, d3, 0.0D, 0.0D, 0.0D);
            }
        }
    } */
}