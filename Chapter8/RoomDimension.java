//Hung Anh Ho
//11-7-2022
//Room dimension

public class RoomDimension 
{
	private double length;
    private double width;
    private double size;
    
    RoomDimension()
    {
        length = 0.0;
        width = 0.0;
        size = 0.0;
    }
    
    /**
     * RoomDimension constructor
     * @param newLength-Double type
     * @param newWidth-Double type
     */
    RoomDimension(double newLength, double newWidth)
    {
        length = newLength;
        width = newWidth;
    }
    
    /**
     * Copy constructor create a copy of the object input
     * @param newRoom-Object input
     */
    RoomDimension(RoomDimension newRoom)
    {
        this.length = newRoom.length;
        this.width = newRoom.width;
    }
    
    /**
     * setLength mutator set the length
     * @param newLength-double type
     */
    public void setLength(double newLength) 
    {
        length = newLength;
    }

    /**
     * getLength getter method
     * @return length-double type
     */
    public double getLength() 
    {
        return length;
    }
    
    /**
     * setWidth mutator method set the width
     * @param newWidth-double type
     */
    public void setWidth(double newWidth) 
    {
        width = newWidth;
    }
    
    /**
     * getWidth getter method return width
     * @return width-double type
     */
    public double getWidth() 
    {
        return width;
    }
    

    /**
     * getArea method calculate the area
     * @return area-double type
     */
    public double getArea()
    {
    	size =  length * width;
        return size;
    }

    /**
     * toString method return string format
     */
    public String toString()
    {
        String temp = String.format("\nRoom Dimensions: \nLength: %.2f(feet)\nWidth: %.2f(feet)\nArea: %.2f(sqare feet)", length, width, getArea());
        return temp;
    }
}
