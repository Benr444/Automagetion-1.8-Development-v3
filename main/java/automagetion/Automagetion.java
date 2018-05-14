package automagetion;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/*
 * Setup guide:
 * 1. Uncompress forge
 * 2. gradlew setupDecompWorkspace eclipse
 * 3. Delete the src folder in the eclipse project
 * 4. Download repository from github and put it there renamed as "src"
 */

@Mod(modid = Automagetion.MODID, name = Automagetion.MODNAME, version = Automagetion.VERSION)
public class Automagetion
{
	@SidedProxy(clientSide="automagetion.ClientProxy", serverSide="automagetion.ServerProxy")
	public static CommonProxy proxy;

    public static final String MODID = "automagetion";
    public static final String MODNAME = "Automagetion";
    public static final String VERSION = "1.0.0";
        
    @Instance(Automagetion.MODID)
    public static Automagetion instance = new Automagetion();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	System.out.println("Automagetion: Hello World!");
    	Automagetion.proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	Automagetion.proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	Automagetion.proxy.postInit(e);
    }
}
