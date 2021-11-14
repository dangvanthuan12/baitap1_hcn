package tapHop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo8 {
	public static void main(String[] args) {
		// create list
        List<String> lt = new ArrayList<String>();
        // add elements to list
        lt.add("Java");
        lt.add("C");
        lt.add("C++");
        lt.add("PHP");
        lt.add("Python");
        // sort list
        Collections.sort(lt);
        // show list
        for (String pt : lt) {
            System.out.println(pt);
        }
	}

}
