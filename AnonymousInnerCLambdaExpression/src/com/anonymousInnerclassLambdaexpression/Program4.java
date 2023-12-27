package com.anonymousInnerclassLambdaexpression;
/*
 * 1)We can declare instance variable in anonymous in Inner class like normal class
 * 2)Inside anonymous Inner class 'this' always refers to Current Instance variables only
 * 3)Inside Lambda Expression 'this' always refers to outer class variables only.
 * 4)Inside Lambda Expression we can't create instance variables they acts as local variables.
 */
interface Interf{
	public void m1();
}

class Test{
	int x = 888;
	public void m2() {
		Interf i = new Interf() {
			int x = 999;//Instance variables
			public void m1() {
				System.out.println(this.x);
			}
		};
		i.m1();
	}
}
class Test6{
	int x = 888;
	public void m2() {
		Interf i=()->{
			int x = 999;//local variable
			System.out.println(this.x);//888
		};
		i.m1();
	};
}
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m2();//999
		Test6 t6 = new Test6();
		t6.m2();
	}

}
