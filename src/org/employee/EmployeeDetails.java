package org.employee;

public class EmployeeDetails {
	
	private void empName() {
		// implementation part or business logic
		// "" -> String (predefined class)
		System.out.println("Employee name : Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empMobile();
		
	}
	
	
	
	

}
