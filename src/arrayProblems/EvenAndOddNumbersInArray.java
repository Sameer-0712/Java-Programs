package arrayProblems;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,3,1,4,2,3,1,2,3,4,5,6,7,1,3,2};
		
		System.out.println("Even Numbers: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\nOdd Numbers: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
