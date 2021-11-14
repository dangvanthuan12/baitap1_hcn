package tapHop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Vidu2HashMap {

	public static void main(String[] args) {
		// init hashMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// add elements to hashMap
		hashMap.put(1, "Java");
		hashMap.put(3, "C++");
		hashMap.put(2, "PHP");
		hashMap.put(4, "Python");
		// hien thi HashMap
		show(hashMap);
	}

	public static void show(HashMap<Integer, String> hashMap) {
		Set<Integer> keySet = hashMap.keySet();
		for (Integer key : keySet) {
			System.out.println(key + " - " + hashMap.get(key));
		}
		
	}

}
