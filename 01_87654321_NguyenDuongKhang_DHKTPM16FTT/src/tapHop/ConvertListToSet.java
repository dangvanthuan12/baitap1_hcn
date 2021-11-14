package tapHop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {
	public static void main(String[] args) {
		Set<Integer> sl= new HashSet<Integer>();
		sl.add(4);
		sl.add(7);
		sl.add(3);
		sl.add(5);
		System.out.println("Xuất các giá trị của sl");
		System.out.println(sl);
		List<Integer> ls= new ArrayList<Integer>();
		ls.addAll(sl);
		System.out.println("Sau khi chuyển Set to list");
		System.out.println(ls);
	}

}
