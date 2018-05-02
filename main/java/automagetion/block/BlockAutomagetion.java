package automagetion.block;

import automagetion.item.ItemAutomagetion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockAutomagetion extends Block
{
	/** Similar to unlocalized name, but with "item." in front */
	private String shortName = "";
	
	/** Set to true when name is set. Cannot change name after this is true*/
	private boolean nameSet = false;
	
	/** All blocks need to initialize from here
	 *  */
	public static void init()
	{
		BlockSongwoodPlanks.init();
	}
	
	public static void reg(ItemAutomagetion item) 
	{
	   //ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation();
	}
	public static void reg(Item item) 
	{
		
	}
	
	public BlockAutomagetion(Material materialIn) 
	{
		super(materialIn);
	}

	/**
	 * Set the name. Use this name to define the unlocalizedname
	 * @param nameString - ex: cantio would use cantio.setName("cantio") then cantio.setUnlocalizedName(cantio.getName())
	 * @return - self, for chaining
	 */
	public BlockAutomagetion setShortName(String nameString)
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
	public BlockAutomagetion setShortAndUnlocalizedName(String name)
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
