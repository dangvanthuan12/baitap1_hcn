package anhDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSV {
	ArrayList<SinhVien> ls;

	public ListSV() {
		ls = new ArrayList<SinhVien>(2);
	}

	public boolean themObSV(SinhVien sv) {

		/*
		 * for (SinhVien s : ls) { if (s.getMaSV().equalsIgnoreCase(sv.getMaSV())) {
		 * return false; } }
		 */
		if (ls.contains(sv)) {
			return false;
		} else {
			ls.add(sv);
			return true;
		}
	}

	public boolean xoaObSV(String maSV) {
		for (SinhVien sv : ls) {
			if (sv.getMaSV().equalsIgnoreCase(maSV)) {
				ls.remove(sv);
				return true;
			}
		}
		return false;
	}

	public void SapXep() {
		Collections.sort(ls, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				String s = new String(sv1.getMaSV());
				String y = new String(sv2.getMaSV());
				return s.compareToIgnoreCase(y);
			}
		});
	}

	public void inKQ() {
		for (SinhVien sv : ls) {
			if (sv != null) {
				System.out.println(sv);
			}
		}
	}
	/*
	 * public static void main(String[] args) { List<String> ls = new
	 * ArrayList<String>(); ls.add("Java"); ls.add("C++"); ls.add("PHP"); ls.add(1,
	 * "Python"); System.out.println("Xuất các phần tử"); for (String st : ls) {
	 * System.out.println(st); } System.out.println("Sau khi thêm"); ls.add(3,
	 * "Pascal"); for (String st : ls) { System.out.println(st); } // Xóa theo chỉ
	 * số 0 ls.remove(0); System.out.println("Sau khi xóa index 0"); for (String st
	 * : ls) { System.out.println(st); } // Xóa theo giá trị
	 * 
	 * System.out.println("Sau khi xóa"); for (String st : ls) {
	 * System.out.println(st); } }
	 */

}
