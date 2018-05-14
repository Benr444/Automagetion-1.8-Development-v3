package automagetion.block;

import automagetion.Automagetion;
import automagetion.ShortName;
import automagetion.item.ItemAutomagetion;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSongwoodSlab extends BlockSlab implements ShortName
{
	/** Static self-instance for outside reference */
	public static BlockSongwoodSlab songwoodSlab;
	
	/** Similar to unlocalized name, but with "item." in front */
	private String shortName = "";
	
	/** Set to true when name is set. Cannot change name after this is true*/
	private boolean nameSet = false;

	private SoundType soundType;
	
	public BlockSongwoodSlab(Material materialIn)
	{
		super(materialIn);
		this.setCreativeTab(ItemAutomagetion.tabAutomagetion);
		this.setStepSound(soundTypeWood);
		this.soundType = soundTypeWood;
		this.setHardness((float) 1.0);
		this.setResistance((float) 1.0);
	}
	
	public static void preInit()
	{
		songwoodSlab = new BlockSongwoodSlab(Material.wood);
		songwoodSlab.setShortAndUnlocalizedName("songwood_stairs");
		GameRegistry.registerBlock(songwoodSlab, songwoodSlab.getShortName());
	}
	
	public static void init()
	{
		Item itemSongwoodSlab = Item.getItemFromBlock(songwoodSlab);
		ItemAutomagetion.regForRendering(itemSongwoodSlab); //Registers the block item for inventory rendering
	}
	
	/** Specifies some information about how the block is rendered while placed */
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.SOLID;
	}
	
	@Override
	public boolean isDouble() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getUnlocalizedName(int meta) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProperty getVariantProperty() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariant(ItemStack stack) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	/**
	 * Set the name. Use this name to define the unlocalizedname
	 * @param nameString - ex: cantio would use cantio.setName("cantio") then cantio.setUnlocalizedName(cantio.getName())
	 * @return - self, for chaining
	 */
	public BlockSongwoodSlab setShortName(String nameString)
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
	public BlockSongwoodSlab setShortAndUnlocalizedName(String name)
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
