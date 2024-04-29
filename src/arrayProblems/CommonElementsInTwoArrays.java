package arrayProblems;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = {3,1,5,2,8};
		
		int[] a2 = {4,7,9,2,1,7,2,3,4,9};
		
		for (int i=0;i<a1.length;i++) {
			for (int j=0;j<a2.length;j++) {
				if(a1[i] == a2[j]) {
					System.out.println(a1[i]);
				}
			}
		}
	}

}
