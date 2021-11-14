package tapHop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import bai5.chuong4.KhachHang;

public class ListSVSort {
	List<SinhVien> ls;

	public ListSVSort() {
		ls = new ArrayList<SinhVien>();
	}

	public boolean themSV(SinhVien sv) {
		for (SinhVien s : ls) {
			if (s.getMaSV().equalsIgnoreCase(sv.getMaSV())) {
				return false;
			}
		}
		return ls.add(sv);
	}

	public boolean xoa(String ma) {
		for (SinhVien sv : ls) {
			if (sv.getMaSV().equalsIgnoreCase(ma)) {
				return ls.remove(sv);
			}
		}
		return false;
	}

	public boolean capNhat(String ma, String ten) {
		for (SinhVien sv : ls) {
			if (sv.getMaSV().equalsIgnoreCase(ma)) {
				sv.setTenSV(ten);
				return true;
			}
		}
		return false;
	}

	public SinhVien timSV(String ma) {
		for (SinhVien sv : ls) {
			if (sv.getMaSV().equalsIgnoreCase(ma)) {
				return sv;
			}
		}
		return null;
	}

	public boolean capNhatSV(String ma, String ten) {
		SinhVien k = timSV(ma);
		int viTri = -1;
		if (k != null) {
			if (k instanceof SinhVien) {
				((SinhVien) k).setTenSV((ten));
				viTri = ls.indexOf(k);
				ls.set(viTri, k);
				return true;
			}
		}
		return false;
	}

	public void inKQ() {
		Iterator<SinhVien> itr = ls.iterator();
		while (itr.hasNext()) {
			SinhVien sv = (SinhVien) itr.next();
			System.out.println(sv);
		}
	}

	public void sapXepMa() {
		Collections.sort(ls, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				String x = new String(o1.getMaSV());
				String y = new String(o2.getMaSV());
				// sắp xếp tăng dần
				// return x.compareToIgnoreCase(y);
				// sắp xếp giảm dần
				return y.compareToIgnoreCase(x);
			}
		});

	}
}