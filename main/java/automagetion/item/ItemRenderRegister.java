package automagetion.item;

import automagetion.Automagetion;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister 
{
	public static String modid = Automagetion.MODID;

	public static void reg(ItemAutomagetion item) 
	{
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getShortName(), "inventory"));
	}
}