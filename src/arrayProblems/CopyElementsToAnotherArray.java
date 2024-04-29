package arrayProblems;

import java.util.Arrays;

public class CopyElementsToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,1,5,7};
		
		int a_copy[] = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			a_copy[i] = a[i];
		}
		
		System.out.println(Arrays.toString(a_copy));
	}

}
