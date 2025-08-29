// Hung Anh Ho
// 9-4-2022
// Land calculation
public class LandCalculation 
{
	public static void main(String[] args)
	{
		//Variable declare
		double anAcre = 43560, LandinSquareFeet = 389767;
		//Convert spare feet to arce
        double landInAcres = LandinSquareFeet/anAcre;
        //Use print format to display only 2 floating decimals
        System.out.println("An acre of land is equal to " + anAcre + " square feet.");
        System.out.printf("The size of the tract of land is %.2f acres. \n" , landInAcres) ;
	}
}
