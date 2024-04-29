package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Intvw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'a','c','c','d','a','b','c','d','a','a','a'};
		System.out.println(Arrays.toString(c));
		System.out.println(countChars(c));
		System.out.println(createEmail(countChars(c)));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
	
	public static Map<Character, Integer> countChars(char[] chArr) {		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();		

		for(char c:chArr) {
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);
			}
		}
		
		return hm;
	}
	
	public static List<String> createEmail(Map<Character,Integer> hm) {
		
		String domain = "@gmail.com";
		List<String> emails = new ArrayList<String>();
		for(Entry<Character, Integer> keyVal : hm.entrySet()) {
			char c = keyVal.getKey();
			int value = keyVal.getValue();
			for(int i=0;i<value;i++) {
				if(i==0) {
					emails.add(c+domain);
				}else {
					emails.add(c+String.valueOf(i)+domain);
				}
				
			}
		}
		return emails;
	}
	
	

}
