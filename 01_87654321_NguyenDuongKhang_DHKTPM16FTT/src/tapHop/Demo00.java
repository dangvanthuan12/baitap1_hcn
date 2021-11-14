package tapHop;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Demo00 {
	public static void main(String[] args) {
		List<Integer> ls = new Vector<Integer>();
		ls.add(12);
		ls.add(23);
		ls.add(21);
		ls.add(2);
		ls.add(23);
		// Duyệt fore
		for (Integer itg : ls) {
			System.out.println(itg);
		}
		// while
		Iterator<Integer> itr= ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+ ",");
		}
		
	}

}
