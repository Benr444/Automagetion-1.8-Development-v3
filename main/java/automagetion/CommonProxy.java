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
    	BroomEventHandler.register();
    }

    public void init(FMLInitializationEvent e) 
    {
    	ItemAutomagetion.init();
    	BlockAutomagetion.init();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}