package tapHop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7 {
	public static void main(String[] args) {
		/*chuyển đổi Array thành ArrayList và ngược lại*/
		 List<String> ls = new ArrayList<>();
	        // adding String object to arrayList
	        ls.add("Java");
	        ls.add("C");
	        ls.add("C++");
	        ls.add("PHP");
	        ls.add("Python");
	         
	        // convert ArrayList to Array
	        System.out.println("Convert ArrayList to Array:");
	        String[] item = ls.toArray(new String[ls.size()]);
	        // show item
	        for (String s : item) {
	            System.out.println(s);
	        }
	        for (int i = 0; i < ls.size(); i++) {
				System.out.println(ls);
			}
	         
	        // convert Array to ArrayList
	        System.out.println("Convert Array to ArrayList:");
	        List<String> list2 = new ArrayList<>();
	        list2 = Arrays.asList(item);
	        // show list2
	        System.out.println(list2);
	}

}
