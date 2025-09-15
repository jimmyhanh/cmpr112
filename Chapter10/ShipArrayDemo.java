//Hung Anh Ho
//11-22-2022
//ShipArray demo

import java.util.ArrayList;
public class ShipArrayDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Ship> array = new ArrayList<Ship>();
		array.add(new CargoShip("USS Enterprise (CVN-65)","1958",94780));
		array.add(new CargoShip("Seawise Giant","1988", 260941));
		array.add(new CruiseShip("Mardi Gras","2020", 6500));
		
		for(Ship i : array)
		{
			System.out.println(i);
			System.out.println();
		}
	}

}
