package tranThanhVan_123456789;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ListCollHS {
	List<HocSinh> ls;
	List<HocSinh> le;
	List<HocSinh> li;
	Set<HocSinh> sh;
	Set<HocSinh> sk;
	Set<HocSinh> st;

	public ListCollHS() {
		ls = new Vector<HocSinh>();
		le = new ArrayList<HocSinh>();
		li = new LinkedList<HocSinh>();
		sh = new HashSet<HocSinh>();
		sk = new LinkedHashSet<HocSinh>();
		st = new TreeSet<HocSinh>();
	}

	public boolean themHS(HocSinh sh1) {
		if (ls.contains(sh1)) {
			return false;
		} else {
			return ls.add(sh1);
		}
	}
	public void sapXep() {
		Collections.sort(ls, new Comparator<HocSinh>() {
			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				String x= new String(o1.getMaHS());
				String y= new String(o2.getMaHS());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	
	public void inKQIT() {
		Iterator<HocSinh> itr= ls.iterator();
		while (itr.hasNext()) {
			HocSinh hs = (HocSinh) itr.next();
			if (hs!=null) {
				System.out.println(hs);
			}
		}
	}
	public void themHSS(HocSinh hs) {
		ls.add(hs);
	}
	public void inKQFOR() {
		for (HocSinh hs : le) {
			if (hs!=null) {
				System.out.println(hs);
			}
			
		}
	}

	// thêm, xóa, sửa, duyệt, xuất, trích lọc, sắp xếp, .....
	

}
