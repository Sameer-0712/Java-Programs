package stringAssignment;

import java.util.ArrayList;
import java.util.List;

public class Interview {

	public static void main(String[] args) {

		String str = "ABC";//ABC, ACB, BAC, BCA, CAB, CBA
		generatePermutations(str, 0, str.length());
//		System.out.println(str.substring(1));
//		System.out.println(str);
			
	}
	
	public static void generatePermutations(String str, int start, int end) {
		//Prints the permutations    
        if (start == end-1)    
            System.out.println(str);    
        else    
        {    
            for (int i = start; i < end; i++)    
            {    
                //Swapping the string by fixing a character    
                str = swapChar(str,start,i);    
                //Recursively calling function generatePermutation() for rest of the characters     
                generatePermutations(str,start+1,end);    
                //Backtracking and swapping the characters again.    
                str = swapChar(str,start,i);    
            }    
        }    
		
	}
	
	public static String swapChar(String s, int i, int j) {
		char[] strArr = s.toCharArray();
		char temp = strArr[i];
		strArr[i] = strArr[j];
		strArr[j] = temp;
		String s2 = "";
		
		for(int c=0;c<strArr.length;c++) {
			s2 = s2+strArr[c];
		}	
		return s2;
	}

}
