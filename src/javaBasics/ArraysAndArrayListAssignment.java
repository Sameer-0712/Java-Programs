package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayListAssignment {

	public static void main(String[] args) {
		
		int p[] =  {1,4,5,2,3,22,31,2};
		int q[] = new int[p.length-1];
		
		int j=0;
		for(int i=0;i<p.length;i++) {
			if(p[i] != 3) {
				q[j]=p[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(q));
		System.out.println("-----------");
		
		Object[] player1 = new Object[6];
		player1[0] = "Virat Kohli";
		player1[1] = 35;
		player1[2] = "India";
		player1[3] = "5/11/1988";
		player1[4] = 'M';
		player1[5] = 120.25;
		
		Object[] player2 = new Object[6];
		player2[0] = "Ricky Ponting";
		player2[1] = 40;
		player2[2] = "Australia";
		player2[3] = "11/01/1982";
		player2[4] = 'M';
		player2[5] = 130.25;
		
		for(int i=0;i<player1.length;i++) {
			System.out.println(player1[i]);
		}
		
		for(int i=0;i<player2.length;i++) {
			System.out.println(player2[i]);
		}
		
		System.out.println("-----------");
		
		String[] colourArray = {"Red","Blue","Green"};
		
		ArrayList<String> colours = new ArrayList<String>(Arrays.asList(colourArray));
		System.out.println(colours.size());
		colours.add("Yellow");
		colours.add("Violet");
		colours.add("Indigo");
		colours.add("Orange");
		System.out.println(colours.size());

		
		
	}

}
