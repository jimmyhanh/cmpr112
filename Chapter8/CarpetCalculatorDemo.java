//Hung Anh Ho
//11-7-2022
//Carpet calculator demo 

public class CarpetCalculatorDemo 
{

	public static void main(String[] args) 
	{
		
		//Objects's inputs
		RoomDimension myRoom = new RoomDimension(Input.getDouble("Enter the length of the room in feet: ", true), 
												 Input.getDouble("Enter the width of the room in feet: ", true));	
		RoomCarpet myCarpet = new RoomCarpet(myRoom, Input.getDouble("Enter the price of the carpet per square foot: ", true));
		//
		System.out.println(myRoom);
		System.out.println(myCarpet);
	}

}
