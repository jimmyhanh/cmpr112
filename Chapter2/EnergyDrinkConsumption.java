// Hung Anh Ho
// 9-5-2022
// Energy drink consumption
public class EnergyDrinkConsumption 
{
	public static void main(String[] arg)
	{
	int surveyedNumber = 12467;
	double purchased_Energy_Drinks = 0.14;
	double CitrusPrefer = 0.64;
	
	//Calculate approximate number of drinkers
	double EnergyDrinker = surveyedNumber * purchased_Energy_Drinks;
	//Calculate number of drinkers who like citrus-flavored drink
	double CitrusLovers = surveyedNumber * CitrusPrefer;
	
	System.out.println("The total number of people surveyed is" + surveyedNumber);
	System.out.println("The approximate number of customers who bought atleast one energy drink is " + EnergyDrinker);
	System.out.println("The approximate number of customers who prefer citrus is " + CitrusLovers);	
	}
}
