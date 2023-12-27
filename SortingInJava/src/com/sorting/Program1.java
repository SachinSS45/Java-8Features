package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/*
 * 
 * for sorting we are using Collection API
 */
//class Students implements Comparable<Students>{
//	
//	int id;
//	String name;
//	String age;
//	public Students(int id, String name, String age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Students [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
///*	@Override
//	public int compareTo(Students o2) {
//		// TODO Auto-generated method stub
//		return this.id - o2.id;
//		
//		// this>02 == >0
//		// this==02 == )
//		// this < 02 == <0)
//	} */ // sort by id
//	@Override
//	public int compareTo(Students o2) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o2.name);//logic 
//	}
//	
//}

class Students {
	
	int id;
	String name;
	String age;
	public Students(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	
}

class IdComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
	
}
class NameComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		//Array of Integers
		int[] arr = {11, 5, 6, 120, 8, 9};
		
		int[] arr1 = new int[6];
		arr1[0] = 90;
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));//[11, 5, 6, 120, 8, 9]

		
//		Arrays.sort(arr);
//		for(int i: arr) {
//			System.out.print(i + " ");// 5 6 8 9 11 120
//		}
		
//		List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		List<Integer> list = new ArrayList<>();
		// int->object ====> auto boxing
		// object ->primitive ==> auto boxing
		list.add(11);
		list.add(5);
		list.add(6);
		list.add(120);
		list.add(8);
		list.add(9);
		Collections.sort(list);
		System.out.println(list);//[5, 6, 8, 9, 11, 120]
		
		List<Students> students = new ArrayList<>();
		/*Students student = new Students(12,"Sachin","22");
		students.add(student); OR */
		students.add(new Students(12,"Sachin","22"));
		students.add(new Students(11,"Rushi","11"));
		students.add(new Students(56,"Subrmanyam","19"));
		students.add(new Students(9,"Omkar","5"));
		System.out.println(students.toString());
		//Java doesn't know about to sort students objects this objects on which basis no logic are implemented becz its custom objects.
		//are not comparable
		//we have to tell comparsion logic
		
		//1way : Using Comparable Interface java.lang
				// - Disadvantage : Implementation is in current class where we implements means
				//the class we are adding in collections in that we are adding implementation also in Student class
				//logic of comparison included in same class
				//It is supporting single sorting logic
		//2way : Using Comparator Interface java.util
				//we create new class for logic
		
		/*Collections.sort(students);//sorting by id
		System.out.println(students);*/
//		Collections.sort(students);//sorting by name
//		System.out.println(students)
		
		Collections.sort(students,new NameComparator());
		System.out.println(students);//[Students [id=9, name=Omkar, age=5], Students [id=11, name=Rushi, age=11], Students [id=12, name=Sachin, age=22], Students [id=56, name=Subrmanyam, age=19]]
		
		Collections.sort(students,new IdComparator());
		System.out.println(students);
		//TreeSet is already using sorting
		//TreeSet has inbuilt property sorting it has expectation of objects which can be comparable
		//TreeSet we added Student we did not made it comparator so we have to pass that we to give logic
		Set<Students> set = new TreeSet<>(new IdComparator());
		set.add(new Students(12,"Sachin","22"));
		set.add(new Students(11,"Rushi","11"));
		set.add(new Students(56,"Subrmanyam","19"));
		set.add(new Students(9,"Omkar","5"));
		
		System.out.println(set);
	}

}
