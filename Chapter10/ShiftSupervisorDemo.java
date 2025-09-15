//Hung Anh Ho
//11-20-2022
//ShiftSupervisor demo

public class ShiftSupervisorDemo 
{
	public static void main(String[] args)
    {
		//Worker 1
		Employee w1 =  new Employee("Hung Anh Ho", "2020", "Dec-22-2022");
        ProductionWorker worker1 = new ProductionWorker(w1, 2, 17);
        System.out.println(worker1);
        System.out.println();
        
        //Supervisor
        Employee w2 = new Employee(Input.getString("For supervisor:\nEnter your name: "), 
				Input.getString("Enter your id number: "),
				Input.getString("Enter your work's starting date: "));
        
        ShiftSupervisor worker2 = new ShiftSupervisor(w2, 
        		Input.getInteger("Enter your annual salary: ") , 
        		Input.getDouble("Enter your production bonus: "));
        
        System.out.println(worker2);
    }
}
