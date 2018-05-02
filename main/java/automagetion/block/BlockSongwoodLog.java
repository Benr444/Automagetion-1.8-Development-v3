package automagetion.block;

import automagetion.item.ItemAutomagetion;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSongwoodLog extends BlockAutomagetion
{
	/** Static self-instance for outside reference */
	public static BlockSongwoodLog songwoodLog;

	public BlockSongwoodLog() 
	{
		super(Material.wood); //Set material to wood
		this.setCreativeTab(ItemAutomagetion.tabAutomagetion);
	}
	
	public static void init()
	{
		songwoodLog.setShortAndUnlocalizedName("songwood_log");
	}
}
