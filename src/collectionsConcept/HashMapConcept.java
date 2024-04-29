package collectionsConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<String, String>();
		data.put("Sameer", "Automation");
		data.put("Amit", "QA");
		data.put("Naveen", "DevOps");
		data.put("Tom", "Dev");
		data.put("Peter", "Operations");
		
		System.out.println(data);
		System.out.println(data.entrySet());
		
		for(Map.Entry<String, String> entry: data.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}
	
		data.forEach((k,v)-> System.out.println(k+" "+v));
		
	
	}

}
