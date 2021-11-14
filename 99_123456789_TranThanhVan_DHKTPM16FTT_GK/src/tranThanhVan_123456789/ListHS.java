package tranThanhVan_123456789;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListHS {
	List<HocSinh> ls;
	public ListHS() {
		ls= new ArrayList<HocSinh>();
	}
	List<HocSinh> lv = new Vector<HocSinh>();
	List<HocSinh> lk = new LinkedList<HocSinh>();
	public boolean themHS(HocSinh h) {
		if (ls.contains(h)) {
			return false;
		}
		else
			return ls.add(h);
	}
	public boolean xoaHS(String ma) {
		for (HocSinh hs : ls){
			if (hs.getMaHS().equalsIgnoreCase(ma)) {
				ls.remove(hs);
			}
		}
		return false;
	}
	public void sapXep() {
		Collections.sort(ls, new Comparator<HocSinh>() {
			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				String x= new String(o1.getMaHS());
				String y= new String(o2.getMaHS());
				return x.compareToIgnoreCase(y);// tang dan
				// return y.compareT....(x)
			}
		});
	}
	public int dem() {
		int so=0;
		for (HocSinh h : ls) {
			so++;
		}
		return so;
	}
	public void inKQ() {
		for (HocSinh hs : ls) {
			if (hs!=null) {
				System.out.println(hs);
			}
		}
	}
}
