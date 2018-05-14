package automagetion.block;

import automagetion.Automagetion;
import automagetion.item.ItemAutomagetion;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSongwoodPlanks extends BlockAutomagetion
{
	/** Static self-instance for outside reference */
	public static BlockSongwoodPlanks songwoodPlanks;
	
	public BlockSongwoodPlanks() 
	{
		super(Material.wood); //Set material to wood
		this.setCreativeTab(ItemAutomagetion.tabAutomagetion);
		this.setStepSound(soundTypeWood);
		this.setHardness((float) 1.0);
		this.setResistance((float) 1.0);
	}
	
	public static void preInit()
	{
		songwoodPlanks = new BlockSongwoodPlanks();
		songwoodPlanks.setShortAndUnlocalizedName("songwood_planks");
		
		GameRegistry.registerBlock(songwoodPlanks, songwoodPlanks.getShortName());
	}
	
	public static void init()
	{
		Item itemSongwoodPlanks = Item.getItemFromBlock(songwoodPlanks);
		
		ItemAutomagetion.regForRendering(itemSongwoodPlanks); //Registers the block item for inventory rendering
	}
	
	/** Specifies some information about how the block is rendered while placed */
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.SOLID;
	}

}
