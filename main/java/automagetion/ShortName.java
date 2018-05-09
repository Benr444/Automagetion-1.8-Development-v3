package automagetion;

import automagetion.block.BlockAutomagetion;

public interface ShortName 
{
	/**
	 * Sets the shortName but not the unlocalized name. Not recommended
	 * @param nameString - the short time (e.g. songwood_planks)
	 * @return - self, for chaining
	 */
	public Object setShortName(String nameString);
	
	/**
	 * Simultaneously sets the shortName and unlocalizedName
	 * @param name - name to set
	 * @return - self, for chaining
	 */
	public Object setShortAndUnlocalizedName(String name);

	
	/**
	 * Use this to define the unlocalizedName
	 * @return - Name of object. This is supposed to be the unlocalized name minus the "item.".
	 */
	public String getShortName();
}
