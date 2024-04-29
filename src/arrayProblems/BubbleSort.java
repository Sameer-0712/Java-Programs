package arrayProblems;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a = {2,1,5,8,3,7};
		int[] b = {1,2,3,4,5};
		int[] c = {5,9,1,3,6,1,8,2};
		int[] d = {5,3,1,-4,-2,7,-1};
		doBubbleSort(a);
		doBubbleSort(b);
		doBubbleSort(c);
		doBubbleSort(d);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

	}
	
	public static void doBubbleSort(int[] arr) {
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					count++;
				}
				
			}
		}
		System.out.println(count);
	}

}
