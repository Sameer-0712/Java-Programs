package arrayProblems;

public class FindDuplicatesInAArray {

	public static void main(String[] args) {

		int a[] = {12,5,3,6,2,1,21,3,1,5,8,9};
		
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
