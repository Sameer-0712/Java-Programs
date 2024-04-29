package javaBasics;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Automation";

		char[] strArr = str.toCharArray();

		String revStr = "";

		for(int i=strArr.length-1;i>=0;i--){

		revStr = revStr+strArr[i];

		}
		System.out.println(revStr);
		
	}
	
	

}
