package com.sortingLambda;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int empNo;
	String empName;
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	public String toString() {
		return empNo + ":" + empName;
	}
}
public class OwnClassSortingLambda {
	
	public static void main(String[] args) {
		Employee emp = new Employee(100,"Sachin");
		System.out.println(emp);//100:Sachin
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(300,"Ramesh"));
		list.add(new Employee(200,"Suresh"));
		list.add(new Employee(500,"Durgesh"));
		list.add(new Employee(400,"Dharmesh"));
		System.out.println("Before Sorting : "+ list);//Before Sorting :[200:Ramesh, 300:Suresh, 400:Durgesh, 500:Dharmesh]
		Collections.sort(list,(emp1,emp2)->(emp1.empNo>emp1.empNo)?+1:(emp1.empNo<emp1.empNo)?-1:0);
		System.out.println("After Sorting : "+list);
	}
}
