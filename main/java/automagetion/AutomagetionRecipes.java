package automagetion;

import automagetion.block.BlockSongwoodPlanks;
import automagetion.block.BlockSongwoodStairs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class AutomagetionRecipes 
{
	public static void init()
	{
		//Register Ore Variants
		OreDictionary.registerOre("plankWood", BlockSongwoodPlanks.songwoodPlanks);
		OreDictionary.registerOre("stairWood", BlockSongwoodStairs.songwoodStairs);
		
		//Register Mod Recipes
		/** Songwood Planks - Gives 4 planks
		GameRegistry.addShapelessRecipe(new ItemStack(BlockSongwoodPlanks.songwoodPlanks, 4), 
				new Object[] {
						
				});
		*/
		
		/** Songwood Stairs - Gives 4 stairs*/
		GameRegistry.addRecipe(new ItemStack(BlockSongwoodStairs.songwoodStairs, 4),
			new Object[] {
				"W..",
				"WW.",
				"WWW",
				'W', BlockSongwoodPlanks.songwoodPlanks
				}
			);
	}
}
