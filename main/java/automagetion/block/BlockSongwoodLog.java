package automagetion.block;

import automagetion.item.ItemAutomagetion;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;

public class BlockSongwoodLog extends BlockAutomagetion
{
	/** Static self-instance for outside reference */
	public static BlockSongwoodLog songwoodLog;

	public BlockSongwoodLog() 
	{
		super(Material.wood); //Set material to wood
		this.setCreativeTab(ItemAutomagetion.tabAutomagetion);
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer
}
