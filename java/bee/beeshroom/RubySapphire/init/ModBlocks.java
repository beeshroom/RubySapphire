package bee.beeshroom.RubySapphire.init;

import java.util.ArrayList;
import java.util.List;

import bee.beeshroom.RubySapphire.blocks.experience_ore;
import bee.beeshroom.RubySapphire.blocks.ruby_block;
import bee.beeshroom.RubySapphire.blocks.ruby_ore;
import bee.beeshroom.RubySapphire.blocks.sapphire_block;
import bee.beeshroom.RubySapphire.blocks.sapphire_ore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_ORE = new ruby_ore("ruby_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new sapphire_ore("sapphire_ore", Material.ROCK);
	public static final Block EXPERIENCE_ORE = new experience_ore("experience_ore", Material.ROCK);
	
	public static final Block RUBY_BLOCK = new ruby_block("ruby_block", Material.ROCK);
	public static final Block SAPPHIRE_BLOCK = new sapphire_block("sapphire_block", Material.ROCK);
}