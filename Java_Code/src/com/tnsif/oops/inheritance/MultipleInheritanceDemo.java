package com.tnsif.oops.inheritance;
// Two Interface class
interface Java{
	void show();
}
interface Project{
      void display();	
}
// implement the above two interface in another class
class Hello implements Java,Project{
	@Override
	 public void show() {
		System.out.println("showing");
	}
	@Override
	
	 public void display() {
		System.out.println("displaying");
		
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
Hello obj=new Hello();
  obj.show();
  obj.display();
  }

}
