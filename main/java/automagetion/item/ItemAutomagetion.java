package automagetion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAutomagetion extends Item
{
	/* Custom/New properties */

	//Creating custom tab
	public static final CreativeTabs tabAutomagetion = new CreativeTabs("Automagetion")
	{
	    @Override 
	    public Item getTabIconItem() 
	    {
	        return ItemMelody.cantio;
	    }
	};
		
	/** Similar to unlocalized name, but with "item." in front */
	private String shortName = "";
	
	/** Set to true when name is set. Cannot change name after this is true*/
	private boolean nameSet = false;
	
	/**
	 * Called on mod initialization - initializes and registers ALL items
	 */
	public static void init()
	{
		ItemBasic.init();
		ItemMelody.init();
		ItemBroom.init();
	}
	
	/**
	 * Set the name. Use this name to define the unlocalizedname
	 * @param nameString - ex: cantio would use cantio.setName("cantio") then cantio.setUnlocalizedName(cantio.getName())
	 * @return - self, for chaining
	 */
	public ItemAutomagetion setShortName(String nameString)
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
	public ItemAutomagetion setShortAndUnlocalizedName(String name)
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
	
	public ItemAutomagetion()
	{
		super();
	}
}
