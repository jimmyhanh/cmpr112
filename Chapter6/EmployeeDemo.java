//Hung Anh Ho
//11-7-2022
//Employee demo

public class EmployeeDemo 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(); // testing the no-argument constructor
		
		//Display employees
		e1.setName("Nicholas Quach");
		System.out.printf("\nName: %s\n", e1.getName());
		
		e1.setIDNumber(666);
		System.out.printf("ID Number: %d\n", e1.getIDNumber());
		
		e1.setDepartment("ITS");
		System.out.printf("Department: %s\n", e1.getDepartment());
		
		e1.setPosition("Director");
		System.out.printf("Position: %s\n", e1.getPosition());
		
		
		Employee e2 = new Employee("Sylivia LeTurneau", 777, "ITS", "Vice-Cancellor");
		System.out.printf("\nName: %s\n", e2.getName());
		System.out.printf("ID Number: %d\n", e2.getIDNumber());
		System.out.printf("Department: %s\n", e2.getDepartment());
		System.out.printf("Position: %s\n", e2.getPosition());
		
		Employee e3 = new Employee("Curt Childress", 222);
		System.out.printf("\nName: %s \nID Nubmer: %d \nDepartment: %s \nPosition: %s\n", e3.getName(), e3.getIDNumber(), e3.getDepartment(), e3.getPosition());

		//Input new imployee
		Employee e4 = new Employee(Input.getString("\nEnter the name of the employee: "),Input.getInteger("\nEnter the ID number of the employee: ", true));
		//System.out.printf("\nName: %s \nID Nubmer: %d \nDepartment: %s \nPosition: %s\n", e4.getName(), e4.getIDNumber(), e4.getDepartment(), e4.getPosition());

		System.out.println(e4);
	}

}
