package bee.beeshroom.RubySapphire.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 2.0f);
        GameRegistry.addSmelting(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE, 1), 2.0f);
        GameRegistry.addSmelting(ModBlocks.EXPERIENCE_ORE, new ItemStack(Blocks.STONE, 1), 25.0f);
    }

}