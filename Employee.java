package in.Ashokit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee id :"+id);
		System.out.println("Employee name :"+name);
		System.out.println("Employee salary:"+salary);
	}

	public static void main(String[] args) {
		 Employee emp1=new  Employee(100,"shiva",15000);
		 Employee emp2=new  Employee(101,"shivanjali",25000);
		 Employee emp3=new  Employee(102,"shivani",35000);
		 
		 
		 List<Employee> employees=new ArrayList<>();
		 employees.add(emp1);
		 employees.add(emp2);
		 employees.add(emp3);
		 
		 
		 System.out.println("the Employee Details");
		 
		 for(Employee emp:employees) {
			 emp.displayDetails();
		 }
	}
		
	}


