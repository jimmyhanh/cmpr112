//Hung Anh Ho
//10-15-2022
//Exam 2

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Exam2 
{
	/* In class notes
	 * Method 1- isLeapYear - boolean
	 * Method 2- Zodiac-string
	 *Method 3 -longDateFormat(year, month, day)	"Tuesday, February,..."
	 *Method 4- longYearFormat(int year, int month..);
	 *Method 4 compatible(person 1, person 2)
	 *split();**
	 *toString();
	 * 	
	//menu
	//1. Enter your information find your horoscope
	//2. Check compatible with another person //tokenize the text zodiacs and trim the space;// String wrappper text, include();
	//3. Check compatible with others in a text file //split from comma and hyphen split the birthday//Handle invalid input and duplicates
	//4. write information with compatible people (30 pts extra)
		//Input a list to show Only the highly compatitive line for that person
		//Output result to file	
	//5 Exit the program.
	*/
	
	//Array hold days of the week
	static String dayOfWeek[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	
	//Array hold monthName
	static String monthName[] = {"Unknown", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public static void main(String[] args) throws IOException
	{	
		Scanner keyboard = new Scanner(System.in);
		
		//Decorator
		String Decorator = "	==============================================================================================================";
		String Decorator2 = "	------------------------------------------------------------------------------";
		
		ArrayList<String> compatiblePeople = new ArrayList<String>();
		//Get the list of Zodiacs
		ArrayList<String> zodiacList = new ArrayList<String>();	
		zodiacList = getZodiacList(zodiacList);
		
		//Get list of traits
		ArrayList<String> traitsList = new ArrayList<String>();
		traitsList = getTraitsList(traitsList);
		
		//Array to save the compatible people
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> birthdayList = new ArrayList<String>();
		ArrayList<Integer> AgeList = new ArrayList<Integer>();
		ArrayList<String> peopleZodiacs = new ArrayList<String>();
		ArrayList<String> CharacteristicList = new ArrayList<String>();
		
		//Variables declare
		String compatibleGroup = null;
		int peopleCount = -1;
		int choice = 0;
		String Zodiac = null;
		String Traits = null;
		String longDate = null;
		int age = 0;
		
		//Variable to check when choosing 2nd menu option and didn't input the 1st menu option
		getDisplayBanner(Decorator);
		
		do
	    {			
			//Display menu
		    choice = displayMenu(Decorator2);
		
		        if (choice == 1)
		        {
		        	//Increment when start the option 1
		        	peopleCount = 0;
		        	
		        	//Get user's input, display long date format and return the Zodiac number for reuse	    		
		        	//Person's number
		    		System.out.println("\n		Person #" + (peopleCount + 1));
		    		
		    		//Get user's name
		    		String name = getName();
		    		
		    		//Input and validate birth year
		    		int year = getYear();
		    		
		    		//Validation for leap year
		    		boolean leap = isLeapYear(year);
		    		
		    		//Input and validate birth month
		    		int month = getMonth();
		    		
		    		//Input and validate birth date depend on leap or not leap year
		    		int date = getDate(leap, month);
		    		
		    		//Get long date format
		    		longDate = getLongDateFormat(year, month, date);
		    		
		    		//Get age
		    		age = getAge(year);
		    		
		    		//Get Zodiac's number and traits
		    		int zodiacNumber = getZodiacNumber(year);
		    		Zodiac = getZodiac(zodiacNumber, zodiacList);
		    		Traits = getTraits(zodiacNumber, traitsList);
		    		
		    		//Display the informations
		    		System.out.println("\n		Output...\n\n		Person " + (peopleCount + 1));
		    		System.out.println("		" + Decorator2);
		    		displayUserData(name, longDate, age, Zodiac, Traits);
		    		
		        	//Check for compatible group
		        	compatibleGroup = getCompatibleGroup(Zodiac);
		        	
		        	//Display compatible group
		        	System.out.println("		The user is compatible with " + compatibleGroup);
		        	
		        	//Add to a list of people who are compatible starting with you
		        	nameList.add(name);
		    		birthdayList.add(longDate);
		    		AgeList.add(age);
		    		peopleZodiacs.add(Zodiac);
		    		CharacteristicList.add(Traits);
		        }
		        
		        //Check for option 1 if not done and continue the program
		        else if(peopleCount == -1)
		        {      			
		        	//Terminate it chosen
		        	if(choice == 0)
    		        {
    		            System.out.println("		Program terminated.");
    		        	System.exit(0);
    		        }
		        	
		        	else
		        	{
		        		System.out.println("		ERROR: Option 1 has not been performed. Please complete before selecting this option.\n");
		        		continue;
		        	}
		        }
		        	
		        else if (choice == 2)
		        {
					peopleCount++;
					
			        //Get user's input, display long date format and return the Zodiac number for reuse    		
		        	//Person's number
		    		System.out.println("\n		Person #" + (peopleCount + 1));
		    		
		    		//Get user's name
		    		String name = getName();
		    		
		    		//Input and validate birth year
		    		int year = getYear();
		    		
		    		//Validation for leap year
		    		boolean leap = isLeapYear(year);
		    		
		    		//Input and validate birth month
		    		int month = getMonth();
		    		
		    		//Input and validate birth date depend on leap or not leap year
		    		int date = getDate(leap, month);

		    		//Get Zodiac's number and traits
		    		int zodiacNumber = getZodiacNumber(year);
		    		Zodiac = getZodiac(zodiacNumber, zodiacList);
		    		Traits = getTraits(zodiacNumber, traitsList);
		    		
		    		//Display the informations
		    		System.out.println("\n		Person #" + peopleCount);
		    		System.out.println("		" + Decorator2);
		    		displayUserData(name, longDate, age, Zodiac, Traits);
			        			
			        //Display the informations
				    boolean compatible = isCompatible(compatibleGroup, getZodiac(zodiacNumber, zodiacList));
					        
				    //Check compatiblity to display
					if(compatible == true)
					{
						System.out.println("		This person is highly compatible with the user.");
						
						//Add to a list of people who are compatible starting with you
			        	nameList.add(name);
			    		birthdayList.add(longDate);
			    		AgeList.add(age);
			    		peopleZodiacs.add(Zodiac);
			    		CharacteristicList.add(Traits);
					}
					
					else
						System.out.println("		This person isn't compatible with the user.");
		        
		        }
		        
				else if (choice == 3)
				{
					String input = Input.getString("		Enter a file name (people.txt): ");
					System.out.println("\n		These people are highly compatible with the user:");
					
					//Open file
					File File = new File(input.toLowerCase());
					
					//Check file's existence 
					while (!File.exists()) //Page 245
					 {
						 System.out.println("	The file " + input + " is not found.");		 
						 String FileName = Input.getString("	Enter the correct file name: ");
						 
						 File = new File(FileName.toLowerCase());	 //Check file
					 }
					
					Scanner text = new Scanner(File);
					
					//Read first line
					String line = text.nextLine();
					
					while (text.hasNext())
					{
						do
						{
							//String validate
							String[] info = line.split(",");
							String name = info[0].trim();
							
							//Name verification
							if (name.length()== 0 || name == null)
							{
								System.out.println("		Person #" + (peopleCount + 1)+ " have a name input problem.");
								break;
							}
							
							String[] birthday = info[1].split("-");
							
							//Validate date input
							if (birthday.length == 3)
							{
								peopleCount++;
								
								int month = Integer.parseInt(birthday[0]);
									if (month <= 0 && month > 12)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a month input problem.");
										break;		
									}
								
								int year = Integer.parseInt(birthday[2]);
									if (year < 1922 || year > 2022)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a year input problem.");
										break;
									}
								
									int date = Integer.parseInt(birthday[1]);
									
								//Input validate for month
								if (month == 2 && isLeapYear(year) == true)
								{
									if (date < 1 || date > 28)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a date input problem.");
										break;
									}
								}
								
								else if (month == 2 && isLeapYear(year) == false)
								{
									if (date < 1 || date > 29)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a date input problem.");
										break;
									}			
								}
								
								else if (month == 1 ||  month == 3 || month == 5 || month == 7 || month == 9 || month == 11)
								{
									if (date <= 0 || date > 31)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a date input problem.");
										break;
									}
								}
								
								else
								{
									if (date <= 0 || date > 30)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a month input problem.");
										break;
									}
								}
									
								
	
					    		//Get Zodiac's number and traits
								int zodiacNumber = getZodiacNumber(year);
					    		Zodiac = getZodiac(zodiacNumber, zodiacList);
					    		Traits = getTraits(zodiacNumber, traitsList);
						        			
						        //Display the informations
							    boolean compatible = isCompatible(compatibleGroup, getZodiac(zodiacNumber, zodiacList));
							    
							    //Check compatiblity to display
								if(compatible == true)
								{
									//Get long date format
						    		longDate = getLongDateFormat(year, month, date);
						    		
						    		//Get age
						    		age = getAge(year);
						    		
						    		//Get Zodiac's number and traits
						    		Zodiac = getZodiac(zodiacNumber, zodiacList);
						    		Traits = getTraits(zodiacNumber,traitsList);
						    		
									//Display the informations
						    		System.out.println("		-----------------------------------------------------------------------------------------------------");
						    		System.out.println("		Person #" + (peopleCount + 1));
						    		System.out.println("		-----------------------------------------------------------------------------------------------------");
						    		displayUserData(name, longDate, age, Zodiac, Traits);
						    		
						    		//Add to a list of people who are compatible starting with you
						        	nameList.add(name);
						    		birthdayList.add(longDate);
						    		AgeList.add(age);
						    		peopleZodiacs.add(Zodiac);
						    		CharacteristicList.add(Traits);
								}
							}
							//Finished then break to work on next line
							break;
						
					} while(true);
					
					line = text.nextLine();	

					}
					
					text.close();
				}
		        
				else if (choice == 4)
				{
					String input = Input.getString("		Enter a file name (people.txt): ");
					
					//Open file
					File readFile = new File(input.toLowerCase());
					
					//Check file's existence 
					while (!readFile.exists()) //Page 245
					 {
						 System.out.println("		The file " + readFile + " is not found.");		 
						 input = Input.getString("		Enter the correct file name: ");
						 
						 readFile = new File(input.toLowerCase());	 //Check file
					 }
					
					Scanner text = new Scanner(readFile);
					
					//Read first line
					String line = text.nextLine();
					
					//Read all lines
					
					while (text.hasNext())
					{				
						String[] info = line.split(",");
						String name = info[0].trim();
						
						do
						{
							info = line.split(",");
							name = info[0].trim();
							
							//Name verification
							if (name.length()== 0 || name == null)
							{
								System.out.println("		Person #" + (peopleCount + 1)+ " have a name input problem.");
								break;
							}
							
							String[] birthday = info[1].split("-");
							
							//Validate date input
							if (birthday.length == 3)
							{
								peopleCount++;
								
								int month = Integer.parseInt(birthday[0]);
									if (month < 1 || month > 12)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a month input problem.");
										break;		
									}
								
								int year = Integer.parseInt(birthday[2]);
									if (year < 1922 || year > 2022)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a year input problem.");
										break;
									}
								
									int date = Integer.parseInt(birthday[1]);
									
								//Input validate for month
								if (month == 2 && isLeapYear(year) == true)
								{
									if (date < 1 || date > 28)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a date input problem.");
										break;
									}
								}
								
								else if (month == 2 && isLeapYear(year) == false)
								{
									if (date < 1 || date > 29)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a date input problem.");
										break;
									}			
								}
								
								else if (month == 1 ||  month == 3 || month == 5 || month == 7 || month == 9 || month == 11)
								{
									if (date < 1 || date > 31)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a date input problem.");
										break;
									}
								}
								
								else
								{
									if (date < 1 || date > 30)
									{
										System.out.println("		Person #" + (peopleCount + 1)+ " have a month input problem.");
										break;
									}
								}
								
	
					    		//Get Zodiac's number and traits
								int zodiacNumber = getZodiacNumber(year);
					    		Zodiac = getZodiac(zodiacNumber, zodiacList);
					    		Traits = getTraits(zodiacNumber, traitsList);
						        			
						        //Display the informations
							    boolean compatible = isCompatible(compatibleGroup, getZodiac(zodiacNumber, zodiacList));
							    
							    //Check compatiblity to display
								if(compatible == true)
								{
									//Get long date format
						    		longDate = getLongDateFormat(year, month, date);
						    		
						    		//Get age
						    		age = getAge(year);
									
						    		//Add to a list of people who are compatible starting with you
						        	nameList.add(name);
						    		birthdayList.add(longDate);
						    		AgeList.add(age);
						    		peopleZodiacs.add(Zodiac);
						    		CharacteristicList.add(Traits);
								}
							}
							//Finished then break for the next line 
							break;
							
						} while(true);
						
						line = text.nextLine();				
					}
					
					text.close();
				
					//Get output file name
					input = Input.getString("		Enter a file name to write your list (results.txt): ");
					
					//Open file
		        	File writeFile = new File(input.toLowerCase());
		        	
		        	//Validate
		        	while(writeFile.exists())
		        	{
		        		char answer = Input.getChar("		File " + writeFile + " existed. Overwrite (Y or N)? ", "YN");
		        		if(answer == 'Y')
		        		{
		        			break;
		        		}
		      
		        		else
		        		{
		        			input = Input.getString("		Enter a file name to write your list: ");
		        			writeFile = new File(input.toLowerCase());
		        		}
		        	}
		        	
		        	PrintWriter write = new PrintWriter(writeFile);
		
		        	//Write line by line
		        	for (int i = 0; i < nameList.size(); i++)
		        	{
		        		if(i == 0)
		        		{
		        			write.println("		Your Information:");
		        			write.println("		-----------------------------------------------------------------------------------------------------");
		        		}
		        		
		        		write.println("		Name            : " + nameList.get(i));
		        		write.println("		Birth date      : " + birthdayList.get(i));
		        		write.println("		Age             : " + AgeList.get(i));
		        		write.println("		Zodiac sign     : " + peopleZodiacs.get(i));
		        		write.println("		Characteristics : " + CharacteristicList.get(i));
		        		write.println();
		        		
		        		if(i == 0)
		        		{
		        			write.println("		You are highly compatible with:");
		        			write.println("		-----------------------------------------------------------------------------------------------------");
		        		}
		        	}
		        	//Save written text
		        	System.out.println("\n		Highly compatible people's data have been written into file.");
		        	write.close();	
				}
		        
		        else if(choice == 0)
		        {
		            System.out.println("		Program terminated.");
		        	System.exit(0);
		        }
		        else
		            System.out.println("\n		ERROR - Invalid option.\nPlease try again!");
		        
		} while(true);
	}
	


	/**
	 * getDisplayBanner void method display the banner
	 * @param Decorator-String type
	 */
	public static void getDisplayBanner(String Decorator)
	{	
		//Banner
		System.out.println();
		System.out.println("	CMPR112  Exam#2: Chapter 4, 5, 7 and 9 - Eastern (Chinese) Astrology by Hung Anh Ho (10-18-2022)");
		System.out.println(Decorator);
		System.out.println("\r\n"
				+ "                                                   _  _ \\WW/  ??       ..oo8\"\"\"Y8b.._   	\r\n"
				+ "         JJJJJ                                    / \\/ \\//@@__oo     .88888888o.    \"Yb. 	\r\n"
				+ "           J                                     / ^ \\ / (_,,,,Y    .d888P\"\"Y8888b    \"b.	\n"
				+ "           J                                    / ^ ^ \\ |_}        o88888    88888)     \"b	\n"
				+ "           J                                   /^ ^  /  /_}_____  d888888b..d8888P       'b 	\r\n"
				+ "           J     aa    v   v    aa            /^ ^  /  / _}____,) 88888888888888\"         8 	\r\n"
				+ "           J    a  a   v   v   a  a          /^/^/^||  |}__}     (88DWB8888888P           8) 	\r\n"
				+ "           J    a  a   v   v   a  a       /\\      / (,,)}___}     8888888888P             8 	\r\n"
				+ "         J J    a  a    v v    a  a      <  >    (     }____}      Y88888888P   ee      .P  	\r\n"
				+ "          J      aa a    v      aa a      ||    (     \\}___}\\       Y888888(   8888    oP  	\r\n"
				+ "                                          | \\__( (    )__}   )__    \"Y88888b    \"\"   oP\"	\r\n"
				+ "                                          \\_____(______;;;) __;;;)    \"Y8888o._   _.oP\"	\r\n"
				+ "\n"
				+ "        			       (( \\		 __..--''``---....___   _..._    __	\r\n"
				+ "					\\\\'-	/// //_.-'    .-/\\\";  `        ``<._  ``.''_ `./ // /\r\n"
				+ "				 .'` `'   o )	///_.-' _..--.'_    \\\\                    `( ) ) // //\r\n"
				+ "				/    \\   '.__.'	/ (_..-' // (< _     ;_..__               ; `' / ///\r\n"
				+ " 			 ______(_\\_\\-'\\_\\_\\	 / // // //  `-._,_)' // / ``--...____..-' /// / //");
		System.out.println();
		System.out.println("	Programming is fun, challenging, and at the same time definitely it helps in training your mind!");
		System.out.println(Decorator);
		System.out.println();
		System.out.println("	The Chinese zodiac is a classification scheme based on the lunar calendar that assigns an animal: Rat, Ox,\r\n"
						+ "        Tiger, Rabbit, Dragon, Snake, Goat, Monkey, Dog, and Pig, and its reputed attributes to each year in a\r\n"
						+ "        repeating 12 - year cycle. The importance of the zodiac to the Chinese culture is that the animal signs have\r\n"
						+ "        been used in stories and folklore. These developed the different personality traits that were represented with\r\n"
						+ "        each animal.");
		System.out.println();
		System.out.println("	Let's begin input...");
	}


	/**
	 * displayMenu method provide a menu for user to choose and return the input-integer type
	 * @return userChoice-integer type
	*/
	public static int displayMenu(String Decorator2)
	{
		System.out.println("\n		User's options: \n"
				+ Decorator2 + "\n"
				+ "		1. Enter your information to check for zodiac sign\n"
				+ "		2. Check compatible with another person\n "
				+ "		3. Check compatible with others from a list\n"
				+ "		4. Write information with compatible people to a file\n"
				+ "		0. Quit the program.\n");
		
		int userChoice = Input.getInteger("		Enter your option: ", 0, 4);
		return userChoice;
	}

	
	/**
	 * displayUserData void method this play the user's inputs, long date format, zodiac and their traits
	 * @param name-String type
	 * @param year-Integer type
	 * @param month-Integer type
	 * @param date-Integer type
	 * @param zodiacNumber-Integer type
	 * @throws IOException
	 */
	public static void displayUserData(String name, String longDate, int age, String Zodiac, String Traits)
	{
		System.out.println("		Name            : " + name);
		System.out.println("		Birth date      : " + longDate);
		System.out.println("		Age             : " + age);
		System.out.println("		Zodiac sign     : " + Zodiac);
		System.out.println("		Characteristics : " + Traits);
		System.out.println();
	}


	/**
	 * getName method get user's input for name-string type
	 * @return name-string type
	 */
	public static String getName()
	{
		String name = Input.getString("		Enter your name: ");
		return name;
	}


	/**
	
	 * getYear method get user's input for year in range of 1922 to 2022-integer type
	 * @return year-integer type
	 */
	public static int getYear()
	{
		int year = Input.getInteger("		Enter your birth year(1922...2022): ", 1922, 2022);
		return year;
	}


	/**
	 * isLeapYear method validate the year for leap year-boolean type
	 * @param year-variable hold the year-integer type
	 * @return true/false-boolean type
	 */
	public static boolean isLeapYear(int year)
	{
		// Check for leap year
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}


	/**
	 * getMonth method get the user's input for birth month range 1 to 12 - integer type
	 * @return month-integer type
	 */
	public static Integer getMonth()
	{		
			int month = Input.getInteger("		Enter your birth month: ", 1, 12);
			return month;
	}


	
	/* getDate method validate the month date range and get user's input for birth date-integer type
	 * @param leap-boolean type
	 * @param month-integer type
	 * @return date-integer type
	 */
	public static int getDate(boolean leap, int month)
	{
		int date = 0;
		if ((leap == true) && (month == 2)) //For leap year and if it is February
		{
	
			date = Input.getInteger("		Enter his/her valid birth date(1..28): ", 1, 28);
			return date;
	
		}
		
		else // For other months
		{			
			if (month == 1 ||  month == 3 || month == 5 || month == 7 || month == 9 || month == 11)
			{
				date = Input.getInteger("		Enter his/her valid birth date(1...31): ", 1, 31);
			}
				
			else if(month == 2)// For regular February
			{
				date = Input.getInteger("		Enter his/her valid birth date(1...29): ", 1, 29);
			}
				
			else // Error display when exceeding limits for months with 30 days
			{
				date = Input.getInteger("		Enter his/her valid birth date(1...30): ", 1,30);
			}
			
			return date;
		}
	}

	
	/**
	 * getLongDateFormat method return long date format-String type
	 * @param year-Integer type
	 * @param month-Integer type
	 * @param date-Integer type
	 * @return long date format
	 */
	public static String getLongDateFormat (int year, int month, int date)
	{
		String temp = "th";
		switch(date)
		{
		case 1, 21, 31: 
			temp = "st"; 
			break;
		
		case 2, 22 : 
			temp = "nd"; 
			break;
		
		case 3, 23:
			temp = "rd"; 
			break;
		}
		
		return String.format("%s, %s %d%s, %d", dayOfWeek[ZellerIndex(year, month, date)], monthName[month], date, temp, year );
	}


	/**
	 * ZellerIndex method calculate using the Zeller's formula number to find the according number-integer type
	
	 * @param month-integer type
	 * @param date-integer type
	 * @param year-integer type
	 * @return ZellerIndex-integer type
	*/	
	public static int ZellerIndex(int year, int month, int date)
	{
		
		if (month < 3)
		{
			if (month == 1)
				month = 13;
			
			if (month == 2) 
				month =14;
		}
		
		if (month == 13 || month == 14)
			year--;
		
		int year_2_End_Digits = year % 100;
		int year_2_Start_Digits = year /100;
		
		return (date + 13 * (month + 1)/5 + year_2_End_Digits + (year_2_End_Digits / 4) + (year_2_Start_Digits / 4) + (5 * year_2_Start_Digits)) % 7;
	}


	/**
	 * getAge method return the age of a person
	 * @param year- Integer type
	 * @return age-Integer type
	 */
	public static int getAge(int year)
	{
		return 2022-year;
	}


	/*getZodiac method calculate the remaining number by dividing 
	 * @param year
	 * @return
	 */
	public static int getZodiacNumber(int year)
	{	
		return year % 12;
	}
	
	
	/**
	 * getZodiac method open, read the Eastern Zodiac text file for the zodiacs, save to an ArrayList name zodiacsList and use zodiac number to return the zodiac-String type 
	 * @param zodiacNumber-Integer type
	 * @return zodiac-String type
	 * @throws IOException-when open file
	 */
	public static ArrayList<String> getZodiacList(ArrayList<String> zodiacList) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Open first file
		File File = new File("EasternZodiac.txt");
		
		//Check for first file existence
		while (!File.exists()) //Page 245
		 {
			 System.out.println("The file EasternZodiac.txt is not found.");		 
			 String FileName = Input.getString("Enter the correct file name: ");
			 
			 File = new File(FileName);	 //Check file
		 }
		
		Scanner text = new Scanner(File);
		
		//Read file								
		while (text.hasNext())
		{	
			//Read line from file one at a time
			String line = text.nextLine();
			String list[] = line.split("-", 2);		
			zodiacList.add(list[0].trim());
		}
		
		text.close();
		
		return zodiacList;
	}
	
	
	/**
	 * getZodiac method take the zodiac number and return the zodiac-String type
	 * @param zodiacNumber-integer type
	 * @param zodiacList-Array list String type
	 * @return
	 */
	public static String getZodiac(int zodiacNumber, ArrayList<String> zodiacList)
	{
		return zodiacList.get(zodiacNumber);
	}
	
	
	/**
	 * getZodiac method open, read the Eastern Zodiac text file for the zodiacs traits, save to an array, return the array-Array list String type 
	 * @param zodiacNumber-Integer type
	 * @return traits-String type
	 * @throws IOException-when open file
	 */
	public static ArrayList<String> getTraitsList(ArrayList<String> traitsList) throws IOException
	{
		{			
			//Open first file
			File File = new File("EasternZodiac.txt");
			
			//Check for first file existence
			while (!File.exists()) //Page 245
			{
				System.out.println("	The file EasternZodiac.txt is not found.");		 
				String FileName = Input.getString("	Enter the correct file name: ");
				 
				File = new File(FileName);	 //Check file
			}
			
			Scanner text = new Scanner(File);
			
			//Read file						
			while (text.hasNext())
			{	
				//Read line from file one at a time
				String line = text.nextLine();
				String list[] = line.split("-", 2);		
				traitsList.add(list[1].trim());
			}			
			text.close();
		}
		
		return traitsList;
	}
	
	
	/**
	 * getTraits method use zodiac number to return the traits-String type
	 * @param zodiacNumber-integer type
	 * @param traitsList-String type Array list
	 * @return traits-String type
	 */
	public static String getTraits(int zodiacNumber, ArrayList<String> traitsList)
	{
		//Get traits base on the Zodiac number
		String traits = null;
		traits = traitsList.get(zodiacNumber);
		
		return traits;
	}
	
	
	/**
	 * getCompatibleGroup method get the Zodiac String input, read the text file, 
	 * check if it in a line contain the Zodiac group and return the group
	 * @param Zodiac-String type
	 * @return Zodiac Group- String type
	 * @throws FileNotFoundException
	 */
	public static String getCompatibleGroup(String Zodiac) throws IOException
	{
		File File = new File("CompatibleSigns.txt");
		
		//Check for file's existence
		while (!File.exists()) //Page 245
		{
			System.out.println("	The file CompatibleSigns.txt is not found.");		 
			String FileName = Input.getString("	Enter the correct file name: ");
			 
			File = new File(FileName);	 //Check file
		}
		
		Scanner text = new Scanner(File);
		
		
		//Read first line
		String line = text.nextLine();
		
		//Check line by line if line contains the Zodiac, return the group-String type
		while (text.hasNext())
		{	
			//Read line from file one at a time	if true return
			if(line.contains(Zodiac))
			{
				return  line;
			}
			
			line = text.nextLine();
		}
		text.close();
		
		return line;
	}
	
	
	/**
	 * isCompatible method return if the Zodiac is included in the group-boolean type
	 * @param Group
	 * @param Zodiac
	 * @return
	 */
	public static boolean isCompatible(String Group, String Zodiac)
	{
		if(Group.contains(Zodiac))		
			return true;
		
		else
			return false;
	}
}
