package tapHop;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		// List-arrayList
		List<String> ls = new ArrayList<String>();
        ls.add("PHP");
        ls.add("Python");
        ls.add("Java");
        ls.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + ls + "\n");
        System.out.println("In danh sach");
        for (String str : ls) {
        	System.out.println(str);
			
		}
	}
}
