

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeDB empdb=new EmployeeDB();
		Employee emp1=new Employee(101, "Sudhir", "sudhir101@abc.com", "Male", 28000);
		Employee emp2=new Employee(102, "Ishita", "isha102@abc.com", "Female" ,30000);
		Employee emp3=new Employee(103, "Ayushmann", "ayush103@abc.com", "Male" ,39000);
		Employee emp4=new Employee(104, "Siddharth", "siddharth104@abc.com", "Male" ,32000);
		
		empdb.addEmployee(emp1);
		empdb.addEmployee(emp2);
		empdb.addEmployee(emp3);
		empdb.addEmployee(emp4);
		//displaying all employee details before deleting 
		for(Employee e:empdb.getAll())
			e.getEmployeeDetails();
		
		System.out.println("\n"+empdb.showPaySlip(103));
		//deleting employee with empid 104
		empdb.deleteEmployee(104);
		System.out.println();
		//displaying remaining employee data
		for(Employee e:empdb.getAll())
			e.getEmployeeDetails();
		
		
		
	}

}
