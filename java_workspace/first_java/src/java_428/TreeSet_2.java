package java_428;

import java.util.TreeSet;

public class TreeSet_2 {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("elevator");
		set.add("dzzzz");
		set.add("elephant");
		set.add("korea");
		set.add("fan");
		set.add("flower");
		
		
		System.out.println(set);
		System.out.println("rage search : from : " +  from + " to : " + to );
		System.out.println("result11 : " + set.subSet(from, to));
		System.out.println("result12 : " + set.subSet(from, to + "zzzzz"));
	}
}
