package automagetion.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Melody extends Item
{
	public Melody()
	{
		super();
	}
	
	/* Custom functions and properties */
	/** String that describes what the melody represents */
	private String lore;
	
	/**
	 * Sets the lore of the item - a tooltip (and mroe) that describes what it represents
	 * @param loreString - ex: Cantio="Song, Music, Magic"
	 */
	public void setLore(String loreString)
	{
		this.lore = loreString;
	}
	
	/**
	 * Returns the lore string
	 * @return - the lore, ex: Cantio="Song, Music, Magic"
	 */
	public String getLore()
	{
		return this.lore;
	}
	
	/* Generic functions and properties */
	@SideOnly(Side.CLIENT)
	@Override
	/**
	 * Adds a tooltip to the item
	 */
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
	{
		tooltip.add(this.lore);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    /**
     * Creates an "enchantment sheen" on the item
     */
	public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
