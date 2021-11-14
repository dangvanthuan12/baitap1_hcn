package tapHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		//List-LinkedList
		List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");
        Iterator<String> itr= linkedList.iterator();
        while (itr.hasNext()) {
			String str= (String) itr.next();
			System.out.println(str);
			
		}
	}

}
