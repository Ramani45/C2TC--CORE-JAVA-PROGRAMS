package com.tnsif.oops.inheritance;

class A{
	void display() {
		System.out.println("HEllo world");
	}
}
class B extends A{
	
}
class C extends B{
	
}




public class InheritanceDemo {

	public static void main(String[] args) {
		B obj=new B();
				obj.display();

	}

}
