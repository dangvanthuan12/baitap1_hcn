package tapHop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Demo91 {
	public static void main(String[] args) {
		// create list
		List<Double> list = new ArrayList<Double>();
		// add elements to list
		list.add(15D);
		list.add(20D);
		list.add(16.5D);
		List<String> lt = new Vector<String>();
		lt.add("Thu");
		lt.add("Xuân");
		lt.add("Hạ");
		

		// sort list ASC
		Collections.sort(list);
		// show list
		System.out.println("show list ASC:");
		for (Double element : list) {
			System.out.println(element);
		}
		Collections.sort(lt);
		for (String st : lt) {
			System.out.println(st);
		}

		// sort list DESC
		Collections.sort(list, new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o1 > o2 ? -1 : 1;
			}
		});
		
		// show list
		System.out.println("show list DESC:");
		for (Double element : list) {
			System.out.println(element);
		}
	}
}
