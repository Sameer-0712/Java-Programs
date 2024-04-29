package javaBasics;

public class MethodsPractice {
	
	public static void m1() {
		System.out.println("m1 method");
	}
	
	public void m1(int a) {
		System.out.println("m1 method "+a);
		
	}
	
	public static void m2() {
		System.out.println("m2 method");
		MethodsPractice m = new MethodsPractice();
		m.t3();
	}
	
	public static void m3() {
		System.out.println("m3 method");
	}
	
	public void t1() {
		System.out.println("t1 method");
		m1();
		t2();
	}
	
	public void t2() {
		System.out.println("t2 method");
		m2();
		t3();
	}
	
	public void t3() {
		System.out.println("t3 method");
		m3();
//		t1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsPractice obj = new MethodsPractice();
		obj.t1();

	}

}
