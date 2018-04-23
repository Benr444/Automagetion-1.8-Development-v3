package automagetion.item;

import automagetion.Automagetion;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister 
{
	public static void registerItemRenderer() 
	{
		reg(BasicItem.chantRootFibers);
		reg(BasicItem.reedAssembly);
		reg(BasicItem.songPaper);
		reg(BasicItem.animo);
		reg(BasicItem.bellum);
		reg(BasicItem.caelum);
		reg(BasicItem.calor);
		reg(BasicItem.cantio);
		reg(BasicItem.creo);
		reg(BasicItem.evorsio);
		reg(BasicItem.funus);
		reg(BasicItem.imperium);
		reg(BasicItem.inanis);
		reg(BasicItem.infernum);
		reg(BasicItem.irrigus);
		reg(BasicItem.mundus);
		reg(BasicItem.natura);
		reg(BasicItem.pax);
		reg(BasicItem.sopio);
	}

	public static String modid = Automagetion.MODID;

	public static void reg(Item item) 
	{
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}