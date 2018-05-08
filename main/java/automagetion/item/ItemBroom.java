package automagetion.item;

import automagetion.AutomagetionUtil;
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
	public final static int BROOM_USE_INTERVAL = 8;
	
	public ItemBroom()
	{
		super();
	}
	
	/**
	 * Initializes item, registers it, etc. Called when mod initializes
	 */
	public static void preInit()
	{
		broom = new ItemBroom();
    	broom.setShortAndUnlocalizedName("broom");
    	broom.setCreativeTab(tabAutomagetion);
    	broom.setMaxStackSize(1);
    	broom.setMaxDamage(0);
    	broom.setHasSubtypes(false);
    	
    	GameRegistry.registerItem(broom, broom.getShortName());
	}
	
	public static void init()
	{
    	regForRendering(broom);
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		
		
    	System.out.println(playerIn.getName() + " right clicked with a broom.");
    	System.out.println("Your yaw: " + playerIn.getRotationYawHead());
    	//Transform fYaw (fixed yaw) into into a clock-math angle, only positives
    	//fYaw is constrainted to be 0 <= yaw < 360
    	int fYaw = (int)(playerIn.getRotationYawHead() + 0.5);
    	fYaw = fYaw % 360;
    	fYaw = (fYaw < 0) ? 360 + fYaw : fYaw;
    	
    	//Defining the coordinate system:
    	//East is positive x axis
    	//West is negative x axis
    	//South is position z axis
    	//North is negative z axis
    	
    	//The AOE is a box with these dimensions: (u = 1 block length)
    	//1.5u in front of you
    	//0.5u behind you
    	//1u left and 1u right
    	//1.5u up from your feet
    	
    	//A is the forward-left corner
    	//B is the forward-right corner
    	//C is the back-right corner
    	//D is the back-leff corner
    	
    	double lenA, lenB, lenC, lenD; //Lengths of corner vectors (vectors pointing from center to corners)
    	lenA = lenB = 1.803; //The lines connecting center to A and center to B are this length in u's
    	lenC = lenD = 1.118; //The lines connecting center to C and center to D are this length in u's
    	
    	double angH = 63.43; //Degrees between the yaw-vector and the A and B vectors to either side
    	double angF = 33.69; //Degrees between the reverse yaw-vector and the C and D vectors to either side
    	
    	double angA = fYaw + angH; //Angle relative to real coordinates for the A-vector
    	double angB = fYaw - angH; //Angle relative to real coordinates for the B-vector
    	double angC = fYaw + 180 - angF; //Angle relative to real coordinates for the C-vector
    	double angD = fYaw + 180 + angF; //Angle relative to real coordinates for the D-vector
    	
    	double aX, bX, cX, dX; //Declaration of X position for corners A, B, C, D. They are relative to your position, initially
    	aX = bX = cX = dX = playerIn.getPosition().getX(); //Initially equal to your x-pos
    	double aZ, bZ, cZ, dZ; //Declaration of Z position for corners A, B, C, D. They are relative to your position, initially
    	aZ = bZ = cZ = dZ = playerIn.getPosition().getZ(); //Initially equal to your z-pos
    	
    	//Each point extends away from the player position in the x based on the cos of the point vector
    	aX += lenA * Math.cos(Math.toRadians(angA));
    	bX += lenB * Math.cos(Math.toRadians(angB));
    	cX += lenC * Math.cos(Math.toRadians(angC));
    	dX += lenD * Math.cos(Math.toRadians(angD));
    	
    	//Each point extends away from the player position in the y based on the sin of the point vector
    	aZ += lenA * Math.sin(Math.toRadians(angA));
    	bZ += lenB * Math.sin(Math.toRadians(angB));
    	cZ += lenC * Math.sin(Math.toRadians(angC));
    	dZ += lenD * Math.sin(Math.toRadians(angD));
    	
    	//Unfortunately, area boxes in minecraft are "Axis Aligned" meaning they much be draw as parallel to block axes.
    	//This means to approximate a box at an angle, we need to draw a series of progressively smaller boxes inside this one
    	//The AutomagetionUtil.fractalizeBB() creates an array of progressively smaller BB's that attempt to fill in a non-axis-aligned BB
    	AutomagetionUtil.fractalizeBB(1, 1.5, aX, aZ, bX, bZ, cX, cZ, dX, dZ);
    	
    	System.out.print("fYaw = " + fYaw);
        return itemStackIn;
    }
    
	/**
     * How long it takes to use the broom
     */
	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return BROOM_USE_INTERVAL; 
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
    	System.out.println("useRemaining: " + useRemaining);
    	System.out.println("Max Use Time: " + BROOM_USE_INTERVAL);
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
