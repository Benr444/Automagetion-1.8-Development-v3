package automagetion.event;

import automagetion.item.ItemBroom;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BroomEventHandler 
{
	/**
	 * Cancels pickup events if you're holding a broom
	 * @param event
	 */
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void pickupItem(EntityItemPickupEvent event)
    {
		System.out.print("A player picked up an item");
    	if (event.entityPlayer.getHeldItem().getUnlocalizedName() == ItemBroom.broom.getUnlocalizedName())
    	{
    		System.out.println("    That player held a broom");
    		event.setCanceled(true);
    	}
    }
	
	/** Registers this event handler */
	public static void register()
	{
		MinecraftForge.EVENT_BUS.register(BroomEventHandler.class);
	}
}
