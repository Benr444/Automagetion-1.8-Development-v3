package automagetion;

import automagetion.block.BlockSongwoodPlanks;
import net.minecraftforge.oredict.OreDictionary;

public class AutomagetionRecipes 
{
	public static void init()
	{
		//Register Ore Variants
		OreDictionary.registerOre("plankWood", BlockSongwoodPlanks.songwoodPlanks);
		
		//Register Mod Recipes
	}
}
