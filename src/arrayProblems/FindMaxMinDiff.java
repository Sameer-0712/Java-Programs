package arrayProblems;

public class FindMaxMinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {12,5,3,6,2,1,21,3,1,5,8,9};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[j] > max) {
					max = a[j];
				}
				if(a[j] < min) {
					min = a[j];
				}
			}
		}
		
		System.out.println(max - min);

	}

}
