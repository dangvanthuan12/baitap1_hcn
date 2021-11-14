package tranKhang8432112345;

import java.util.Calendar;

public class GiaDichDat1 extends GiaoDich {
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaDichDat1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaDichDat1(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);

	}

	public GiaDichDat1(String maGD, Calendar ngayGD, String loai, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loai;
	}

	public static void inTieuDeGDD() {
		System.out.println("\t\t\tCHUONG TRINH QUAN LY GIAO DICH");
		for (int i = 0; i < 84; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-10s|%-15s|%-15s|%-10s|%-15s|\n", "Mã GD", "Ngày GD", "Đơn giá", "Diện tích",
				"Loại đất", "Thành tiền");

		for (int i = 0; i < 84; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		String s = "";
		s += s.format("%-10s|%-15s|", getLoaiDat(), ft.format(getThanhTien()));
		return super.toString() + s;
	}

	@Override
	public double getThanhTien() {
		if (getLoaiDat() == "A") {
			return getDienTich() * getDonGia() * 1.5;
		} else {
			return getDienTich() * getDonGia();
		}
	}

}
