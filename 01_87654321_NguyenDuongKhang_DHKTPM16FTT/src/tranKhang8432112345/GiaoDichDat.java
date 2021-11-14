package tranKhang8432112345;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaDat;
	// Đóng gói

	public String getLoaDat() {
		return loaDat;
	}

	public void setLoaDat(String loaDat) {
		this.loaDat = loaDat;
	}
	// Tao construcor

	@Override
	public double getThanhTien() {
		double tt;
		if (getLoaDat() == "A") {
			tt = getDienTich() * getDonGia() * 1.5;
		} else {
			tt = getDienTich() * getDonGia();
		}
		return tt;
	}
	
	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGD, Calendar ngayGD, String loai, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaDat = loai;
	}
	public static void inTieuDeGDD() {
		System.out.println("\t\t\tCHUONG TRINH QUAN LY GIAO DICH");
		for (int i = 0; i < 84; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-10s|%-15s|%-15s|%-10s|%-15s|\n", "Mã GD", "Ngày GD","Đơn giá",
				"Diện tích","Loại đất","Thành tiền");
		
		for (int i = 0; i < 84; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	@Override
	public String toString() {
		String s = "";
		s += s.format("%-10s|%-15s|", getLoaDat(), ft.format(getThanhTien()));
		return super.toString() + s;
	}

}
