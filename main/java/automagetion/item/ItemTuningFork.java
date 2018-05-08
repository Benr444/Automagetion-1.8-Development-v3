package automagetion.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTuningFork extends ItemAutomagetion
{
	public static ItemTuningFork tuningFork;
	
	public ItemTuningFork()
	{
		super();
	}
	
	public static void preInit()
	{
		tuningFork = new ItemTuningFork();
    	tuningFork.setShortAndUnlocalizedName("tuning_fork");
    	tuningFork.setCreativeTab(tabAutomagetion);
    	tuningFork.setMaxStackSize(1);
    	tuningFork.setMaxDamage(0);
    	tuningFork.setHasSubtypes(false);
    	
    	GameRegistry.registerItem(tuningFork, tuningFork.getShortName());
	}
	
	public static void init()
	{
    	regForRendering(tuningFork);
	}
	
	/**
     * Called when a Block is right-clicked with this Item
     *  
     * @param pos The block being right-clicked
     * @param side The side being right-clicked
     */
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    	System.out.println("Tuning fork was used");
        return false;
    }
	
	/**
     * How long it takes to use the tuning fork
     */
	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 8; //Ticks 
    }
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		System.out.println("Tuning Fork Right Click");
		return itemStackIn;
    }
	
	/**
     * Player, Render pass, and item usage sensitive version of getIconIndex.
     *
     * @param stack The item stack to get the icon for.
     * @param player The player holding the item
     * @param useRemaining The ticks remaining for the active item.
     * @return Null to use default model, or a custom ModelResourceLocation for the stage of use.
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining)
    {
    	//System.out.println("Tuning fork model was asked for");
    	//System.out.println("Use remaining: " + useRemaining);
    	return null;
    }
	
	 /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
    	System.out.println("Tuning fork use finished");
        return stack;
    }
}
