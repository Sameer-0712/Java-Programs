package javaBasics;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		System.out.println(i++);
		System.out.println(i);
		System.out.println(i--);//2
		System.out.println(i--);//1
		System.out.println(i++);//0
		
		char ch = 'h';
//		byte i1 = (byte)ch;
		
		ch = 'd';
		byte b = (byte)(ch+3);
		char ch1 = (char)b;
		
		System.out.println(ch1);
		float num = 3.9f;
		
		float sq = num*num;
		System.out.println(sq);
		
		int a1=1, b1=2;
		System.out.println(--b1 - ++a1 + ++b1 - --a1);//1 - 2 + 2 - 1 = 0
		
		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;
		System.out.println(p);
		
		
		int a=1;

		a = a++ + ++a * --a - a--;
		System.out.println(a);
		
		System.out.println(++ch);
	}

}
