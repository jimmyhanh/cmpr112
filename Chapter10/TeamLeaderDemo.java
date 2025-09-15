//Hung Anh Ho
//11-15-2022
//TeamLeader demo

public class TeamLeaderDemo 
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
		System.out.println("Worker 2 has been promoted!!!");
		
		//Leader
		TeamLeader leader = new TeamLeader(prodWorker2, 
											Input.getDouble("Enter your monthly bonus: ", true), 
											Input.getInteger("Enter required training hours: ", true), 
											Input.getInteger("Enter trained hours: ", true));
		System.out.println(leader);
	}
}
