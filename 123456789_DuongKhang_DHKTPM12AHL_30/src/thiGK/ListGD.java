package thiGK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListGD {
	ArrayList<GiaoDich> ls;
	public ListGD() {
		ls= new ArrayList<GiaoDich>();
	}
	// them giao dich
	public boolean themGD(GiaoDich gd) {
		if (ls.contains(gd)) {
			return false;
		} else {
			return ls.add(gd);
		}
	
	}
	public void xuatGD() {
		for (GiaoDich gd : ls) {
			if (gd instanceof GIaoDichDat && gd!=null) {
				System.out.println(gd);
			}
		}
	}
	public boolean xoaGD(String maX) {
		for (GiaoDich gd : ls) {
			if (gd.getMaGD().equalsIgnoreCase(maX)) {
				ls.remove(gd);
				return true;
			}
		}
		return false;
	}
	public void sortMa() {
		Collections.sort(ls, new Comparator<GiaoDich>() {
			@Override
			public int compare(GiaoDich g1, GiaoDich g2) {
				String x= new String(g1.getMaGD());
				String y= new String(g2.getMaGD());
				return x.compareToIgnoreCase(y);
			}
		});
	}

}
