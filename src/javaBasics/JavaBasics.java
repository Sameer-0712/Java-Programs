package javaBasics;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		arr[3] = 25;
		arr[4] = 30;
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
		
		int j = 0;
		sum = 0;
		while (j<arr.length) {
			sum = sum+arr[j];
			j++;
		}
		System.out.println("While Sum: "+sum);
		
		Object obj[] = new Object[5];
		obj[0] = "Sameer";
		obj[1] = "Test Automation";
		obj[2] = 20;
		obj[3] = 'M';
		obj[4] = 100.5;
		
		for (int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		String s[][] = new String[3][4];
		System.out.println(s.length);
		System.out.println(s[0].length);
		
		s[0][0] = "Sameer";
		s[0][1] = "Test";
		s[0][2] = "Automation";
		s[0][3] = "DevOps";
		s[1][0] = "Java";
		s[1][1] = "Jenkins";
		s[1][2] = "Ci/Cd";
		s[1][3] = "Maven";
		s[2][0] = "QA";
		s[2][1] = "AWS";
		s[2][2] = "Engineering";
		s[2][3] = "Agile";
		
		for (int i=0;i<s.length;i++) {
			for (int k=0;k<s[0].length;k++) {
				System.out.print(s[i][k]+" ");
			}
		}
		
		for (String[] str: s) {
			System.out.println("enhanced for loop: "+ str);
		}
		
		String s1 = "| 653655297244490f95d4c971 |";
		System.out.println(s1.replace("|", "").strip());

		System.out.println('a'+Character.toString('1')+"sam"+'a');
		
		System.out.println("Sameer".length());
		
		System.out.println(9/0);
	}

}
