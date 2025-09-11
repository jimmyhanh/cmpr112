//Hung Anh Ho
//10-27-2022
//Grade book

import java.util.Scanner;
public class GradeBook 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);	
		
		//Arrays to hold values
		String[] names = new String[5]; //Array hold 5 names
		double[][] scores = new double[5][4]; //Array takes five names of students & four scores of each. 
		char[] grades = new char[5]; //Array hold letter grade character
		
		char Answer;
		do
		{	
			System.out.println("Grade book opened.\n==============================");
			//Iterating over students
			for(int i=0; i < 5; i++)
			{  
				//Input names
				names[i] = Input.getString("\nEnter student name #" + (i+1) + ": ");			          
			    System.out.println("Please input the 4 test scores.");      
				//Input scores
				for(int j = 0; j < 4; j++)
				{
					//Storing score
					scores[i][j] = Input.getDouble("Enter score of test #" + (j+1) + ": ", 0,100);       
				}
			}
			
			
			      
			//Students display for names and tests
			for(int i = 0; i < 5; i++)
			{
				System.out.println("==============================");
				System.out.println("\nStudent name: " + names[i]);
				System.out.println("----------------");
				
				//Getting the average test score one person at a time
				double average = getAverage(scores, i);
		        grades[i] = getGrade(average);
		        
				//display scores
				for(int j = 0; j < 4; j++)
				{
					System.out.printf("\nTest score #%d: %.2f", (j+1), scores[i][j]);
				}
				
				//Display lowest score, average and leter grade
				System.out.println("\n----------------");
				System.out.printf("Average score: %.2f\n", average);
				System.out.println("----------------");
				System.out.printf("Letter grade: %s\n", grades[i]);
				System.out.println("==============================\n");
			}
			      
			do
			{
				System.out.print("\nContinue (Y-yes or N-no)? ");
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
		 * getAverage method take in scores and index of the student, 
		 * sum up and divide by the number of tests to return the average score-double type
		 * @param scores-double type
		 * @param index-integer type
		 * @return average score- double type
		 */
		public static double getAverage(double[][] scores, int index)
		{
	       //Initially set sum to 0
	       double sum = 0;
	       int testCount = 0;
	       //Copying names
	       for (int j = 0; j < 4; j++)
	       {
	    	   //Accumulating scores
	    	   sum += scores[index][j];
	    	   testCount++;
	       }
	    	   
	       //Returning average
	       return (sum / testCount);
		}

	   /**
	    * getGrade method take in the average score of a student and return the letter grade-char type
	    * @param average-double type
	    * @return letter grade - char type
	    */
	   public static char getGrade(double average)
	   {
		   
	       //For 90 -100
	       if(average >= 90)
	       {
	           return 'A';
	       }
	       
	       //For 80 - 89
	       else if(average > 80 && average < 90)
	       {
	           return 'B';
	       }
	       
	       //For 70 - 79
	       else if(average > 70 && average < 79)
	       {
	           return 'C';
	       }
	       
	       //For 60 - 69
	       else if(average > 60 && average < 69)
	       {
	           return 'D';
	       }
	       
	       //For 0-59
	       else
	       {
	           return 'F';
	       }
	   } 
}
