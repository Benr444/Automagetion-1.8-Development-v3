package automagetion.block;

import automagetion.item.ItemAutomagetion;
import automagetion.item.ItemBlockAutomagetion;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSongwoodPlanks extends BlockAutomagetion
{
	/** Static self-instance for outside reference */
	public static BlockSongwoodPlanks songwoodPlanks;

	/** Reference to inventory version */
	public static ItemBlockAutomagetion itemSongwoodPlanks;
	
	public BlockSongwoodPlanks() 
	{
		super(Material.wood); //Set material to wood
		this.setCreativeTab(ItemAutomagetion.tabAutomagetion);
	}
	
	public static void init()
	{
		songwoodPlanks = new BlockSongwoodPlanks();
		songwoodPlanks.setShortAndUnlocalizedName("songwood_planks");
		itemSongwoodPlanks = new ItemBlockAutomagetion(songwoodPlanks);
		itemSongwoodPlanks.setUnlocalizedName(songwoodPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(songwoodPlanks, songwoodPlanks.getShortName());
		GameRegistry.registerItem(itemSongwoodPlanks, songwoodPlanks.getShortName());
	}
}
