package com.predicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

/*
 * Description : In this we are making application 
 * 				1)firstly we made on Employee class in that we taken empName,designation,salary,city and created contructor
 * 					and override toString() method.
 * 				2)We created ArrayList and added the employees info in that.
 * 				3)we created populate() method for adding list of employees
 * 				
 */
class Employee{
	
	String empName;
	String desigination;
	double salary;
	String city;
	//Constructor
	public Employee(String empName, String desigination, double salary, String city) {
		super();
		this.empName = empName;
		this.desigination = desigination;
		this.salary = salary;
		this.city = city;
	}
	//Overriding toString() method for printing the object
	public String toString() {
		//we can format by using format method() 
		String s = String.format("(%s,%s,%.2f,%s)",empName,desigination,salary,city);
		return s;	
	}
	
}
public class EmployeeManagementApplication {
		public static void main(String[] args) {
			//Creating ArrayList for adding Employees 
		/*	ArrayList<Employee> list = new ArrayList<Employee>();
			list.add(new Employee("Sachin", "Developer", 100000, "Pune"));
			list.add(new Employee("Sailesh", "Functional Test Engineer", 53000, "Pune"));
			populate(list);
			
			System.out.println(list);	
			
			Predicate<Employee> p1 = emp->emp.desigination.equals("Manager");
			System.out.println("Manager's Info : ");
			display(p1,list);
			
			Predicate<Employee> p2 = emp->emp.city.equals("Pune");
			System.out.println("Empolyeers Belongs from Pune : ");
			display(p2, list);
			
			Predicate<Employee> p3 = emp->emp.salary < 20000;
			System.out.println("All Empolyees Information whose salary < 20000 : ");
			display(p3, list);
			
			Predicate<Employee> p4 = emp->emp.city.equals("Bangalore");
			//Predicate Chaining - Employee should be from Bangalore and designation Manager 
			System.out.println("All Managers from Bangalore to give Pink Slip");
			display(p1.and(p4), list);
			
			//To select all Employees who are manager or Salary<20000
			System.out.println("All Employees who are manager or Salary<20000 : ");
			display(p1.or(p3), list);
			
			//To select all Employees who are not managers 
			System.out.println("all Employees who are not managers : ");
			display(p1.negate(), list);
			
			Predicate<Employee> isDeveloper=Predicate.isEqual(new Employee("Sachin", "Developer", 100000, "Pune"));
			System.out.println(isDeveloper.test(new Employee("Sachin", "Developer", 100000, "Pune")));*/
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Enter a number : ");
				int num = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private static void display(Predicate<Employee> p1, ArrayList<Employee> list) {
			
			for(Employee e:list) {
				if(p1.test(e)) {
					System.out.println(e);
				}
			}
			System.out.println("*******************************************************************************");
		}

		private static void populate(ArrayList<Employee> list) {
			
			list.add(new Employee("Omkar","CEO",30000,"Hyderabad"));
			list.add(new Employee("Sunny","Manager",20000,"Hyderabad"));
			list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
			list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
			list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
			list.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
			list.add(new Employee("Kanushka","Developer",10000,"Hyderabad"));
			list.add(new Employee("Sowmya","Developer",10000,"Bangalore")); 
		}
}
