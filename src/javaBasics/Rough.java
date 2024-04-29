package javaBasics;

import java.util.Arrays;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 300;
//		int b = 156;
//		
//		findHCF(a, b);	
		
		
//		int[] nums = {5,7,1,3,9,8,0,11,-6,12,5,1,7,3,90,56,44,31,-76,-12,-88,-100,42,1,-3,0,-7,-16,100};
//		long start1 = System.nanoTime();
//		sortArray(nums);
//		System.out.println(Arrays.toString(nums));
//		long end1 = System.nanoTime();
//		System.out.println("Execution time w/o sort method = "+ (end1-start1)+" ns");
//		long start2 = System.nanoTime();
//		Arrays.sort(nums);
//		long end2 = System.nanoTime();
//		System.out.println(Arrays.toString(nums));
//		System.out.println("Execution time with sort method = "+ (end2-start2)+" ns");
		
		String s = "1602.00";
		String s1 = s.replaceAll("[^0-9.]", "");
		System.out.println(s1);
		Double.parseDouble(null);
		
	}
	
	public static void findHCF(int a, int b) {
		int divisor = a;
		int dividend = b;
		int rem = dividend%divisor;
		int count = 1;
		if(rem == 0) {
			System.out.println(a);
		}
		else {
			while(rem!=0) {
				
				divisor = rem;
				dividend = a;
				rem = dividend%divisor;
				a=divisor;
				if(rem == 0) {
					System.out.println(divisor);
				}
				count++;					
			}		
		}
		System.out.println(count);
	}
	
	public static void sortArray(int[] nums) {
		int temp;
		for (int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[i]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
							
			}			
		}
	}

}
