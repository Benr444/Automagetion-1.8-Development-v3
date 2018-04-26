package automagetion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Basic Items are items with no true functions except crafting
 */
public class BasicItem 
{
	public static Item chantRootFibers;
	public static Item songPaper;
	public static Item reedAssembly;
	
	//Melodies
	public static Melody cantio;
	public static Melody sopio;
	public static Melody bellum;
	public static Melody pax;
	public static Melody infernum;
	public static Melody caelum;
	public static Melody mundus;
	public static Melody inanis;
	public static Melody natura;
	public static Melody funus;
	public static Melody calor;
	public static Melody irrigus;
	public static Melody creo;
	public static Melody evorsio;
	public static Melody imperium;
	public static Melody animo;
	
	//Creating custom tab
	public static final CreativeTabs tabAutomagetion = new CreativeTabs("Automagetion")
	{
	    @Override 
	    public Item getTabIconItem() 
	    {
	        return BasicItem.cantio;
	    }
	};
	
    public static final void init() 
    {
    	//Initialize items with basic information
    	chantRootFibers = new Item().setUnlocalizedName("chantRootFibers").setCreativeTab(tabAutomagetion);
    	songPaper = new Item().setUnlocalizedName("songPaper").setCreativeTab(tabAutomagetion);
    	reedAssembly = new Item().setUnlocalizedName("reedAssembly").setCreativeTab(tabAutomagetion);
    	
    	//Melodies
    	cantio = new Melody();
    	cantio.setUnlocalizedName("cantio").setCreativeTab(tabAutomagetion);
    	cantio.setLore("Song, Music, Magic");
    	sopio = new Melody();
    	sopio.setUnlocalizedName("sopio").setCreativeTab(tabAutomagetion);
    	sopio.setLore("Silence, Rest, Anti-Magic");
    	bellum = new Melody();
    	bellum.setUnlocalizedName("bellum").setCreativeTab(tabAutomagetion);
    	bellum.setLore("War, Violence, Hate");
    	pax = new Melody();
    	pax.setUnlocalizedName("pax").setCreativeTab(tabAutomagetion);
    	pax.setLore("Peace, Order, Love");
    	infernum = new Melody();
    	infernum.setUnlocalizedName("infernum").setCreativeTab(tabAutomagetion);
    	infernum.setLore("Hell, Damnation, Demonic");
    	caelum = new Melody();
    	caelum.setUnlocalizedName("caelum").setCreativeTab(tabAutomagetion);
    	caelum.setLore("Sky, Holy, Heaven");
    	mundus = new Melody();
    	mundus.setUnlocalizedName("mundus").setCreativeTab(tabAutomagetion);
    	mundus.setLore("Earth, Reality, Existance");
    	inanis = new Melody();
    	inanis.setUnlocalizedName("inanis").setCreativeTab(tabAutomagetion);
    	inanis.setLore("Eldritch, Mystery, Illusion");
    	natura = new Melody();
    	natura.setUnlocalizedName("natura").setCreativeTab(tabAutomagetion);
    	natura.setLore("Nature, Harmony, Growth");
    	funus = new Melody();
    	funus.setUnlocalizedName("funus").setCreativeTab(tabAutomagetion);
    	funus.setLore("Death, Finality, Profane");
    	calor = new Melody();
    	calor.setUnlocalizedName("calor").setCreativeTab(tabAutomagetion);
    	calor.setLore("Fire, Sun, Passion");
    	irrigus = new Melody();
    	irrigus.setUnlocalizedName("irrigus").setCreativeTab(tabAutomagetion);
    	irrigus.setLore("Water, Cold, Analytical");
    	creo = new Melody();
    	creo.setUnlocalizedName("creo").setCreativeTab(tabAutomagetion);
    	creo.setLore("Creation, Invention, Construction");
    	evorsio = new Melody();
    	evorsio.setUnlocalizedName("evorsio").setCreativeTab(tabAutomagetion);
    	evorsio.setLore("Destruction, Chaos, Unmaking");
    	imperium = new Melody();
    	imperium.setUnlocalizedName("imperium").setCreativeTab(tabAutomagetion);
    	imperium.setLore("Control, Government, Dominion");
    	animo = new Melody();
    	animo.setUnlocalizedName("animo").setCreativeTab(tabAutomagetion); 
    	animo.setLore("Animation, Thinking, Motion");
    	
    	//Registering items with forge
    	GameRegistry.registerItem(chantRootFibers, "chantRootFibers");
    	GameRegistry.registerItem(songPaper, "songPaper");
    	GameRegistry.registerItem(reedAssembly, "reedAssembly");
    	
    	GameRegistry.registerItem(cantio, "cantio");
    	GameRegistry.registerItem(sopio, "sopio");
    	GameRegistry.registerItem(bellum, "bellum");
    	GameRegistry.registerItem(pax, "pax");
    	GameRegistry.registerItem(infernum, "infernum");
    	GameRegistry.registerItem(caelum, "caelum");
    	GameRegistry.registerItem(mundus, "mundus");
    	GameRegistry.registerItem(inanis, "inanis");
    	GameRegistry.registerItem(natura, "natura");
    	GameRegistry.registerItem(funus, "funus");
    	GameRegistry.registerItem(calor, "calor");
    	GameRegistry.registerItem(irrigus, "irrigus");
    	GameRegistry.registerItem(creo, "creo");
    	GameRegistry.registerItem(evorsio, "evorsio");
    	GameRegistry.registerItem(imperium, "imperium");
    	GameRegistry.registerItem(animo, "animo");
    	
    }
	
}
