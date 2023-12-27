package com.predicate;

import java.util.function.Predicate;

/*
 * Functional Interfaces - 1.8version
 *   1)Predicate
 *   2)Function
 *   3)Consumer
 *   4)Supplier
 *  These is in Package "java.util.function" all predefined Interfaces are available.
 *  
 *  1)Predicate Interface :
 *  	Perform some conditional check and return boolean value based on condition.
 *  	It's used to particular condition.
 *  	Boolean valued function
 *  	It's introduced 1.8 Version.
 *  	present in java.uti.function package.
 *  	It contains one abstract method : test() 
 *  		Prototype : 
 *  					interface Predicate<T>{
 *  						boolean test(T t);
 *  					}
 *  	public boolean test(Integer I){								Lambda Expression for this
 *  			if(I>10){ return true;}		==========>>  	(Integer I)->{ if(I>10) return true;
 *  			else {return false;}									   else return false;};
 *  	}														I  -> I > 10;
 *  	
 *  	Predicate<Integer> p = I->10;
 *  	System.out.println(p.test(100)); //true
 *  
 *  	**We can do this by three Ways : By implementing Predicate Interface
 *  									 By Anonymous Inner class
 *  									 By Lambda Expression
 *  Description : In this program we are using predicate for checking whether the value is greater than 10 or not.
 */
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = I -> I>10;
		System.out.println(p.test(10));//false
		//System.out.println(p.test("Sachin"));//Error: Unresolved compilation problem: The method test(Integer) in the type Predicate<Integer> is not applicable for the arguments (String)
	}

}
