package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
	//variable declaration also called Data members
	private int serialNum;//private access within the class
	private String name;
	private int age;	
	// getters and setters method(source>>getters and setters)
public int getSerialNum() {// when we use get method ,we use return fn always
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;//this is a keyword used to run or refer the current object
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

@Override          // toString()override the integer as string.
public String toString() {
	return "OopsConceptDemo [Serial Number=" + serialNum +","+"name="+name+",age="+age+"]";
}
}
	


