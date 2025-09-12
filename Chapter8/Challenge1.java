//Hung Anh Ho
//11/15/2022
//Area class
public class Challenge1 
{
	public static void main(String[] args) 
	{
		//Circle
		double radius = Input.getDouble("\nEnter a radius: ", true);		
		System.out.printf("\nArea of a circle %.2f\n", Area.getArea(radius));
		
		//Rectangle
		double length = Input.getDouble("\nEnter the length: ", true);
		double width = Input.getDouble("\nEnter the width: ", true);		
		System.out.printf("\nArea of a rectangle: %.2f\n", Area.getArea(length, width));
		
		//Conial Frustum
		double topRadius = Input.getDouble("\nEnter the top radius: ", true);
		double baseRadius = Input.getDouble("\nEnter the bottom radius: ", true);
		double height = Input.getDouble("\nEnter the height: ", true);
		System.out.printf("\nArea of a frustum: %.2f\n", Area.getArea(topRadius, baseRadius, height));		
	}

}
