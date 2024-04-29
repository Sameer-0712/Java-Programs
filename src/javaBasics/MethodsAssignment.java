package javaBasics;

public class MethodsAssignment {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int difference(int a, int b) {
		return a-b;
	}
	
	public int product(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}
	
	public double product(double a, double b) {
		return a*b;
	}
	
	public double circumfence(double radius) {
		return 2*3.1428*radius;
	}
	
	public static void findMax(int a, int b, int c) {
		
		if(a==b & b==c) {
			System.out.println("All are equal");
		}
		else {
			if(a>=b & a>=c) {
				System.out.println(a+" is the greatest");
			}
			else if(b>=a & b>=c) {
				System.out.println(b+" is the greatest");
			}
			else  {
				System.out.println(c+" is the greatest");
			}
		}
			
	}
	
	public static void findMin(int a, int b, int c) {
		
		if(a==b & b==c) {
			System.out.println("All are equal");
		}
		else {
			if(a<=b & a<=c) {
				System.out.println(a+" is the smallest");
			}
			else if(b<=a & b<=c) {
				System.out.println(b+" is the smallest");
			}
			else  {
				System.out.println(c+" is the smallest");
			}
		}
			
	}

	public static boolean isEven(int i) {
		if(i%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isEligible(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

	public void getGrades(int marks) {
		
		if(marks<0 || marks>100) {
			System.out.println("Please enter the correct marks");
		}
		else {
			if(marks>90 && marks <=100) {
				System.out.println("AA grade");
			}
			else if(marks>80 && marks <=90) {
				System.out.println("AB grade");
			}
			else if(marks>70 && marks <=80) {
				System.out.println("BB grade");
			}
			else if(marks>60 && marks <=70) {
				System.out.println("BC grade");
			}
			else if(marks>50 && marks <=60) {
				System.out.println("CD grade");
			}
			else if(marks>40 && marks <=50) {
				System.out.println("DD grade");
			}
			else {
				System.out.println("Fail");
			}
		}	
		
	}
	
	public int getFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		else {
			int fact = 1;
			for(int i=1;i<=num;i++) {
				fact = fact*i;
			}
			return fact;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMax(20,20,26);
		findMin(2,28,17);
		System.out.println(isEven(67));
		System.out.println(isEven(68));
		MethodsAssignment obj = new MethodsAssignment();
		obj.getGrades(97);
		System.out.println(obj.getFactorial(0));
		System.out.println(obj.circumfence(7));
		System.out.println(obj.product(12.6, 7.9));

	}

}
