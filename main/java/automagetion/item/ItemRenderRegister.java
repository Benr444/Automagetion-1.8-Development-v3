package automagetion.item;

import automagetion.Automagetion;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister 
{
	public static void registerItemRenderer() 
	{
		Minecraft.getMinecraft()
		.getRenderItem()
		.getItemModelMesher()
		.register(BasicItem.animo, 
				0, 
				new ModelResourceLocation(
						modid + 
						":" + 
						BasicItem.animo.getUnlocalizedName()
				.substring(5),
				"inventory"));
	}

	public static String modid = Automagetion.MODID;

	public static void reg(Item item) 
	{
	    //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}