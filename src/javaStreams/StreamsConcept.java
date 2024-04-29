package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("Testing");
		strList.add("QA");
		strList.add("automation");
		strList.add("Env");
		strList.add("DevOps");
		strList.add("selenium");
		strList.add("java");
		strList.add("ci/cd");
		strList.add("Docker");
		
		strList.stream().filter(s -> s.contains("d")).map(s->s.toUpperCase()).forEach(s -> System.out.print(s+" "));
		System.out.println("\n****");
		
		List<Integer> intList = Arrays.asList(3,5,9,1,2,7,5,3,4,8,9,7,1);
		
		intList.stream().distinct().forEach(s -> System.out.print(s+" "));
		System.out.println("\n****");
		intList.stream().filter(s -> s>4).distinct().forEach(s -> System.out.print(s+" "));
		System.out.println("\n****");
		intList.stream().sorted().distinct().forEach(s -> System.out.print(s+" "));
		System.out.println("\n****");
		Integer sum = intList.stream().reduce(0,Integer::sum);
		System.out.print(sum);
		System.out.println("\n****");
		intList.stream().sorted(Comparator.reverseOrder()).distinct().forEach(s->System.out.print(s+" "));
		
		ArrayList<String> priceList = new ArrayList<String>();
		
		priceList.add("$ 31500");
		priceList.add("$ 37500");
		priceList.add("$ 11500");
		
//		List<Integer> ints = priceList.stream().map(s -> Integer.parseInt(s.replaceAll("$ ", ""))).collect(Collectors.toList());
//		for(int i:ints) {
//			System.out.println(i);
//		}
		
		String s= "$ 6900";
		System.out.println("***");
//		String[] s_arr = s.split(" ");
//		System.out.println(Integer.parseInt(s_arr[1]));
		System.out.println(s.substring(2));
		
		String s1= "ABS";
		s1 = "XYZ";
		System.out.println(s1);
	}

}
