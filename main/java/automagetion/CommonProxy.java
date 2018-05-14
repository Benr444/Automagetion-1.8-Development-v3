package automagetion;

import automagetion.block.BlockAutomagetion;
import automagetion.event.BroomEventHandler;
import automagetion.item.ItemAutomagetion;
import automagetion.item.ItemBasic;
import automagetion.item.ItemMelody;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent e) 
    {
    	//Block and Item Reference Creation
		System.out.println("PREINIT");
    	BlockAutomagetion.preInit();
    	ItemAutomagetion.preInit();
    	
    	//Event Registry, Things that are dependent on item existance
    	BroomEventHandler.init();
    	AutomagetionRecipes.init();
    }

    public void init(FMLInitializationEvent e) 
    {
    	BlockAutomagetion.init();
    	ItemAutomagetion.init();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}