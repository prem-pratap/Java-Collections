/*Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId*/


import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	ArrayList<Employee> list=new ArrayList<Employee>();
	//method to add employee
	public boolean addEmployee(Employee e) {
		return list.add(e);
	}
	//method to delete employee
	public boolean deleteEmployee(int empID) {
		Iterator<Employee> iter=list.iterator();
		boolean removed=false;
		while(iter.hasNext()) {
			Employee em=iter.next();
			if(em.getEmpId()==empID) {
				iter.remove();
				removed=true;
				
			}
		}
		return removed;
	}
	//method to show payslip
	String showPaySlip(int empId) {
		String payslip="Employee with given empid is not available in database";
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			Employee em=iter.next();
			if(em.getEmpId()==empId) 
				payslip="Payslip of Employee with EmpID "+em.getEmpId()+" is "+em.getSalary();
		}
		return payslip;
		
	}
	
	
	//method to show all employee details
	public Employee[] getAll() {
		Employee[] empArray = new Employee[list.size()];
		for (int i = 0; i < list.size(); i++) 
			empArray[i] = list.get(i);
			
		return empArray;
	}
	
}

