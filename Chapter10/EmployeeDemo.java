//Hung Anh Ho
//11-20-2022
//Employee demo

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee employee1 = new Employee();
		
		employee1.setName("Nicholas Quach");
		employee1.setNumber("000-7");
		employee1.setHireDate("Nov-22-2021");
		
		System.out.println(employee1);
		
		Employee employee2 = new Employee(Input.getString("Enter your name: "), 
											Input.getString("Enter your id number: "),
											Input.getString("Enter your work's starting date: "));
		System.out.println();
		System.out.println(employee2);
	}
}
