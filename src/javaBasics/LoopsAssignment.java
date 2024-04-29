package javaBasics;

public class LoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			System.out.println("I am Batman");
		}
		
		System.out.println("--------------------");
		
		for(int i=1;i<=9;i++) {
			System.out.println("I am Batman "+i);
		}
		
		System.out.println("--------------------");
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("--------------------");
		
		int j=10;
		do {
			System.out.println(j);
			j--;
		}while(j>=1);
		
		System.out.println("--------------------");
		
		int k=1;
		while(k<=10) {
			System.out.println("Hello World");
			k++;
		}
		
		System.out.println("--------------------");
		
		for(int l=1;l<=100;l++) {
			if(l%5==0) {
				System.out.println(l);
			}
		}
		
		System.out.println("--------------------");
		
		int m=1;
		while(m<=100) {
			if(m%5==0) {
				System.out.println(m);
			}
			m++;
		}
		
		System.out.println("--------------------");
		
		int n=1;
		do {
			if(n%5==0) {
				System.out.println(n);
			}
			n++;
		}
		while(n<=100);
		
		System.out.println("--------------------");
		
		for(int a=1;a<=100;a++) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		
		System.out.println("--------------------");
		
		for(int a=1;a<=100;a++) {
			if(a%2!=0) {
				System.out.println(a);
			}
		}
		
		System.out.println("--------------------");
		
		char c = 'A';
		while(c<='Z') {
			System.out.println(c+"-->"+(byte)c);
			c++;
		}
		char c1 = 'a';
		while(c1<='z') {
			System.out.println(c1+"-->"+(byte)c1);
			c1++;
		}
		
		System.out.println("--------------------");
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch+"-->"+(byte)ch);
		}
		
		for(char ch1='a';ch1<='z';ch1++) {
			System.out.println(ch1+"-->"+(byte)ch1);
		}
		
		System.out.println("--------------------");
		
		for(float f1=1.0f;f1<=10.0;f1++) {
			System.out.print(f1+" ");
		}
		
		System.out.println();
		
		for(int b=0;b<=100;b++) {
			if(b%9==0) {
				System.out.print(b+" ");
			}
		}
		System.out.println();
		System.out.println("--------------------");
		
		for(char c2='a';c2<='z';c2++) {
			
			if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
//				System.out.print(c2+" ");
				System.out.println(c2+" is a vowel");
			}
			
		}
		

}
}
