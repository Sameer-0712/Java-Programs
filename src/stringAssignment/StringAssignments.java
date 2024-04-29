package stringAssignment;

public class StringAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareStrings("Sameer", "sameer"));
		System.out.println(removeSpaces("  Test  QA  DevOps       Env "));
		firstAndLastCharacter("Testing");
		System.out.println(containsWordOrChar("Selenium Automation with Java is awesome", "AwE"));
		System.out.println(reveseString("Sameer"));
		System.out.println(getSecondHalf("SameerTestAutomationDevOps"));
		
	}
	
	public static boolean compareStrings(String s1, String s2) {
		
		return s1.equals(s2);
	}
	
	public static String removeSpaces(String s) {
		s=s.trim();
		String stringWithoutSpaces = "";
		String[] s_arr = s.split(" ");
		for(int i=0;i<s_arr.length;i++) {
			stringWithoutSpaces = stringWithoutSpaces+s_arr[i];
		}
		return stringWithoutSpaces;
	}
	
	public static void firstAndLastCharacter(String s) {
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length() - 1));
	}
	
	public static boolean containsWordOrChar(String s, String checkString) {
		return s.toLowerCase().contains(checkString.toLowerCase());
	}
	
	public static String reveseString(String s) {
		String reverseString = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverseString=reverseString+s.charAt(i);
		}
		return reverseString;
	}
	
	public static String getSecondHalf(String s) {
		int halfLength = s.length()/2;		
		String stringSecondHalf = s.substring(halfLength, s.length());	
		return stringSecondHalf;		
	}
	
	public static void getNthChar(String s, int i) {
		
	}
}
