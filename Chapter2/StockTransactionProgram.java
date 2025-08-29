// Hung Anh Ho
// 9-6-2022
// Stock transaction program
public class StockTransactionProgram 
{
	public static void main(String[] args)
	{
		//Variable declare
		int JoeShares = 1000;
		double ShareValueBought = 32.87;
		double commission = 0.02;
		
		double ShareValueSold = 33.92;
		
		//Calculating the amount of money cost when bought
		double MoneyCostBought = JoeShares * ShareValueBought;
		//Commission fees when bought
		double CommissionCostBought = MoneyCostBought * commission;
		//Money gain when sold
		double MoneyGainSold = JoeShares * ShareValueSold;
		//Commission fees when sold
		double CommissionCostSold = MoneyGainSold * commission;
		//Profit
		double JoeProfit = (MoneyGainSold - MoneyCostBought) - (CommissionCostBought + CommissionCostSold);
		
		//Display
		System.out.println("The amount of money Joe paid for buying the stocks: $" + MoneyCostBought);
		System.out.println("Comission fee for buying the stock: $" + CommissionCostBought);
		System.out.println("The amount of money Joe gained for selling all the stocks: $" + MoneyGainSold);
		System.out.println("Comission fee for selling the stock: $" + CommissionCostSold);
		//Use print format to display only 2 floating decimals
		System.out.printf("Joe's profit for the transaction: $ %.2f", JoeProfit);
	}
}
