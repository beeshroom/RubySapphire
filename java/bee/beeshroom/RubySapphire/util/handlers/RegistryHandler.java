package bee.beeshroom.RubySapphire.util.handlers;


import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import bee.beeshroom.RubySapphire.init.ModBlocks;
import bee.beeshroom.RubySapphire.init.ModItems;
import bee.beeshroom.RubySapphire.init.ModRecipes;
import bee.beeshroom.RubySapphire.util.Reference;
import bee.beeshroom.RubySapphire.util.compat.OreDictionaryCompat;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public final class RegistryHandler {

	private static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID + " Event Subscriber");

	private static int entityId = 0; 
	
	
	
	
	
/*@EventBusSubscriber
public class RegistryHandler
{   
*/
	
@SubscribeEvent

public static void onItemRegister(RegistryEvent.Register<Item> event)
{
	event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
}

@SubscribeEvent

public static void onBlockRegister(RegistryEvent.Register<Block> event)
{
	event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
}

@SubscribeEvent
public static void onRegisterEntitiesEvent(@Nonnull final RegistryEvent.Register<EntityEntry> event) {

 //   final ResourceLocation EntityCreeperPrint = new ResourceLocation(Reference.MOD_ID, "entitycreeperprint");

/*    event.getRegistry().registerAll(
        EntityEntryBuilder.create()
            .entity(EntityCreeperPrint.class)
            .id(EntityCreeperPrint, entityId++)
            .name(EntityCreeperPrint.getResourcePath())
            .tracker(32, 10, false)
            .build(),
         
                 
    ); */

    LOGGER.debug("Registered entities");

}






/*
@SubscribeEvent

public static void onModelRegister(ModelRegistryEvent event)
{
	for(Item item : ModItems.ITEMS)
	{
		if(item instanceof IHasModel)
		{
			((IHasModel)item).registerModels();
		}
	}
	for(Block block : ModBlocks.BLOCKS)
	{
		if(block instanceof IHasModel)
		{
			((IHasModel)block).registerModels();
		}
	}
	
} */

/*	
@SubscribeEvent
public static void furnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event)
{
	if(event.getItemStack().getItem() == Item.getItemFromBlock(ModBlocks.BLAZERODBUNDLE))
	{
		event.setBurnTime(24000);
	}
	
	if(event.getItemStack().getItem() == Item.getItemFromBlock(ModBlocks.STICKBUNDLE))
	{
		event.setBurnTime(1000);
	}
	
} */

}
