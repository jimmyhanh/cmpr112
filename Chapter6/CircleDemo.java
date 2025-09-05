//Hung Anh Ho
//11-4-2022
//Circle demo

public class CircleDemo 
{
	public static void main(String[] args)
    {
		// Create a Circle object example
		Circle example = new Circle(5.0);
		System.out.println("Example:");
		System.out.println(example);
        
        
        // Create a new Circle object
		Circle circle = new Circle();

        // get the circle's radius from the user
		double input = Input.getDouble("Please enter the radius of the circle: ", true);
		circle.setRadius(input);

        // display the area, diameter and circumference of the circle to the user
        System.out.println(circle);
    }
}
