package com.predicate;


import java.util.function.Predicate;

/*
 * Description : In this program we are checking whether Software Engineer is allowed into Pub or not? by using Predicate.
 */
class SoftwareEngineer{
	
	String name;
	int age;
	boolean isHavingGF;
	public SoftwareEngineer(String name, int age, boolean isHavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + "]";
	}
	
	
}
public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareEngineer[] arrEngineers = {new SoftwareEngineer("Sachin", 22, false),
										   new SoftwareEngineer("Omkar", 28, true),
										   new SoftwareEngineer("Shubham", 25, true),
										   new SoftwareEngineer("Subramanyam", 60, false),
										   new SoftwareEngineer("Rocky", 19, true)
		};
		Predicate<SoftwareEngineer> allowd = sc->sc.age>=18 &&	sc.isHavingGF==true;
		System.out.println("The allowed Members into Pub are : ");
		for(SoftwareEngineer se:arrEngineers) {
			
			if(allowd.test(se)) {
				System.out.println(se);
			}
		}
		
		
	}

}
