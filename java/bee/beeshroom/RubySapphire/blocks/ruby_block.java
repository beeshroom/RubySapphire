package bee.beeshroom.RubySapphire.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ruby_block extends BlockBase {

	public ruby_block(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(29.0F);
		setHarvestLevel("pickaxe", 0);
	}
}