package arrayProblems;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,8,3,6};
		insertionSort(a);
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}

}
