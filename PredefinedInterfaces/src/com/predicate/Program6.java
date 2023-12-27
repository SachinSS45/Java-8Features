package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/*
 * Description : Write a Predicate which can user object and check username and password are correct or not.
 * 				for authentication purpose.
 */
class User{
	String userName;
	String password;
	//constructor
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
}
public class Program6 {

	public static void main(String[] args) {
		
		//Creating Predicate
		Predicate<User> p = user->user.userName.equals("Sachin") && user.password.equals("Pass@123");
		//Using Scanner for taking input from keyboard
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		sc.close();
		//Creating Object of User and passing username and password.
		User obj= new User(username, password);
		if(p.test(obj)) {
			System.out.println("Valid User , you can get all the services");
		}else {
			System.out.println("Invalid user plz login again");
		}
		
	}

}
