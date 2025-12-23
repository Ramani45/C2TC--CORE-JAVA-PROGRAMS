package com.tnsif.assignment;

public class Test_4 {
	class A2 {
	    int x = 10;
	}

	class B2 extends A2 {
	    int x = 20;

	    public String toString() {
	        //System.out.println(x);  
	        return "x"+x;
	    }
	    @SuppressWarnings("null")
		public static void main(String[] args) {
			
			Object b = null;
			System.out.println(b.toString());
		}
	}


}
