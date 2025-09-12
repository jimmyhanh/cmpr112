//Hung Anh Ho
//11-14-2022
//Geometry class

public class Geometry 
{
	public static final double PI = 3.14159;
	
	/**
	 * areaOfCircle calculates the area of circle
	 * @param radius-double type
	 * @return area of circle-double type
	 */
	public static double areaOfCircle(double radius)
	{
		return PI * (radius * radius);
	}
	
	/**
	 * areaOfRectangle calculates the area of rectangle
	 * @param length-double type
	 * @param width-double type
	 * @return area of rectangle-double type
	 */
	public static double areaOfRectangle(double length, double width)
	{
		return length * width;
	}

	/**
	 * areaOfTriangle calculates the area of triangle
	 * @param base-double type
	 * @param height-double type
	 * @return area of triangle-double type
	 */
	public static double areaOfTriangle(double base, double height)
	{
		return base * height * 0.5;
	}
}
