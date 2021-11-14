package demo123456789;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListGD {
	ArrayList<GiaoDich> lg;
	public ListGD() {
		lg= new ArrayList<GiaoDich>(2);
	}
public boolean themGD(GiaoDich g) {
	for (GiaoDich gd : lg) {
		if (gd.getMaGD().equalsIgnoreCase(g.getMaGD())) {
			return false;
		}
	}
	lg.add(g);
	return true;
}
public void sapXep() {
	Collections.sort(lg, new Comparator<GiaoDich>() {
		@Override
		public int compare(GiaoDich gd1, GiaoDich gd2) {
			String x= new String(gd1.getMaGD());
			String y= new String(gd2.getMaGD());
			return x.compareToIgnoreCase(y);
		}
	});
}
public boolean xoaGD(String maXoa) {
	for (GiaoDich gd : lg) {
		if (gd.getMaGD().equalsIgnoreCase(maXoa)) {
			lg.remove(gd);
			return true;
		}
	}
	return false;
}
public void xuatKQD() {
	for (GiaoDich giaoDich : lg) {
		if (giaoDich!=null && giaoDich instanceof GiaoDichDat) {
			System.out.println(giaoDich);
		}
	}
}
	public void xuatKQN() {
		for (GiaoDich giaoDich : lg) {
			if (giaoDich!=null && giaoDich instanceof GiaoDichNha) {
				System.out.println(giaoDich);
			}
		}
}

}
