// Hung Anh Ho
// 9-4-2022
// Sales prediction
public class SalesPrediction 
{
	public static void main(String[] arg)
	{
		//Variables
		double salesPercentage = 62;
		double salesPercentageValue = salesPercentage/100;
		double baseMoney = 4.6;
		double generatedMoney =  baseMoney * salesPercentageValue;
		//Display
		System.out.println("Predicting total sales will be $" + baseMoney + " millions");
		System.out.println("Percentage of total sales is " + salesPercentage + "%");
		System.out.println("The East Coast division is predicted to generate $" + 
							generatedMoney + " millions in sales.");
		
	}
}
