package tapHop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo11List {

	public static void main(String[] args) {
		List<String> ls= new ArrayList<String>();
		ls.add("Khoa CNTT");
		ls.add("Khoa TCNH");
		ls.add("Khoa QTKD");
		ls.add("Khoa CNTT");
		// Dùng fore duyệt mảng xuất các giá trị collections
		for (String str : ls) {
			System.out.println(str);
		}
		/*// Dùng Iterrator
		Iterator<String> str= ls.iterator();
		while (str.hasNext()) {
			String stri = (String) str.next();
			System.out.println(stri);
		}*/
		
		/*System.out.println("Xuất các Pt sau khi thêm");
		System.out.println(ls);
		ls.remove(1);
		System.out.println("Sau khi xóa theo index:");
		System.out.println(ls);
		ls.remove("Khoa QTKD");
		System.out.println("Sau khi xóa theo nội dung Khoa QTKD");
		System.out.println(ls);
		System.out.println("Sau khi xóa ls.removeAll(ls);");
		ls.removeAll(ls);
		System.out.println(ls);
		List<Integer> lt= new Vector<Integer>();
		lt.add(67);
		lt.add(80);
		lt.add(0, 87);
		System.out.println(lt);
		List<Double> lf= new LinkedList<Double>();
		lf.add(0,7.1);
		lf.add(5.2);
		System.out.println(lf);*/
		// Phương thức xem kích thước collection
		System.out.println("Kích thước của ls: "+ ls.size());
		System.out.println("Có tồn tại phần tử có nội dung Khoa CNTT trong ls: "
		+ ls.contains("Khoa CNTT1"));
		

	}

}
