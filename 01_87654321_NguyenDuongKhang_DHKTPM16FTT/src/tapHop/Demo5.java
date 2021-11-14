package tapHop;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {
	public static void main(String[] args) {
		 // Creating arraylist
        ArrayList<String> lt = new ArrayList<String>();
        // Add objects to arraylist
        lt.add("Java");
        lt.add("C++");
        lt.add("PHP");
        lt.add("Java");
        // Show list through Iterator
        Iterator<String> itr = lt.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show list through for-each
        System.out.println();
        for (String obj : lt) {
            System.out.print(obj + ", ");
        }
        // Show list through index
        System.out.println();
        int size = lt.size();
        for (int i = 0; i < size; i++) {
            System.out.print(lt.get(i) + ", ");
        }
	}
}
