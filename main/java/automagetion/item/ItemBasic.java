package automagetion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Basic Items are items with no true functions except crafting
 * 
 * Basic items should only go here if they have NO OTHER RELEVANT CLASS
 */
public class ItemBasic extends ItemAutomagetion
{
	public static ItemBasic chantRoot;
	public static ItemBasic chantRootFibers;
	public static ItemBasic songPaper;
	public static ItemBasic reedAssembly;
	
    public static final void init() 
    {
    	//Initialize items with basic information
    	chantRoot = new ItemBasic();
    	chantRoot.setShortAndUnlocalizedName("chant_root").setCreativeTab(tabAutomagetion);
    	chantRootFibers = new ItemBasic();
    	chantRootFibers.setShortAndUnlocalizedName("chant_root_fibers").setCreativeTab(tabAutomagetion);
    	songPaper = new ItemBasic();
    	songPaper.setShortAndUnlocalizedName("song_paper").setCreativeTab(tabAutomagetion);
    	reedAssembly = new ItemBasic();
    	reedAssembly.setShortAndUnlocalizedName("reed_assembly").setCreativeTab(tabAutomagetion);
    	
    	//Registering items with forge
    	GameRegistry.registerItem(chantRoot, chantRoot.getShortName());
    	GameRegistry.registerItem(chantRootFibers, chantRootFibers.getShortName());
    	GameRegistry.registerItem(songPaper, songPaper.getShortName());
    	GameRegistry.registerItem(reedAssembly, reedAssembly.getShortName());
    	
    	//Register with renderer
    	regForRendering(chantRoot);
    	regForRendering(chantRootFibers);
    	regForRendering(reedAssembly);
    	regForRendering(songPaper);
    }
}
