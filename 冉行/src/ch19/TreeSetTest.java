package ch19;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		//Set set =new java.util.TreeSet();
		Set set =new TreeSet<Object>();
		set.add("a");
		set.add("a");
		set.add("a");
		set.add("a");
		set.add("a");
		set.add("b");
		System.out.println(set);
	}
}
