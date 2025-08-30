//Hung Anh Ho
//9-21-2022
//Exam 1
import java.util.Scanner;
public class Exam1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Decorator
		String Decorator = "	=============================================================================================================================";
		String Decorator2 = "	=====================================================================";
		
		//Banner
		System.out.println();
		System.out.println("	CMPR112 Exam#1: Western Astrology by Hung Anh Ho (9-28-2022)");
		System.out.println(Decorator);
		System.out.println();
		System.out.println("                                                                           @\r\n"
				+ "                JJJJJJJJJJJJJj                                             |              ____\r\n"
				+ "                      Jj                                             @=====0=====@=======|    |             @\r\n"
				+ "                      Jj                                                   |             | [] |             |\r\n"
				+ "                      Jj                                                   @             |____|=======@=====1=====@\r\n"
				+ "                      Jj                                                  /|\\              ||               |\r\n"
				+ "                      Jj                                                 // \\\\             ||               @\r\n"
				+ "                      Jj                                                //   \\\\            ||              /|\\\r\n"
				+ "                      Jj       Aa     Vv     Vv       Aa               //     \\\\           ||             //|\\\\\r\n"
				+ "                      Jj      Aa Aa   Vv     Vv      Aa Aa            //   ^   \\\\          ||            // | \\\\\r\n"
				+ "                      Jj     Aa  Aa   Vv     Vv     Aa  Aa           //   / \\   \\\\         ||           //  |  \\\\\r\n"
				+ "                      Jj    Aa   Aa   Vv     Vv    Aa   Aa          //   /180\\   \\\\        ||          //   ^   \\\\\r\n"
				+ "                Jj    Jj   Aa    Aa   Vv     Vv   Aa    Aa         //   -------   \\\\       ||         //   / \\   \\\\\r\n"
				+ "                Jj    Jj   Aa    Aa    Vv   Vv    Aa    Aa        (((((((((-)))))))))      ||        //   /210\\   \\\\\r\n"
				+ "                 Jj  Jj     Aa  aAa     Vv Vv      Aa  aAa          ===============        ||       //   -------   \\\\\r\n"
				+ "                  JjJj       AaA Aa      VvVv       AaA Aa                 *               ||      (((((((((+)))))))))\r\n"
				+ "                   Jj         Aa Aa       Vv         Aa Aa                                 ||        ===============\r\n"
				+ "                                                                                           ||               *\r\n"
				+ "                                                                                    +++++++||+++++++\r\n"
				+ "                                                                                   ++==============++\r\n"
				+ "");
		System.out.println();
		System.out.println("	Programming is fun, challenging, and at the same time definitely it helps in training your mind!");
		System.out.println(Decorator);
		System.out.println();
		System.out.println("	The western astrology is a design of prediction established for the development of a horoscope for a\r\n"
							+ "	definite minute, such as an individual's birth. It uses equatorial zodiac, which is regulated to the\r\n"
							+ "	equator points. There are 12 zodiac signs: Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio,\r\n"
							+ "	Sagittarius, Capricorn, Aquarius and Pisces. Each sign has its own strengths, weaknesses, and specific\r\n"
							+ "	traits, desires and attitude towards life and people.");
		System.out.println();
		System.out.println("	Let's begin input...");
		System.out.println();
		
		
		
		//Start of the 1st person's inputs
		//First person name
		String Name1 = null;
		
		System.out.print("	Enter Person #1's name: ");
		Name1 = keyboard.nextLine();
		
		if (Name1 == null || Name1.length() == 0 )
		{
			System.out.println("	ERROR: Invalid name. It cannot be empty. Program is terminated.");
			return;
		}
		
		
		
		//User's input for year for the 1st person
		int Year1;
		
		System.out.print("	Enter his/her valid birth year(1922...2022): ");
		Year1 = keyboard.nextInt();
		keyboard.nextLine();
		
		
		//Detect year limits #1
		String LeapYear = null;
		
		if(Year1 > 1922 && Year1 <= 2022)
		{
			
		// Check for leap year
			if (((Year1 % 4 == 0) && (Year1 % 100!= 0)) || (Year1 % 400 == 0))
		         LeapYear = "true";
			
		    else
		    	 LeapYear = "false";
		}
		
		else
		{
			System.out.println("	ERROR: Invalid input year. It cannot be out of range(1922...2022). Program is terminated.");
			return;
		}
		
		
		
		//User's input for Month #1
		int Month1;
		
		System.out.print("	Enter his/her valid birth month(1..12): ");
		Month1 = keyboard.nextInt();
		keyboard.nextLine();
		
		
		
		//Detect month limits
		if (Month1 <= 0 || Month1 > 12)
		{
			System.out.println("	ERROR: Invalid input month. It cannot be out of range(1...12). Program is terminated.");
			return;
		}
		
		
		
		//Conditional statements to input and check date limits #1
		int Date1;
		
		if ((LeapYear == "true") && (Month1 == 2)) //For leap year and if it is February
		{
			System.out.print("	Enter his/her valid birth date(1..28) for February: ");
			Date1 = keyboard.nextInt();
			keyboard.nextLine();
				
			if (Date1 <= 0 || Date1 > 28) // Error display when exceeding limits for a leap year's February
			{
				System.out.println("	ERROR: Invalid input for date. It cannot be out of range(1...28). Program is terminated.");
				return;
			}
		}
		
		else // For other months
		{
			System.out.print("	Enter his/her valid birth date(1...31): ");
			Date1 = keyboard.nextInt();
			keyboard.nextLine();
				
			if (Month1 == 1 ||  Month1 == 3 || Month1 == 5 || Month1 == 7 || Month1 == 9 || Month1 == 11)
			{
				if (Date1 <= 0 || Date1 > 31) // Error display when exceeding limits
				{
					System.out.println("	ERROR: Invalid input for date. It cannot be out of range(1...31). Program is terminated.");
					return;
				}
			}
			
			else if(Month1 == 2)// For regular February
			{
				if (Date1 <= 0 || Date1 > 29) // Error display when exceeding limits for February
				{
					System.out.println("	ERROR: Invalid input for date. It cannot be out of range(1...29). Program is terminated.");
					return;
				}
			}
			
			else // Error display when exceeding limits for months with 30 days
			{
				if (Date1 <= 0 || Date1 > 30)
				{
					System.out.printf("	Error! The month you entered only have 30 days.\n"
										+ "         The number of date cannot be less than 1.\n");
					System.out.println("	ERROR: Invalid input day. It cannot be out of range(1...30). Program is terminated.");
					return;
				}
			}
		}
		
		
			
		//Zodiac signs and elements declare #1
		//Source: https://www.travelchinaguide.com/intro/astrology/western-zodiac/
		String Zodiac1 = null;
		String Element1 = null;
		String Characteristics1 = null;
		
		//Find the Zodiac sign, organized with the starting month from 1-12
		if ((Month1 ==  1 && Date1 >= 20 && Date1 <= 31) || (Month1 ==  2 && Date1 >= 1 && Date1 <= 18))
		{
			 Zodiac1 ="Aquarius"; 
			 Element1 = "Air";
			 Characteristics1 = "Smart, liberalistic and changeful";
		}
			
	   else if ((Month1 ==  2 && Date1 >= 19 && Date1 <= 29) || (Month1 ==  3 && Date1 >= 1 && Date1 <= 20))
	    {
	    		Zodiac1 = "Pisces";
	    		Element1 = "Water";
	    		Characteristics1 = "Romantic, kind and sentimental";
	    }
			
	   else if ((Month1 ==  3 && Date1 >= 21 && Date1 <= 31) || (Month1 ==  4 && Date1 >= 1 && Date1 <= 19))
	    {
	    		Zodiac1 = "Aries";
	    		Element1 = "Fire";
	    		Characteristics1 = "Energetic, candid and willful";
	    }
			
	   else if ((Month1 ==  4 && Date1 >= 20 && Date1 <= 30) || (Month1 ==  5 && Date1 >= 1 && Date1 <= 20))
	    {
	    		Zodiac1 = "Taurus";
	    		Element1 = "Earth";
	    		Characteristics1 = "Reliable, diligent and conservative";
	    }
			
	   else if ((Month1 ==  5 && Date1 >= 21 && Date1 <= 31) || (Month1 ==  6 && Date1 >= 1 && Date1 <= 21))
	    {
	    	Zodiac1 = "Gemini";
	    	Element1 = "Air";
	    	Characteristics1 = "Quick-witted, capricious and cheerful";
	    }
			
	   else if ((Month1 ==  6 && Date1 >= 22 && Date1 <= 30) || (Month1 ==  7 && Date1 >= 1 && Date1 <= 22))
	    {
	    	Zodiac1 = "Cancer";
	    	Element1 = "Water";
	    	Characteristics1 = "Considerate, imaginative and sensitive";
		}
			
	   else if ((Month1 ==  7 && Date1 >= 23 && Date1 <= 31) || (Month1 ==  8 && Date1 >= 1 && Date1 <= 22))
	    {
	    	Zodiac1 = "Leo";
	    	Element1 = "Fire";
	    	Characteristics1 = "Enthusiastic, proud and arrogant";
	    }
			
	   else if ((Month1 ==  8 && Date1 >= 23 && Date1 <= 31) || (Month1 ==  9 && Date1 >= 1 && Date1 <= 22))
	    {
	    	Zodiac1 = "Virgo";
	    	Element1 = "Earth";
	    	Characteristics1 = "Elegant, perfectionist and picky";
	    }
			
	   else if ((Month1 ==  9 && Date1 >= 23 && Date1 <= 30) || (Month1 == 10 && Date1 >= 1 && Date1 <= 23))
	    {
	    	Zodiac1 = "Libra";
	    	Element1 = "Air";
	    	Characteristics1 = "Equitable, charming and hesitant";
	    }
		
	   else if ((Month1 == 10 && Date1 >= 24 && Date1 <= 31) || (Month1 == 11 && Date1 >= 1 && Date1 <= 22))
	    {
	    	Zodiac1 = "Scorpio";
	    	Element1 = "Water";
	    	Characteristics1 = "Insightful, mysterious and suspicious";
	    }
			
	   else if ((Month1 == 11 && Date1 >= 23 && Date1 <= 30) || (Month1 == 12 && Date1 >= 1 && Date1 <= 21))
	    {
	    	Zodiac1 = "Sagittarius";
	    	Element1 = "Earth";
	    	Characteristics1 = "Unconstrained, lively and rash";
	    }
			
	   else if ((Month1 == 12 && Date1 >= 22 && Date1 <= 31) || (Month1 ==  1 && Date1 >= 1 && Date1 <= 19))
	    {
	    	Zodiac1 = "Capricorn";
	    	Element1 = "Fire";
	    	Characteristics1 = "Perseverant, practical and lonely";
	    }
				
			 
			
		//Convert months number input of months into month names #1
		String MonthName1 = null;
		
		if (Month1 == 1)
			MonthName1 = "January";
		
		else if (Month1 == 2)
			MonthName1 = "February";
		
		else if (Month1 == 3)
			MonthName1 = "March";
		
		else if (Month1 == 4)
			MonthName1 = "April";
		
		else if (Month1 == 5)
			MonthName1 = "May";
		
		else if (Month1 == 6)
			MonthName1 = "June";
		
		else if (Month1 == 7)
			MonthName1 = "July";
		
		else if (Month1 == 8)
			MonthName1 = "August";
		
		else if (Month1 == 9)
			MonthName1 = "September";
		
		else if (Month1 == 10)
			MonthName1 = "October";
		
		else if (Month1 == 11)
			MonthName1 = "November";
		
		else if (Month1 == 12)
			MonthName1 = "December";
		
		
		
		//Convert 4 digits year into 2 last digits
		int Year1_2_End_Digits;
		
		if (MonthName1 == "January" || MonthName1 == "February")
			Year1_2_End_Digits = (Year1 - 1) % 100;
		
		else	
			Year1_2_End_Digits = Year1 % 100;
		
		
		
		//Convert 4 digits year into 2 last digits
		int Year1_2_Start_Digits;
		
		if (MonthName1 == "January" || MonthName1 == "February")
			Year1_2_Start_Digits = (Year1 - 1) /100;
		
		else
			Year1_2_Start_Digits = Year1 /100;
		
		
		
		//Zeller formula month conversion to number
		int January = 13;
		int February = 14;
		int March = 3;
		int April = 4;
		int May = 5;
		int June = 6;
		int July = 7;
		int August = 8;
		int September = 9;
		int October = 10;
		int November = 11;
		int December = 12;
		
		
		
		//Zeller formula for find corresponding number for date name of the week
		int Day_of_the_Week_1 = 0;
		int DateName1_Number = 0;
		
		if (MonthName1 == "January")	
			DateName1_Number = Date1 + 13 * (January + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits); 
		
		else if (MonthName1 == "February")			
			DateName1_Number = Date1 + 13 * (February + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits); 
		
		else if (MonthName1 == "March")
			
			DateName1_Number = Date1 + 13 * (March + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits); 
		else if (MonthName1 == "April")
			
			DateName1_Number = Date1 + 13 * (April + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "May")
			
			DateName1_Number = Date1 + 13 * (May + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "June")
			
			DateName1_Number = Date1 + 13 * (June + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "July")
			
			DateName1_Number = Date1 + 13 * (July + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "August")
			
			DateName1_Number = Date1 + 13 * (August + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "September")
			
			DateName1_Number = Date1 + 13 * (September + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "October")
			
			DateName1_Number = Date1 + 13 * (October + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else if (MonthName1 == "November")
			
			DateName1_Number = Date1 + 13 * (November + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		
		else if (MonthName1 == "December")
			DateName1_Number = Date1 + 13 * (December + 1) / 5 + Year1_2_End_Digits + (Year1_2_End_Digits / 4) + (Year1_2_Start_Digits / 4) + (5 * Year1_2_Start_Digits);
		else
		{
			System.out.println("	Error at assigning number for date names. Terminating is the program.");
			return;			
		}
		
		//Convert the number found into day of the week number
		Day_of_the_Week_1 = DateName1_Number % 7;
		
		
		
		//The number found by Zeller formula into date name		
		String DateName1 = null;
		
		if (Day_of_the_Week_1 == 0)
			DateName1 = "Saturday";
		
		else if (Day_of_the_Week_1 == 1)
			DateName1 = "Sunday";
		
		else if (Day_of_the_Week_1 == 2)
			DateName1 = "Monday";
		
		else if (Day_of_the_Week_1 == 3)
			DateName1 = "Tuedays";
		
		else if (Day_of_the_Week_1 == 4)
			DateName1 = "Wednesday";
		
		else if (Day_of_the_Week_1 == 5)
			DateName1 = "Thursday";
		
		else if (Day_of_the_Week_1 == 6)
			DateName1 = "Friday";
		else
		{
			System.out.println("	Error at assigning date names. Terminating the program.");
			return;			
		}
		
		
		
		//Upgrade date format #1
		String DateFormat1 = null;
		
		if (Date1 == 1 || Date1 == 21 || Date1 == 31)
			DateFormat1 = Date1 + "st";
		
		else if (Date1 == 2 || Date1 == 12 || Date1 == 22)
			DateFormat1 = Date1 + "nd";
		
		else if (Date1 == 3 || Date1 == 13 || Date1 == 23)
			DateFormat1 = Date1 + "rd";
		
		else
			DateFormat1 = Date1 + "th";
		
		//The end of person #1 input	
		
		
		
		
		//Start of the 2nd person's input
		//Second person name
		String Name2;
		
		System.out.println();
		System.out.print("	Enter Person #2 name: ");
		Name2 = keyboard.nextLine();						
				
		if (Name2 == null || Name2.length() == 0)
		{
			System.out.println("	ERROR: Invalid name. It cannot be empty. Program is terminated.");
			return;
		}
				
				
				
		//User's input for year for the 2nd person
		int Year2;
		
		System.out.print("	Enter his/her valid birth year(1922...2022): ");
		Year2 = keyboard.nextInt();
		keyboard.nextLine();
				
				
				
		//Detect year limits #2	
		if(Year2 > 1922 && Year2 <= 2022)
		{
					
		// Check for leap year
			if (((Year2 % 4 == 0) && (Year2 % 100!= 0)) || (Year2 % 400 == 0))
				LeapYear = "true";
					
			else
				LeapYear = "false";
		}
		
		else
		{
			System.out.println("	ERROR: Invalid input year. It cannot be out of range(1922...2022). Program is terminated.");
			return;
		}
				
				
				
		//User's input for Month #2
		int Month2;
		
		System.out.print("	Enter his/her valid birth month(1..12): ");
		Month2 = keyboard.nextInt();
		keyboard.nextLine();
				
				
				
		//Detect month limits
		if (Month2 <= 0 || Month2 > 12)
		{
			System.out.println("	ERROR: Invalid input month. It cannot be out of range(1...12). Program is terminated.");
			return;
		}
				
				
				
		//Conditional statements to input and check date limits #2
		int Date2;
		if ((LeapYear == "true") && (Month2 == 2)) //For leap year and if it is February
		{
			System.out.print("	Enter his/her valid birth date(1...28) for February: ");
			Date2 = keyboard.nextInt();
			keyboard.nextLine();
						
			if (Date2 <= 0 || Date2 > 28) // Error display when exceeding limits for a leap year's February
			{
				System.out.println("	ERROR: Invalid input for day. It cannot be out of range(1...28). Program is terminated.");
				return;
			}
		}
				
		else // For other months
		{
			System.out.print("	Enter his/her valid birth date(1..31): ");
			Date2 = keyboard.nextInt();
			keyboard.nextLine();
						
			if (Month2 == 1 ||  Month2 == 3 || Month2 == 5 || Month2 == 7 || Month2 == 9 || Month2 == 11)
			{
				if (Date2 <= 0 || Date2 > 31) // Error display when exceeding limits
				{
					System.out.println("	ERROR: Invalid input for day. It cannot be out of range(1...31). Program is terminated.");
					return;
				}
			}
					
			else if(Month2 == 2)
			{
				if (Date2 <= 0 || Date2 > 29) // Error display when exceeding limits for February
				{
				System.out.println("	ERROR: Invalid input for day. It cannot be out of range(1...29). Program is terminated.");
				return;
				}
			}
					
			else // Error display when exceeding limits for months with 30 days
			{
				if (Date2 <= 0 || Date2 > 30)
				{
				System.out.printf("	Error! The month you entered only have 30 days.\n"
									+ "	The number of date cannot be less than 1.\n");
				System.out.println("	ERROR: Invalid input day. It cannot be out of range(1...30). Program is terminated.");
				return;
				}
			}
		}
				
				
					
		//Zodiac signs and elements declare #2
		//Source: https://www.travelchinaguide.com/intro/astrology/western-zodiac/
		String Zodiac2 = null;
		String Element2 = null;
		String Characteristics2 = null;
				
		//Find the Zodiac sign, organized with the starting month from 1-12
		if ((Month2 ==  1 && Date2 >= 20 && Date2 <= 31) || (Month2 ==  2 && Date2 >= 1 && Date2 <= 18))
		{
			Zodiac2 ="Aquarius"; 
			Element2 = "Air";
			Characteristics2 = "Smart, liberalistic and changeful";
		}
					
		else if ((Month2 ==  2 && Date2 >= 19 && Date2 <= 29) || (Month2 ==  3 && Date2 >= 1 && Date2 <= 20))
		{
			Zodiac2 = "Pisces";
			Element2 = "Water";
			Characteristics2 = "Romantic, kind and sentimental";
		}
					
		else if ((Month2 ==  3 && Date2 >= 21 && Date2 <= 31) || (Month2 ==  4 && Date2 >= 1 && Date2 <= 19))
		{
			Zodiac2 = "Aries";
			Element2 = "Fire";
			Characteristics2 = "Energetic, candid and willful";
		}
					
		else if ((Month2 ==  4 && Date2 >= 20 && Date2 <= 30) || (Month2 ==  5 && Date2 >= 1 && Date2 <= 20))
		{
			Zodiac2 = "Taurus";
			Element2 = "Earth";
			Characteristics2 = "Reliable, diligent and conservative";
		}
					
		else if ((Month2 ==  5 && Date2 >= 21 && Date2 <= 31) || (Month2 ==  6 && Date2 >= 1 && Date2 <= 21))
		{
			Zodiac2 = "Gemini";
			Element2 = "Air";
			Characteristics2 = "Quick-witted, capricious and cheerful";
		}
					
		else if ((Month2 ==  6 && Date2 >= 22 && Date2 <= 30) || (Month2 ==  7 && Date2 >= 1 && Date2 <= 22))
		{
			Zodiac2 = "Cancer";
			Element2 = "Water";
			Characteristics2 = "Considerate, imaginative and sensitive";
		}
					
		else if ((Month2 ==  7 && Date2 >= 23 && Date2 <= 31) || (Month2 ==  8 && Date2 >= 1 && Date2 <= 22))
		{
			Zodiac2 = "Leo";
			Element2 = "Fire";
			Characteristics2 = "Enthusiastic, proud and arrogant";
		}
					
		else if ((Month2 ==  8 && Date2 >= 23 && Date2 <= 31) || (Month2 ==  9 && Date2 >= 1 && Date2 <= 22))
		{
			Zodiac2 = "Virgo";
			Element2 = "Earth";
			Characteristics2 = "Elegant, perfectionist and picky";
		}
					
		else if ((Month2 ==  9 && Date2 >= 23 && Date2 <= 30) || (Month2 == 10 && Date2 >= 1 && Date2 <= 23))
		{
			Zodiac2 = "Libra";
			Element2 = "Air";
			Characteristics2 = "Equitable, charming and hesitant";
		}
				
		else if ((Month2 == 10 && Date2 >= 24 && Date2 <= 31) || (Month2 == 11 && Date2 >= 1 && Date2 <= 22))
		{
			Zodiac2 = "Scorpio";
			Element2 = "Water";
			Characteristics2 = "Insightful, mysterious and suspicious";
		}
					
		else if ((Month2 == 11 && Date2 >= 23 && Date2 <= 30) || (Month2 == 12 && Date2 >= 1 && Date2 <= 21))
		{
			Zodiac2 = "Sagittarius";
			Element2 = "Earth";
			Characteristics2 = "Unconstrained, lively and rash";
		}
					
		else if ((Month2 == 12 && Date2 >= 22 && Date2 <= 31) || (Month2 ==  1 && Date2 >= 1 && Date2 <= 19))
		{
			Zodiac2 = "Capricorn";
			Element2 = "Fire";
			Characteristics2 = "Perseverant, practical and lonely";
		}
				
					 
					
		//Convert month number input of month into month names #2
		String MonthName2 = null;
		
		if (Month2 == 1)
			MonthName2 = "January";
		
		else if (Month2 == 2)
			MonthName2 = "February";
		
		else if (Month2 == 3)
			MonthName2 = "March";
		
		else if (Month2 == 4)
			MonthName2 = "April";
		
		else if (Month2 == 5)
			MonthName2 = "May";
		
		else if (Month2 == 6)
			MonthName2 = "June";
		
		else if (Month2 == 7)
			MonthName2 = "July";
		
		else if (Month2 == 8)
			MonthName2 = "August";
		
		else if (Month2 == 9)
			MonthName2 = "September";
		
		else if (Month2 == 10)
			MonthName2 = "October";
		
		else if (Month2 == 11)
			MonthName2 = "November";
		
		else if (Month2 == 12)
			MonthName2 = "December";
				
				
				
		//Convert 4 digits year into 2 last digits
		int Year2_2_End_Digits;
		
		if(MonthName2 == "January" || MonthName2 == "February")
					Year2_2_End_Digits = (Year2 - 1) % 100;
		
		else	
			Year2_2_End_Digits = Year2 % 100;
				
				
				
		//Convert 4 digits year into 2 last digits
		int Year2_2_Start_Digits;
		
		if(MonthName2 == "January" || MonthName2 == "February")
			Year2_2_Start_Digits = (Year2 - 1) /100;
		
		else
			Year2_2_Start_Digits = Year2 /100;
		
				
				
		//Zeller formula for find corresponding number for date name of the week
		int Day_of_the_Week_2 = 0;
		int DateName2_Number = 0;
		
		if (MonthName2 == "January")
			DateName2_Number = Date2 + 13 * (January + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits); 
		
		else if (MonthName2 == "February")
			DateName2_Number = Date2 + 13 * (February + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits); 
		
		else if (MonthName2 == "March")
			DateName2_Number = Date2 + 13 * (March + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits); 
		
		else if (MonthName2 == "April")
			DateName2_Number = Date2 + 13 * (April + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "May")
			DateName2_Number = Date2 + 13 * (May + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "June")
			DateName2_Number = Date2 + 13 * (June + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "July")
			DateName2_Number = Date2 + 13 * (July + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "August")
			DateName2_Number = Date2 + 13 * (August + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "September")
			DateName2_Number = Date2 + 13 * (September + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "October")
			DateName2_Number = Date2 + 13 * (October + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "November")
			DateName2_Number = Date2 + 13 * (November + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else if (MonthName2 == "December")
			DateName2_Number = Date2 + 13 * (December + 1) / 5 + Year2_2_End_Digits + (Year2_2_End_Digits / 4) + (Year2_2_Start_Digits / 4) + (5 * Year2_2_Start_Digits);
		
		else
		{
			System.out.println("	Error at assigning number for date names. Terminating the program.");
			return;			
		}
				
		//Convert the number found into day of the week number
		Day_of_the_Week_2 = DateName2_Number % 7;
				
				
				
		//The number found by Zeller formula into date name		
		String DateName2 = null;
		
		if (Day_of_the_Week_2 == 0)
			DateName2 = "Saturday";
		
		else if (Day_of_the_Week_2 == 1)
			DateName2 = "Sunday";
		
		else if(Day_of_the_Week_2 == 2)
			DateName2 = "Monday";
		
		else if (Day_of_the_Week_2 == 3)
			DateName2 = "Tuedays";
		
		else if (Day_of_the_Week_2 == 4)
			DateName2 = "Wednesday";
		
		else if (Day_of_the_Week_2 == 5)
			DateName2 = "Thursday";
		
		else if (Day_of_the_Week_2 == 6)
			DateName2 = "Friday";
		
		else
		{
			System.out.println("	Error at assigning date names. Terminating the program.");
			return;			
		}
				
				
				
		//Upgrade date format #2
		String DateFormat2 = null;
		
		if (Date2 == 1 || Date2 == 21 || Date2 == 31)
			DateFormat2 = Date2 + "st";
		
		else if (Date2 == 2 || Date2 == 12 || Date2 == 22)
			DateFormat2 = Date2 + "nd";
		
		else if (Date2 == 3 || Date2 == 13 || Date2 == 23)
			DateFormat2 = Date2 + "rd";
		else
			DateFormat2 = Date2 + "th";
		
		//The end of person #2 input			

		

		

		//Start of 3rd person's input
		//Third person name
		String Name3;
		
		System.out.println();
		System.out.print("	Enter Person #3 name: ");
		Name3 = keyboard.nextLine();						
		
		if (Name3 == null || Name3.length() == 0)
		{
			System.out.println("	ERROR: Invalid name. It cannot be empty. Program is terminated.");
			return;
		}
		
		
		
		//User's input for year for the 3rd person
		int Year3;
		
		System.out.print("	Enter his/her valid birth year(1922...2022): ");
		Year3 = keyboard.nextInt();
		keyboard.nextLine();
		
		
		
		//Detect year limits #3		
		if(Year3 > 1922 && Year3 <= 2022)
		{
			
		// Check for leap year
			if (((Year3 % 4 == 0) && (Year3 % 100!= 0)) || (Year3 % 400 == 0))
		         LeapYear = "true";
			
		    else
		    	 LeapYear = "false";
		}		
		else
		{
			System.out.println("	ERROR: Invalid input year. It cannot be out of range(1922...2022). Program is terminated.");
			return;
		}
		
		
		
		//User's input for Month #3
		int Month3;
		
		System.out.print("	Enter his/her valid birth month(1..12): ");
		Month3 = keyboard.nextInt();
		keyboard.nextLine();
		
		
		
		//Detect month limits
		if(Month3 <= 0 || Month3 > 12)
		{
			System.out.println("	ERROR: Invalid input month. It cannot be out of range(1...12). Program is terminated.");
			return;
		}
		
		
		
		//Conditional statements to input and check date limits #3
		int Date3;
		
		if ((LeapYear == "true") && (Month3 == 2)) //For leap year and if it is February
		{
			System.out.print("	Enter his/her valid birth date(1..28): ");
			Date3 = keyboard.nextInt();
			keyboard.nextLine();
				
			if (Date3 <= 0 || Date3 > 28) // Error display when exceeding limits for a leap year's February
			{
				System.out.println("	ERROR: Invalid input for day. It cannot be out of range (1...28). Program is terminated.");
				return;
			}
		}
		
		else // For other months
		{
			System.out.print("	Enter his/her valid birth date(1..31): ");
			Date3 = keyboard.nextInt();
			keyboard.nextLine();
				
			if(Month3 == 1 ||  Month3 == 3 || Month3 == 5 || Month3 == 7 || Month3 == 9 || Month3 == 11)
			{
				if(Date3 <= 0 || Date3 > 31) // Error display when exceeding limits
				{
					System.out.println("	ERROR: Invalid input for day. It cannot be out of range(1...31). Program is terminated.");
					return;
				}
			}
			
			else if(Month3 == 2)
			{
				if(Date3 <= 0 || Date3 > 29) // Error display when exceeding limits for February
				{
					System.out.println("	ERROR: Invalid input for day. It cannot be out of range(1...29). Program is terminated.");
					return;
				}
			}
			
			else // Error display when exceeding limits for months with 30 days
			{
				if(Date3 <= 0 || Date3 > 30)
				{
					System.out.printf("	Error! The month you entered only have 30 days.\n"
										+ "	The number of date cannot be less than 1.\n");
					System.out.println("	ERROR: Invalid input day. It cannot be out of range(1...30). Program is terminated.");
					return;
				}
			}
		}
		
		
			
		//Zodiac signs and elements declare #3
		//Source: https://www.travelchinaguide.com/intro/astrology/western-zodiac/
		String Zodiac3 = null;
		String Element3 = null;
		String Characteristics3 = null;
		
		//Find the Zodiac sign, organized with the starting month from 1-12
		if ((Month3 ==  1 && Date3 >= 20 && Date3 <= 31) || (Month3 ==  2 && Date3 >= 1 && Date3 <= 18))
		{
			 Zodiac3 ="Aquarius"; 
			 Element3 = "Air";
			 Characteristics3 = "Smart, liberalistic and changeful";
		}
			
	   else if ((Month3 ==  2 && Date3 >= 19 && Date3 <= 29) || (Month3 ==  3 && Date3 >= 1 && Date3 <= 20))
	    {
	    	Zodiac3 = "Pisces";
	    	Element3 = "Water";
	    	Characteristics3 = "Romantic, kind and sentimental";
	    }
			
	   else if ((Month3 ==  3 && Date3 >= 21 && Date3 <= 31) || (Month3 ==  4 && Date3 >= 1 && Date3 <= 19))
	    {
	    	Zodiac3 = "Aries";
	    	Element3 = "Fire";
	    	Characteristics3 = "Energetic, candid and willful";
	    }
			
	   else if ((Month3 ==  4 && Date3 >= 20 && Date3 <= 30) || (Month3 ==  5 && Date3 >= 1 && Date3 <= 20))
	    {
	    	Zodiac3 = "Taurus";
	    	Element3 = "Earth";
	    	Characteristics3 = "Reliable, diligent and conservative";
	    }
			
	   else if ((Month3 ==  5 && Date3 >= 21 && Date3 <= 31) || (Month3 ==  6 && Date3 >= 1 && Date3 <= 21))
	    {
	    	Zodiac3 = "Gemini";
	    	Element3 = "Air";
	    	Characteristics3 = "Quick-witted, capricious and cheerful";
	    }
			
	   else if ((Month3 ==  6 && Date3 >= 22 && Date3 <= 30) || (Month3 ==  7 && Date3 >= 1 && Date3 <= 22))
	    {
	    	Zodiac3 = "Cancer";
	    	Element3 = "Water";
	    	Characteristics3 = "Considerate, imaginative and sensitive";
		}
			
	   else if ((Month3 ==  7 && Date3 >= 23 && Date3 <= 31) || (Month3 ==  8 && Date3 >= 1 && Date3 <= 22))
	    {
	    	Zodiac3 = "Leo";
	    	Element3 = "Fire";
	    	Characteristics3 = "Enthusiastic, proud and arrogant";
	    }
			
	   else if ((Month3 ==  8 && Date3 >= 23 && Date3 <= 31) || (Month3 ==  9 && Date3 >= 1 && Date3 <= 22))
	    {
	    	Zodiac3 = "Virgo";
	    	Element3 = "Earth";
	    	Characteristics3 = "Elegant, perfectionist and picky";
	    }
			
	   else if ((Month3 ==  9 && Date3 >= 23 && Date3 <= 30) || (Month3 == 10 && Date3 >= 1 && Date3 <= 23))
	    {
	    	Zodiac3 = "Libra";
	    	Element3 = "Air";
	    	Characteristics3 = "Equitable, charming and hesitant";
	    }
		
	   else if ((Month3 == 10 && Date3 >= 24 && Date3 <= 31) || (Month3 == 11 && Date3 >= 1 && Date3 <= 22))
	    {
	    	Zodiac3 = "Scorpio";
	    	Element3 = "Water";
	    	Characteristics3 = "Insightful, mysterious and suspicious";
	    }
			
	   else if ((Month3 == 11 && Date3 >= 23 && Date3 <= 30) || (Month3 == 12 && Date3 >= 1 && Date3 <= 21))
	    {
	    	Zodiac3 = "Sagittarius";
	    	Element3 = "Earth";
	    	Characteristics3 = "Unconstrained, lively and rash";
	    }
			
	   else if ((Month3 == 12 && Date3 >= 22 && Date3 <= 31) || (Month3 ==  1 && Date3 >= 1 && Date3 <= 19))
	    {
	    	Zodiac3 = "Capricorn";
	    	Element3 = "Fire";
	    	Characteristics3 = "Perseverant, practical and lonely";
	    }
		
			 
			
		//Convert month number input of month into month names #3
		String MonthName3 = null;
		
		if (Month3 == 1)
			MonthName3 = "January";
		
		else if (Month3 == 2)
			MonthName3 = "February";
		
		else if (Month3 == 3)
			MonthName3 = "March";
		
		else if (Month3 == 4)
			MonthName3 = "April";
		
		else if (Month3 == 5)
			MonthName3 = "May";
		
		else if (Month3 == 6)
			MonthName3 = "June";
		
		else if (Month3 == 7)
			MonthName3 = "July";
		
		else if (Month3 == 8)
			MonthName3 = "August";
		
		else if (Month3 == 9)
			MonthName3 = "September";
		
		else if (Month3 == 10)
			MonthName3 = "October";
		
		else if (Month3 == 11)
			MonthName3 = "November";
		
		else if (Month3 == 12)
			MonthName3 = "December";
		
		
		
		//Convert 4 digits year into 2 last digits
		int Year3_2_End_Digits;
		
		if(MonthName3 == "January" || MonthName3 == "February")
			Year3_2_End_Digits = (Year3 - 1) % 100;
		
		else	
			Year3_2_End_Digits = Year3 % 100;
		
		
		
		//Convert 4 digits year into 2 last digits
		int Year3_2_Start_Digits;
		
		if(MonthName3 == "January" || MonthName3 == "February")
			Year3_2_Start_Digits = (Year3 - 1) /100;
		
		else
			Year3_2_Start_Digits = Year3 /100;
		
		
		
		
		//Zeller formula for find corresponding number for date name of the week
		int Day_of_the_Week_3 = 0;
		int DateName3_Number = 0;
		
		if(MonthName3 == "January")
			DateName3_Number = Date3 + 13 * (January + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits); 
		
		else if(MonthName3 == "February")
			DateName3_Number = Date3 + 13 * (February + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits); 
		
		else if(MonthName3 == "March")
			DateName3_Number = Date3 + 13 * (March + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits); 
		
		else if(MonthName3 == "April")
			DateName3_Number = Date3 + 13 * (April + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "May")
			DateName3_Number = Date3 + 13 * (May + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "June")
			DateName3_Number = Date3 + 13 * (June + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "July")
			DateName3_Number = Date3 + 13 * (July + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "August")
			DateName3_Number = Date3 + 13 * (August + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "September")
			DateName3_Number = Date3 + 13 * (September + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "October")
			DateName3_Number = Date3 + 13 * (October + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "November")
			DateName3_Number = Date3 + 13 * (November + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else if(MonthName3 == "December")
			DateName3_Number = Date3 + 13 * (December + 1) / 5 + Year3_2_End_Digits + (Year3_2_End_Digits / 4) + (Year3_2_Start_Digits / 4) + (5 * Year3_2_Start_Digits);
		
		else
		{
			System.out.println("	Error at assigning number for date names. Terminating the program.");
			return;			
		}
		
		//Convert the number found into day of the week number
		Day_of_the_Week_3 = DateName3_Number % 7;
		
		
		
		//The number found by Zeller formula into date name		
		String DateName3 = null;
		
		if (Day_of_the_Week_3 == 0)
			DateName3 = "Saturday";
		
		else if (Day_of_the_Week_3 == 1)
			DateName3 = "Sunday";
		
		else if (Day_of_the_Week_3 == 2)
			DateName3 = "Monday";
		
		else if (Day_of_the_Week_3 == 3)
			DateName3 = "Tuedays";
		
		else if (Day_of_the_Week_3 == 4)
			DateName3 = "Wednesday";
		
		else if (Day_of_the_Week_3 == 5)
			DateName3 = "Thursday";
		
		else if (Day_of_the_Week_3 == 6)
			DateName3 = "Friday";
		
		else
		{
			System.out.println("	Error at assigning date names. Terminating the program.");
			return;			
		}
		
		
		
		//Upgrade date format #3
		String DateFormat3 = null;
		
		if (Date3 == 1 || Date3 == 21 || Date3 == 31)
			DateFormat3 = Date3 + "st";
		
		else if (Date3 == 2 || Date3 == 12 || Date3 == 22)
			DateFormat3 = Date3 + "nd";
		
		else if (Date3 == 3 || Date3 == 13 || Date3 == 23)
			DateFormat3 = Date3 + "rd";
		
		else
			DateFormat3 = Date3 + "th";				
		//The end of person #3 input			

		
		
		//Output notfication		
		System.out.println();
		System.out.println("	Output results...");
		System.out.println();
		
		//Display for the first person informations, signs and characteristics
		System.out.println("	Person #1");
		System.out.println(Decorator2);
		System.out.println("	Name            : " + Name1);
		System.out.println("	Birth date      : " + DateName1 + " " + MonthName1 + " " + DateFormat1 + ", " + Year1);
		System.out.println("	Zodiac sign     : " + Zodiac1);
		System.out.println("	Characteristics : " + Characteristics1);
		System.out.println();
		
		//Display for the second person informations, signs and characteristics
		System.out.println("	Person #2");
		System.out.println(Decorator2);
		System.out.println("	Name            : " + Name2);
		System.out.println("	Birth date      : " + DateName2 + " " + MonthName2 + " " + DateFormat2 + ", " + Year2);
		System.out.println("	Zodiac sign     : " + Zodiac2);
		System.out.println("	Characteristics : " + Characteristics2);
		System.out.println();
		
		//Display for the first person informations, signs and characteristics
		System.out.println("	Person #3");
		System.out.println(Decorator2);
		System.out.println("	Name            : " + Name3);
		System.out.println("	Birth date      : " + DateName3 + " " + MonthName3 + " " + DateFormat3 + ", " + Year3);
		System.out.println("	Zodiac sign     : " + Zodiac3);
		System.out.println(" 	Characteristics : " + Characteristics3);
		System.out.println();
		
		
		
		//Zodiac and elements comparison for compatibility
		//For person #1 and person #2
		if (Element1.equals(Element2))
			System.out.printf("	-Fortunately, %s (%s) is highly compatible working with %s (%s).\n", Name1, Zodiac1, Name2, Zodiac2);
		
		else
			System.out.printf("	-Unfortunately, %s (%s) isn't highly compatible working with %s (%s).\n", Name1, Zodiac1, Name2, Zodiac2);
		
		
		//For person #2 and person #3
		if (Element2.equals(Element3))
			System.out.printf("	-Fortunately, %s (%s) is highly compatible working with %s (%s).\n", Name2, Zodiac2, Name3, Zodiac3);
		
		else
			System.out.printf("	-Unfortunately, %s (%s) isn't highly compatible working with %s (%s).\n", Name2, Zodiac2, Name3, Zodiac3);

		
		//For person #3 and person #1
		if (Element3.equals(Element1))
			System.out.printf("	-Fortunately, %s (%s) is highly compatible working with %s (%s).\n", Name3, Zodiac3, Name1, Zodiac1);
		
		else
			System.out.printf("	-Unfortunately, %s (%s) isn't highly compatible working with %s (%s).\n", Name3, Zodiac3, Name1, Zodiac1);		
	}
}
