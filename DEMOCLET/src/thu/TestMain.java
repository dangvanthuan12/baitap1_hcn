package thu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<String> ls;
		ls= new ArrayList<String>();
		ls.add("Khoa CNTT");
		ls.add("Khoa TCNH");
		ls.add("Khoa QTKD");
		ls.add("Khoa CKDL");
		System.out.println(ls);
		// dùng mảng in kết quả
		System.out.println("In ket bang for");
		for (String st : ls) {
			System.out.println(st);
		}
		ls.remove(0);
		ls.clear();
		// Dùng iterator
		System.out.println("In ket qua Iterator");
		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			String str= (String) itr.next();
			System.out.println(str);
		}
	}

}
