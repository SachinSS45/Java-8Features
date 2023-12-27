package com.anonymousInnerclassLambdaexpression;
/*
 * Can we use Lambda Expression whenever Anonymous Inner class Present ? No . Anonymous Inner class and Lambda Expression are not same.
 * Description : In this program we are doing where we can use Lambda expression ?
 * Conclusion  : We can use Lambda Expression only when anonymous class implements Interface which is having only one method 
 *              In only functional Interface we can use Lambda Expression and Anonymous Inner class At a time.
 */
class Test1{
	
}
abstract class Test2{
	
}

interface Test3{
	public void m1();
	public void m2();
	public void m3();
}

interface Test4{
	public void gun();
}


public class Program3 {

	public static void main(String[] args) {
		
			Test1 t1 = new Test1() { // Anonymous Inner Class that extends Concrete class
				
			};
			Test2 t2 = new Test2() { //Anonymous Inner class that extends abstract class
				
			};
			
			Test3 t = new Test3() {//Anonymous Inner class that implements an interface which contains multiple methods
				public void m1() {}
				public void m2() {}
				public void m3() {}
			};
			
			Test4 t4 = new Test4() {//Anonymous Inner class that implements an interface which contains only one abstract methods
				public void gun() {
					             // ==============> Test4 t4 = ()->{};
				}
			};
			
	}

}
