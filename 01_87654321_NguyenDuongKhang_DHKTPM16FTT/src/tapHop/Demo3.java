package tapHop;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		// new HashSet() sẽ sắp xếp các phần tử (treeSet())
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");
	}

}
