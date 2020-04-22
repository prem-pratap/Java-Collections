/*Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

 
Provide implementation for all the methods and test your program.*/

public class Employee {
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	
	Employee(int empid,String name,String email,String gender,float salary){
		
		this.empId=empid;
		this.empName=name;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}
	void getEmployeeDetails() {
		System.out.println("Employee: EmpID:"+empId+"  Name:"+empName+" Email:"+email+"  Gender:"+gender+"  Salary:"+salary);
	}
	
	//setters
	void setEmpId(int id) {
		this.empId=id;
	}
	void setempName(String name) {
		this.empName=name;
	}
	void setEmail(String email) {
		this.email=email;
	}
	void setGender(String gender) {
		this.gender=gender;
	}
	void setSalary(float salary) {
		this.salary=salary;
	}
	//getters
	public int getEmpId() {
		return empId;
	}
	String getName() {
		return empName;
	}
	String getEmail() {
		return email;
	} 
	String getGender() {
		return gender;
	}
	float  getSalary() {
		return salary;
	}
	
	public String toString(){
		return "Employee: EmpID:"+getEmpId()+"  Name:"+getName()+" Email:"+getEmail()+"  Gender:"+getGender()+"  Salary:"+getSalary(); 
	}
}
