package tranKhang8432112345;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<String>();
		ls.add("Khoa CNTT");
		ls.add("Khoa TMDT");
		ls.add("Khoa TCNN");
		for (String str : ls) {
			System.out.println(str);
		}
		ls.remove(1);
		System.out.println("list sau khi xóa:");
		for (String str : ls) {
			System.out.println(str);
		}
	}

}
