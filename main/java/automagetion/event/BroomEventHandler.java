package automagetion.event;

import automagetion.item.ItemBroom;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BroomEventHandler 
{
	/**
	 * Cancels pickup events if you're holding a broom
	 * @param event
	 */
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	@EventHandler
    public void pickupItem(EntityItemPickupEvent event)
    {
    	if (event.entityPlayer.getHeldItem() != null)
    	{
    		if (event.entityPlayer.getHeldItem().getItem() == ItemBroom.broom)
			{
	    		event.setCanceled(true);
			}
    	}
    }
	
	/** Registers this event handler */
	public static void init()
	{
		System.out.println("Automagetion: Registered BroomEventHandler");
		MinecraftForge.EVENT_BUS.register(new BroomEventHandler());
	}
}
