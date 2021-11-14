package tapHop;

import java.util.HashSet;

public class Demo92 {
	public static void main(String[] args) {
		HashSet<String> setA = new HashSet<String>();
		setA.add("Java");
		setA.add("Python");
		setA.add("Java");
		setA.add("PHP");
		System.out.println("Số phần tử của setA: " + setA.size());
		System.out.println("Các phần tử của setA: " + setA);
		System.out.println("setA có chứa Java không? " + setA.contains("Java"));
		System.out.println("setA có chứa C++ không? " + setA.contains("C++"));
	}
}
