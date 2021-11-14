package tuan11.bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListKH {
	ArrayList<KhachHang> ls;
	public ListKH() {
		ls= new ArrayList<KhachHang>(1);
	}
	public boolean themKH(KhachHang kh) {
		for (KhachHang k : ls) {
			if (kh.getMaKH().equalsIgnoreCase(k.getMaKH())) {
				return false;
			}
		}
		return ls.add(kh);
	}
	public void sapXep() {
		Collections.sort(ls, new Comparator<KhachHang>() {
			@Override
			public int compare(KhachHang k1, KhachHang k2) {
				String x= new String(k1.getMaKH());
				String y= new String(k2.getMaKH());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	public void sapXep2() {
		Collections.sort(ls, new Comparator<KhachHang>() {
		@Override
		public int compare(KhachHang kh1, KhachHang kh2) {
			Double x= new Double(kh1.getSoKw());
			Double y= new Double(kh2.getSoKw());
			return x.compareTo(y);
		}
		});
	}
	public boolean xoaKH(String maKH) {
		for (KhachHang k : ls) {
			if (k.getMaKH().equalsIgnoreCase(maKH)) {
				ls.remove(k);
				return true;
				
			}
		}
		return false;
	}
	
	public void xuatKH() {
		for (KhachHang k : ls) {
			if (k!=null) {
				System.out.println(k);
			}
		}
	}
}
