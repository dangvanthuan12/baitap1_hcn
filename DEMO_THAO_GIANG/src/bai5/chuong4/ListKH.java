package bai5.chuong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ListKH {
	// Khai báo mảng ArrayList
	ArrayList<KhachHang> ls;
	// Hàm tạo khởi tạo mảng
	public ListKH() {
		ls= new ArrayList<KhachHang>(2);
	}
	// Phương thức thêm Khách hàng
	public boolean themKH(KhachHang kh) {
		for (KhachHang k : ls)
			if (kh.getMaKH().equalsIgnoreCase(k.getMaKH())==true)
				return false;
				return ls.add(kh);
	}
	// Phương thức xóa Khách hàng theo Mã
	public boolean xoaKH(String maKH) {
		for (KhachHang k : ls)
			if (k.getMaKH().equalsIgnoreCase(maKH)==true) {
				ls.remove(k);
				return true;
			}
				return false;
	}
	// Tìm kiếm khách hàng theo mã
	public KhachHang timKH(String maKH) {
		for (KhachHang k : ls)
			if (k.getMaKH().equalsIgnoreCase(maKH)==true)
				return k;
				return null;
	}
	// Phương thức Sắp xếp theo mã khách hàng
	public void sapXepMaKH() {
		Collections.sort(ls, new Comparator<KhachHang>() {
			@Override
			public int compare(KhachHang k1, KhachHang k2) {
				String x = new String(k1.getMaKH());
				String y = new String(k2.getMaKH());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	// Phương thức cập nhật tên Khách hàng
	public boolean capNhatTenKH(String maKH, String hoTenKH) {
		KhachHang k=timKH(maKH);
		int viTri=-1;
		if (k!=null) {
			if (k instanceof KhachHang) {
				((KhachHang) k).setHoTenKH(hoTenKH);
				viTri=ls.indexOf(k);
				ls.set(viTri, k);
				return true;
			}
		}
		return false;
	}
	// Phương thức xuất khách hàng
	public void inKQ() {
		for (KhachHang kh : ls) {
			if (kh!=null) {
				System.out.println(kh);
			}
			
		}
	}
	
	

}
