package automagetion.block;

import automagetion.Automagetion;
import automagetion.ShortName;
import automagetion.item.ItemAutomagetion;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSongwoodStairs extends BlockStairs implements ShortName
{
	/** Static self-instance for outside reference */
	public static BlockSongwoodStairs songwoodStairs;
	
	/** Similar to unlocalized name, but with "item." in front */
	private String shortName = "";
	
	/** Set to true when name is set. Cannot change name after this is true*/
	private boolean nameSet = false;
	
	protected BlockSongwoodStairs(IBlockState modelState) 
	{
		super(modelState);
		this.setCreativeTab(ItemAutomagetion.tabAutomagetion);
		this.useNeighborBrightness = true; //Recommended online
	}
	
	public static void preInit()
	{
		songwoodStairs = new BlockSongwoodStairs(Block.getStateById(1));
		songwoodStairs.setShortAndUnlocalizedName("songwood_stairs");
		GameRegistry.registerBlock(songwoodStairs, songwoodStairs.getShortName());
	}
	
	public static void init()
	{
		Item itemSongwoodStairs = Item.getItemFromBlock(songwoodStairs);
		ItemAutomagetion.regForRendering(itemSongwoodStairs); //Registers the block item for inventory rendering
	}
	
	/** Specifies some information about how the block is rendered while placed */
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.SOLID;
	}

	
	
	
	
	
	
	/**
	 * Set the name. Use this name to define the unlocalizedname
	 * @param nameString - ex: cantio would use cantio.setName("cantio") then cantio.setUnlocalizedName(cantio.getName())
	 * @return - self, for chaining
	 */
	public BlockSongwoodStairs setShortName(String nameString)
	{
		if (this.nameSet == true)
		{
			System.out.println("ERROR: ItemAutomagetion has shortName already set! Attempt to set new name " + nameString + " to " + this.getUnlocalizedName());
		}
		else
		{
			this.shortName = nameString;
			this.nameSet = true;
		}
		return this;
	}
	
	/**
	 * Simultaneously sets the shortName and unlocalizedName
	 * @param name - name to set
	 * @return - self, for chaining
	 */
	public BlockSongwoodStairs setShortAndUnlocalizedName(String name)
	{
		if (this.nameSet == true)
		{
			System.out.println("ERROR: ItemAutomagetion has shortName already set! Attempt to set new name " + name + " to " + this.getUnlocalizedName());
			this.setUnlocalizedName(this.shortName);
		}
		else
		{
			this.shortName = name;
			this.setUnlocalizedName(this.shortName);
			this.nameSet = true;
		}
		return this;
	}
	
	/**
	 * Use this to define the unlocalizedName
	 * @return - Name of object. This is supposed to be the unlocalized name minus the "item.".
	 */
	public String getShortName()
	{
		if (this.nameSet == true)
		{
			return this.shortName;
		}
		else
		{
			System.out.println("ERROR: ItemAutomagetion has not had shortName set! Attempted to get name from " + this + ", a blank string was returned");
			return "";
		}
	}
}
