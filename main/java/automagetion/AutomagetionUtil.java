package automagetion;

import net.minecraft.util.AxisAlignedBB;

public class AutomagetionUtil 
{
	/**
	 * Attempts to approximate rotated bounding boxes by using progressively smaller normally bounding boxes <br>
	 * <b>NOTE: Currently, the supplied bounding box must be a square in the xz plane. The function only supports yaw rotation.</b>
	 * @param iterations - number of layers of boxes to use. 1 = single box, 2 = 5 boxes, 3 = 17 boxes ...
	 * @param y - Height of area
	 * @param x1 - first x-coord
	 * @param z1 - first z-coord
	 * @param x2 - second x-coord
	 * @param z2 - second z-coord
	 * @param x3 - third x-coord
	 * @param z3 - third z-coord
	 * @param x4 - fourth x-coord
	 * @param z4 - fourth z-coord
	 * @return
	 */
	public static AxisAlignedBB[] fractalizeBB(int iterations, double y, double x1, double z1, double x2, double z2, double x3, double z3, double x4, double z4)
	{
		AxisAlignedBB[] boxList = new AxisAlignedBB[99];
		
		
		
		return boxList;
	}
}
