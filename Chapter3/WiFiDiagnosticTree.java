//Hung Anh Ho
//9-16-2022
//WiFi diagnostic tree
import java.util.Scanner;
public class WiFiDiagnosticTree 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		String AnswerYes = "yes";
		String AnswerNo = "no";
	    
		//Service input 1
		System.out.println("Reboot the computer and try to connect.");		
	    System.out.print("Did that fix the problem? (yes or no) ");
	    input = keyboard.nextLine();
	    
	    //Attempt 1
	    if (input.equals(AnswerNo))
	    {
	       System.out.println("Reboot the router and try to connect.");	    
	       System.out.print("Did that fix the problem? (yes or no) ");
	       input = keyboard.nextLine();
	       
	       //Attempt 2
	       if (input.equals(AnswerNo))
	       {
	        System.out.println("Make sure the cables between the routers and modem are plugged in firmly.");	         
	        System.out.print("Did that fix the problem? (yes or no) ");
	        input = keyboard.nextLine();
	        
	          //Attempt 3
	        if (input.equals(AnswerNo))
	        {
	        	System.out.println("Move router to a new location.");         
	            System.out.print("Did that fix the problem? (yes or no) ");
	            input = keyboard.nextLine();
	             
	            //Give up get a new one
	            if (input.equals(AnswerNo))
	            {
	            System.out.println("Get a new router.");
	            return;
	            }	                              
	         }
	       }
	       else if (input.equals(AnswerYes))
	    	   return;
	    }
	}
}
