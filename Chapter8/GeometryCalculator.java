//Hung Anh Ho
//11-14-2022
//Geometry class

public class GeometryCalculator 
{	
	public static void main(String[] args)
	{
		do
		{
			displayMenu();
			int input = Input.getInteger("Enter your choice number (1-4): ", 1,4);
			
			if (input == 1)
			{
				double radius = Input.getDouble("\nEnter your circle's radius: ", true);
				System.out.printf("Area of the circle is: %.2f\n\n", Geometry.areaOfCircle(radius));
			}
			
			else if(input == 2)
			{
				double length = Input.getDouble("\nEnter your rectange's length: ", true);
				double width = Input.getDouble("Enter your retangle's width: ", true);
				System.out.printf("Area of the rectangle is: %.2f\n\n", Geometry.areaOfRectangle(length, width));
			}
			
			else if (input == 3)
			{
				double base = Input.getDouble("\nEnter your triangle's base: ", true);
				double height = Input.getDouble("Enter your triangle's height: ", true);
				System.out.printf("Area of the circle is: %.2f\n\n", Geometry.areaOfRectangle(base, height));
			}
			
			else if (input == 4)
			{
				System.exit(0);
			}
		
		} while(true);
		
	}
	
	public static void displayMenu()
    {
		System.out.println("Geometry calculator's menu:" +
                            "\n1.   Calculate the Area of a Circle" +
                            "\n2.   Calculate the Area of a Rectangle" +
                            "\n3.   Calculate the Area of a Triangle" +
                            "\n4.   Quit" );           
    }
}
