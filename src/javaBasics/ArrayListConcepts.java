package javaBasics;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 19;
		String s = checkPrime(173);
		System.out.println(s);
		primeNums(100);

	}
	
public static String checkPrime(int num) {
	boolean flag = false;
	for(int i=2;i<num;i++) {
		if(num%i == 0) {
			flag = true;
			break;
		}		
	}
	if(flag == true) {
//		System.out.println("Not Prime");
		return "Not Prime";
	}
	else {
//		System.out.println("Prime");
		return "Prime";
	}
}

public static void primeNums(int n) {
	String s = new String();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			s = checkPrime(j);
			if(s == "Prime" & j == i) {				
				System.out.println(j);				
			}
		}				 
	}
}
}
