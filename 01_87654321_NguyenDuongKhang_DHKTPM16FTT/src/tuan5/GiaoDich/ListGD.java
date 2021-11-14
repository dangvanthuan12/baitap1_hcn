package tuan5.GiaoDich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		ls= new ArrayList<GiaoDich>();
	}
	public boolean themGD(GiaoDich g) {
		if (ls.contains(g)) {
			return false;
		} else {
			return ls.add(g);
		}
	}
	public void inKQ() {
		Iterator<GiaoDich> itr= ls.iterator();
		while (itr.hasNext()) {
			GiaoDich g = (GiaoDich) itr.next();
			System.out.println(g);
		}
	}
	public void sapXep() {
		Collections.sort(ls, new Comparator<GiaoDich>() {
			@Override
			public int compare(GiaoDich o1, GiaoDich o2) {
			String x= new String(o1.getMaGD());
			String y = new String(o2.getMaGD());
				return x.compareToIgnoreCase(y);
			}
		});
	}

}
