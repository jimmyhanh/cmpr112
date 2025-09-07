//Hung Anh Ho
//10-11-2022
//Kinetic energy

import java.util.Scanner;
public class KineticEnergy 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			double mass = getMass();
			double velocity = getVelocity();
			double kineticEnergy = getKineticEnergy(mass, velocity);
			System.out.printf("The kinetic energy of an object has a mass of %.2f kilograms and moving at %.2f meters per second is %.2f", mass, velocity, kineticEnergy);
			
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
	 * getMass method get input from the user for object's mass-double type
	 * @return mass validated input-double type
	 */
	public static double getMass()
	{
		double mass = Input.getDouble("Enter the object's mass(in kilograms): ", true);
		return mass;
	}
	
	/**
	 * getVelocity method get input from user for object's velocity-double type
	 * @return velocity validated input-double type
	 */
	public static double getVelocity()
	{
		double velocity = Input.getDouble("Enter the object's velocity(in meters per second): ", true);
		return velocity;
	}
	
	/**
	 * getKineticEnergy method calculate kinetic energy using the inputed mass and volocity-double type
	 * @param mass-Object's mass-double type
	 * @param velocity-Oject's velocity- double type
	 * @return kineticEnergy-double type
	 */
	public static double getKineticEnergy(double mass, double velocity)
	{
		double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
		return kineticEnergy;
	}
}
