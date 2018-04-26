package automagetion.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBroom extends ItemAutomagetion
{
	/** Static reference to broom object */
	public static ItemBroom broom;
	
	/** Broom use time */
	public final static int BROOM_USE_INTERVAL = 40;
	
	/** When right click, time that the broom is "swung-out" in animation. Units = Ticks, 20 ticks a sec */
	private final int useTime = 8;
	
	public ItemBroom()
	{
		super();
	}
	
	/**
	 * Initializes item, registers it, etc. Called when mod initializes
	 */
	public static void init()
	{
		broom = new ItemBroom();
    	broom.setShortAndUnlocalizedName("broom");
    	broom.setCreativeTab(tabAutomagetion);
    	broom.setMaxStackSize(1);
    	broom.setMaxDamage(0);
    	broom.setHasSubtypes(false);
    	
    	GameRegistry.registerItem(broom, broom.getShortName());
    	ItemRenderRegister.reg(broom);
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
    	System.out.println(playerIn.getName() + " right clicked with a broom.");
        return itemStackIn;
    }
    
	/**
     * How long it takes to use the broom
     */
	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return BROOM_USE_INTERVAL; //8 ticks
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
    	int ticksInUse = BROOM_USE_INTERVAL - useRemaining;
    	System.out.println("Tick use time on broom: " + ticksInUse);
    	System.out.println("ItemUseDuration: " + player.getItemInUseDuration());
    	System.out.println("ItemUseCount: " + player.getItemInUseCount());
    	this.setDamage(stack, this.getMaxDamage());
    	if (player.isUsingItem()) //True while right clicking
    	{
    		System.out.println("Broom is in use.");
    		//Return broom_sweep model
    	}
    	else
    	{
    		//Return broom model
    	}
        return null;
    }
    
    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
    	System.out.println("Broom use finished");
        return stack;
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.BLOCK;
    }
}
