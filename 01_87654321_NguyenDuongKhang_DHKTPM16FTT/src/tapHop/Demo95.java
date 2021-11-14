package tapHop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo95 {

	public static void main(String[] args) {
		Set<String> setA = new HashSet<String>();
		setA.add("Java");
		setA.add("Python");
		setA.add("Java");
		setA.add("PHP");
		List<String> listA = new ArrayList<String>();
		// chuyển đổi setA thành listA
		listA.addAll(setA);
		System.out.println(listA);

	}

}
