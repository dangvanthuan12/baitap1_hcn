package bai4.giaoDich;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;

	public ListGD() {
		ls = new ArrayList<GiaoDich>();
	}

	public boolean themGD(GiaoDich gd) {
		if (ls.contains(gd)) {
			return false;
		} else {
			return ls.add(gd);
		}
	}
	public boolean xoaGD(String ma) {
		for (GiaoDich gd : ls) {
			if (gd.getMaGD().equalsIgnoreCase(ma)) {
				return ls.remove(gd);
			}
		}
		return false;
	}
	public void xuatTheTG() {
		for (GiaoDich gd : ls) {
			if (gd.getNgayGD().get(Calendar.MONTH)==8 && gd.getNgayGD().get(Calendar.YEAR)==2013) {
				System.out.println(gd);
			}
		}
	}
	public double tinhTB() {
		int count=0;
		double tt=0;
		for (GiaoDich gd : ls) {
			if (gd!=null) {
				count++;
				tt=tt+gd.getThanhTien();
			}
		}
		return tt/count;
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

	public void inKQ() {
		Iterator<GiaoDich> itr = ls.iterator();
		while (itr.hasNext()) {
			GiaoDich gd = (GiaoDich) itr.next();
			System.out.println(gd);
		}
	}
}
