//Hung Anh Ho
//11-5-2022
//Circle class

public class Circle 
{
	private double radius;
	private final double PI = 3.14159;
	
	/**
	 * No argument constructor
	 */
    public Circle()
    {
    	radius = 0.0;
    }
    
    /**
     * Constructor get assigned input
     * @param newRadius-Double type
     */
    public Circle(double newRadius)
    {
    	radius = newRadius;
    }
    
    /**
     * setRadius mutator to change the radius
     * @param newRadius
     */
    public void setRadius(double newRadius)
    {
    	radius = newRadius;
    }
    
    /**
     * getRadius access the radius
     * @return radius-Double type
     */
    public double getRadius()
    {
    	return radius;
    }
    
    /**
     * getArea return the area value-Double type
     * @return area of the circle-Double type
     */
    public double getArea()
    {
    	return PI * radius * radius;
    }
    
    /**
     * getDiameter return the diameter-Double type
     * @return diameter-Double type
     */
    public double getDiameter()
    {
    	return radius *2;
    }
    
    /**
     * getCircumference return the value of Circumference
     * @return Circumference-Double type
     */
    public double getCircumference()
    {
    	return 2 * PI * radius;
    }
    
    /**
   	 * toString method return String format-String type
   	 * @return String format-String type
   	 */
   	public String toString()
   	{
   		String temp = String.format("\nYour circle's properties: \nRadius: %.2f \nArea: %.2f \nDiameter: %.2f\nCircumference: %.2f\n", radius, getArea(), getDiameter(), getCircumference());
   		return temp;
   	}
}
