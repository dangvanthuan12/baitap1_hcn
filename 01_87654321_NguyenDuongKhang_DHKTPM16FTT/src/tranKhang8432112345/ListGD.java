package tranKhang8432112345;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListGD {
	public List<GiaoDich> ls;

	public ListGD() {
		ls = new ArrayList<GiaoDich>();
	}

	public boolean themGD(GiaoDich gd) {
		for (GiaoDich g : ls)
			if (g.getMaGD().equalsIgnoreCase(gd.getMaGD()) == true)
				return false;
		return ls.add(gd);
	}

	// Phương thức xóa giao dịch theo Mã
	public boolean xoaGD(String ma) {
		for (GiaoDich g : ls)
			if (g.getMaGD().equalsIgnoreCase(ma) == true) {
				ls.remove(g);
				return true;
			}
		return false;
	}

	// Tìm kiếm Giao dịch theo mã
	public GiaoDich timKH(String ma) {
		for (GiaoDich k : ls)
			if (k.getMaGD().equalsIgnoreCase(ma) == true)
				return k;
		return null;
	}

	// Phương thức Sắp xếp theo mã
	public void sapXepMa() {
		Collections.sort(ls, new Comparator<GiaoDich>() {
			@Override
			public int compare(GiaoDich k1, GiaoDich k2) {
				String x = new String(k1.getMaGD());
				String y = new String(k2.getMaGD());
				return x.compareToIgnoreCase(y);
			}
		});
	}

	// Phương thức cập nhật đơn giá
	public boolean capNhatDonGia(String ma, double gia) {
		GiaoDich k = timKH(ma);
		int viTri = -1;
		if (k != null) {
			if (k instanceof GiaoDich) {
				((GiaoDich) k).setDonGia(gia);
				viTri = ls.indexOf(k);
				ls.set(viTri, k);
				return true;
			}
		}
		return false;
	}

	// Tính tổng tiền giao dịch
	public double tongTienGD() {
		double tt = 0;
		for (GiaoDich g : ls) {
			tt = tt + g.getThanhTien();
		}
		return tt;
	}

	public void inKQ() {
		for (GiaoDich gd : ls) {
			if (gd != null) {
				System.out.println(gd);
			}

		}
	}

}
