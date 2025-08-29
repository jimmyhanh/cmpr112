// Hung Anh Ho
// 9-5-2022
// Stock commission
public class StockCommission 
{
	public static void main(String[] args) 
	{
		int number_of_shares = 600;
		double stockPrice = 21.77;
		double commissionPercent = 0.02;
		
	    // Calculate the stock cost.
	    double stockCost = stockPrice * number_of_shares;

	    // Calculate the commission fee.
	    double commission = stockCost * commissionPercent;

	    // Calculate the total cost.
	    double total = stockCost + commission;

	    // Display the results.
	    System.out.println("Stock cost: $" + stockCost);
	    System.out.println("Commission: $" + commission);
	    System.out.println("Total:      $" + total);
	}
}
