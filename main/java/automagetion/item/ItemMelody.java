package automagetion.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMelody extends ItemAutomagetion
{
	public ItemMelody()
	{
		super();
		this.setMaxStackSize(16);
	}
	
	/* Custom functions and properties */
	//Static references to all melody objects
	public static ItemMelody cantio;
	public static ItemMelody sopio;
	public static ItemMelody bellum;
	public static ItemMelody pax;
	public static ItemMelody infernum;
	public static ItemMelody caelum;
	public static ItemMelody mundus;
	public static ItemMelody inanis;
	public static ItemMelody natura;
	public static ItemMelody funus;
	public static ItemMelody calor;
	public static ItemMelody irrigus;
	public static ItemMelody creo;
	public static ItemMelody evorsio;
	public static ItemMelody imperium;
	public static ItemMelody animo;
	
	public static void preInit()
	{
		//Initialize
    	cantio = new ItemMelody();
    	cantio.setShortAndUnlocalizedName("cantio").setCreativeTab(ItemBasic.tabAutomagetion);
    	cantio.setLore("Song, Music, Magic");
    	sopio = new ItemMelody();
    	sopio.setShortAndUnlocalizedName("sopio").setCreativeTab(ItemBasic.tabAutomagetion);
    	sopio.setLore("Silence, Rest, Anti-Magic");
    	bellum = new ItemMelody();
    	bellum.setShortAndUnlocalizedName("bellum").setCreativeTab(ItemBasic.tabAutomagetion);
    	bellum.setLore("War, Violence, Hate");
    	pax = new ItemMelody();
    	pax.setShortAndUnlocalizedName("pax").setCreativeTab(ItemBasic.tabAutomagetion);
    	pax.setLore("Peace, Order, Love");
    	infernum = new ItemMelody();
    	infernum.setShortAndUnlocalizedName("infernum").setCreativeTab(ItemBasic.tabAutomagetion);
    	infernum.setLore("Hell, Damnation, Demonic");
    	caelum = new ItemMelody();
    	caelum.setShortAndUnlocalizedName("caelum").setCreativeTab(ItemBasic.tabAutomagetion);
    	caelum.setLore("Sky, Holy, Heaven");
    	mundus = new ItemMelody();
    	mundus.setShortAndUnlocalizedName("mundus").setCreativeTab(ItemBasic.tabAutomagetion);
    	mundus.setLore("Earth, Reality, Existance");
    	inanis = new ItemMelody();
    	inanis.setShortAndUnlocalizedName("inanis").setCreativeTab(ItemBasic.tabAutomagetion);
    	inanis.setLore("Eldritch, Mystery, Illusion");
    	natura = new ItemMelody();
    	natura.setShortAndUnlocalizedName("natura").setCreativeTab(ItemBasic.tabAutomagetion);
    	natura.setLore("Nature, Harmony, Growth");
    	funus = new ItemMelody();
    	funus.setShortAndUnlocalizedName("funus").setCreativeTab(ItemBasic.tabAutomagetion);
    	funus.setLore("Death, Finality, Profane");
    	calor = new ItemMelody();
    	calor.setShortAndUnlocalizedName("calor").setCreativeTab(ItemBasic.tabAutomagetion);
    	calor.setLore("Fire, Sun, Passion");
    	irrigus = new ItemMelody();
    	irrigus.setShortAndUnlocalizedName("irrigus").setCreativeTab(ItemBasic.tabAutomagetion);
    	irrigus.setLore("Water, Cold, Analytical");
    	creo = new ItemMelody();
    	creo.setShortAndUnlocalizedName("creo").setCreativeTab(ItemBasic.tabAutomagetion);
    	creo.setLore("Creation, Invention, Construction");
    	evorsio = new ItemMelody();
    	evorsio.setShortAndUnlocalizedName("evorsio").setCreativeTab(ItemBasic.tabAutomagetion);
    	evorsio.setLore("Destruction, Chaos, Unmaking");
    	imperium = new ItemMelody();
    	imperium.setShortAndUnlocalizedName("imperium").setCreativeTab(ItemBasic.tabAutomagetion);
    	imperium.setLore("Control, Government, Dominion");
    	animo = new ItemMelody();
    	animo.setShortAndUnlocalizedName("animo").setCreativeTab(ItemBasic.tabAutomagetion); 
    	animo.setLore("Animation, Thinking, Motion");
    	
    	//Register
    	GameRegistry.registerItem(cantio, cantio.getShortName());
    	GameRegistry.registerItem(sopio, sopio.getShortName());
    	GameRegistry.registerItem(bellum, bellum.getShortName());
    	GameRegistry.registerItem(pax, pax.getShortName());
    	GameRegistry.registerItem(infernum, infernum.getShortName());
    	GameRegistry.registerItem(caelum, caelum.getShortName());
    	GameRegistry.registerItem(mundus, mundus.getShortName());
    	GameRegistry.registerItem(inanis, inanis.getShortName());
    	GameRegistry.registerItem(natura, natura.getShortName());
    	GameRegistry.registerItem(funus, funus.getShortName());
    	GameRegistry.registerItem(calor, calor.getShortName());
    	GameRegistry.registerItem(irrigus, irrigus.getShortName());
    	GameRegistry.registerItem(creo, creo.getShortName());
    	GameRegistry.registerItem(evorsio, evorsio.getShortName());
    	GameRegistry.registerItem(imperium, imperium.getShortName());
    	GameRegistry.registerItem(animo, animo.getShortName());
	}
	
	public static void init()
	{
    	//Render Register
    	regForRendering(animo);
    	regForRendering(bellum);
    	regForRendering(caelum);
    	regForRendering(calor);
    	regForRendering(cantio);
    	regForRendering(creo);
    	regForRendering(evorsio);
    	regForRendering(funus);
    	regForRendering(imperium);
    	regForRendering(inanis);
    	regForRendering(infernum);
    	regForRendering(irrigus);
    	regForRendering(mundus);
    	regForRendering(natura);
    	regForRendering(pax);
    	regForRendering(sopio);
    	
	}
		
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
