package automagetion;

import automagetion.item.BasicItem;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent e) 
    {
    	//initialize all items
    }

    public void init(FMLInitializationEvent e) 
    {
    	BasicItem.init();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}