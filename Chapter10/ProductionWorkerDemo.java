//Hung Anh Ho
//11-14-2022
//ProductionWorker demo

public class ProductionWorkerDemo 
{
	public static void main(String[] args) 
	{		
		Employee employee1 = new Employee();
		
		employee1.setName("Nicholas Quach");
		employee1.setNumber("000-7");
		employee1.setHireDate("Nov-22-2021");
		
		ProductionWorker prodWorker1 = new ProductionWorker(employee1, 2, 45.90);
		
		System.out.println(prodWorker1);
		
		//Worker 2
		Employee empolyee2 = new Employee(Input.getString("\nWorker #2:\nEnter your name: "), 
					Input.getString("Enter your id number: "),
					Input.getString("Enter your work's starting date: "));
		
		ProductionWorker prodWorker2 = new ProductionWorker(employee1, 
						Input.getInteger("Enter your shift number (1-day, 2-night): ", 1, 2), 
						Input.getDouble("Enter your hourly pay): ", true));
		System.out.println(prodWorker2);
	}

}
