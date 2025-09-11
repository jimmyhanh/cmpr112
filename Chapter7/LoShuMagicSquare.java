import java.util.Scanner;

//Hung Anh Ho
//10-28-2022
//Lo Shu Magic Square

public class LoShuMagicSquare 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int rows = 3;
		int collums = 3;
		int[][] square = new int[rows][collums];
		
		char Answer;
		do
		{
			int choice = getMenu();
			
			//Display example
			if (choice == 1)
				getExample();
			
			//Build square
			else if (choice == 2)
			{
				System.out.println("Your square:");
				//User's input to build the square
				square = getUserSquare(square);
				
				//Display the square
				for (int row = 0; row < 3; row++)
				{
					for (int collum = 0; collum < 3; collum++)
					{
						System.out.printf("%-2d", square[row][collum]);
					}
							
						System.out.println();
				}
				
				isMagicSquare(square);
				
			}
			
			//Terminate program
			else if (choice == 0)
			{
				System.out.println("Program terminated.");
				return;
			}
			
			do
			{
				System.out.print("\nContinue (Y-yes or N-no? ");
				
				Answer = keyboard.nextLine().toUpperCase().charAt(0);
					
				if (Answer == 'Y')
					break;
					
				else
				{
					if (Answer == 'N')
						break;
						
					else
						System.out.printf("\nERROR: invalid choice %s\n", Answer);
						continue;
				}
				
			 } while (Answer != 'Y' || Answer != 'N');
				
					
			if (Answer == 'Y') 
				continue;
				
			else if (Answer == 'N')
				break;
				
			else
				continue;
		
		} while(true);
	}
	
	/**
	 * getExample void method display the example of a magic square
	 */
	public static void getExample()
	{
		// Array of magic square
		int[][] magic = 
		{
						{4, 9, 2},
						{3, 5, 7},
						{8, 1, 6}
		};
				
		// Print array in matrix form
		System.out.println("A Lo Shu magic square is a square that sum of each rows and sum of each collums are the same (numbers from 1...9).");
		System.out.println("For example: \n");
		
		for (int row = 0; row < 3; row++)
		{
			for (int collum = 0; collum < 3; collum++)
			{
				System.out.printf("%-2d", magic[row][collum]);
			}
					
				System.out.println();
		}
				
				
		// Call method isMagicSquare with magic array
		System.out.println();
		isMagicSquare(magic);
				
	}
	
	/**
	 * getMenu method display the options for the user and return the input-integer type
	 * @return choice - integer type
	 */
	public static int getMenu()
	{
		System.out.println("\nUser's menu:\n"
				+ "1. Display examples.\n"
				+ "2. Build your own quare and check it.\n"
				+ "0. Exit the program.\n");
		
		int choice = Input.getInteger("Enter your choice: ", 0,2);
		return choice;
	}
	
	/**
	 * getUserSquare method ask the user inputs to build their own square-integer type
	 * @param square-integer array type
	 * return square-integer array type
	 */
	public static int[][] getUserSquare(int[][] square)
	{
		for (int row = 0; row < square.length; row++)
		{
			for (int collum = 0; collum < square.length; collum++)
			{
				square[row][collum] = Input.getInteger("Enter the first number for row " + (row + 1) + " and collum " + (collum + 1) +": ", 1,9);		
			}
					
				System.out.println();
		}
		
		return square;
	}
		
	/**
	* isMagicSquare void method that takes array and 
	* calculates sum of rows, columns, and sum of
	* left and right diagonals. Check if the all values are all equal. 
	* Then display square is magical if true, square is not magical if false
	* @param array-integer type
	*/
	public static void isMagicSquare(int[][] array)
	{
		boolean magic = false;
		
		// Calculate the sum of rows
		int row_1_Sum = 0;
		for (int row = 0; row < array.length; row++)
		{
			row_1_Sum += array[0][row];
		}
		
		int row_2_Sum = 0;
		for (int row = 0; row < array.length; row++)
		{
			row_2_Sum += array[1][row];
		}
		
		int row_3_Sum = 0;
		for (int row = 0; row < array.length; row++)
		{
			row_3_Sum += array[2][row];			
		}
		
		// Calculate the sum of columns
		int collum_1_Sum = 0;
		for (int collum = 0; collum < array.length; collum++)
		{
			collum_1_Sum += array[collum][0];
		}
		
		int collum_2_Sum = 0;
		for (int collum = 0; collum < array.length; collum++)
		{
			collum_2_Sum += array[collum][1];
		}
		
		int collum_3_Sum = 0;
		for (int collum = 0; collum < array.length; collum++)
		{
			collum_3_Sum += array[collum][2];
		}
		
		// Left diagonal sum
		int leftDiagonalSum	= array[0][0] + array[1][1] + array[2][2];
		
		// Right diagonal sum
		int rightDiagonalSum = array[0][2] + array[1][1] + array[2][0];
		
		// Check if sum of rows, columns, and diagonal are equal 
		if((row_1_Sum == row_2_Sum) && (row_2_Sum == row_3_Sum) 
				&& (row_3_Sum == row_1_Sum) && (collum_1_Sum == collum_2_Sum) 
				&& (collum_2_Sum == collum_3_Sum) && (collum_1_Sum == collum_3_Sum) 
				&& (leftDiagonalSum == rightDiagonalSum))
			System.out.println("\nThis square is magic.");
		
		else
			System.out.println("\nThis square is not magic.");
	}
}
