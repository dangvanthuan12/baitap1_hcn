package tapHop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo9 {
	public static void main(String[] args) {
		 // create list
        List<String> ls = new ArrayList<String>();
        // add elements to list
        ls.add("Java");
        ls.add("C");
        ls.add("C++");
        ls.add("PHP");
        ls.add("Python");
        // sort list
        Collections.sort(ls, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		// TODO Auto-generated method stub
        		return o1.compareTo(o2);
        	}
		});
        Collections.sort(ls, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        // show list
        for (String element : ls) {
            System.out.println(element);
        }
	}

}
