
public class Area 
{

	/**
	 * Finding the area of a circle
	 * @param radius-Double type
	 * @return the Circle's area
	 */
	public static double getArea(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	/**
	 * Finding the area for a rectangle
	 * @param lenth-Double length
	 * @param width-Double width
	 * @return the Rectangle's area
	 */
	public static double getArea(double length, double width)
	{
		return length *  width;
	}
	
	/**
	 * getArea method calculated the are of a Conical Frustum
	 * @param topRadius-Double type
	 * @param baseRadius-Double type
	 * @param height-Double type
	 * @return the Conical Frustum's area-Double type
	 */
	public static double getArea(double topRadius, double baseRadius, double height)
	{
		return Math.sqrt(Math.pow(topRadius - baseRadius, 2) + Math.pow(height, 2));
	}
}
