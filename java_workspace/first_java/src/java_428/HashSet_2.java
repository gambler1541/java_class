package java_428;

import java.util.HashSet;

public class HashSet_2 {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add("abc");
		
		set.add(new King("Park", 29));
		set.add(new King("Park", 29));
		
		System.out.println(set);
	}
}


class King{
	String name;
	int age;
	
	public King(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof King) {
			King tmp = (King)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()  + age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}