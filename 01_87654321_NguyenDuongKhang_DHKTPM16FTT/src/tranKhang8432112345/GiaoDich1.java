package tranKhang8432112345;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public abstract class GiaoDich1 {
	protected String maGD;
	protected Calendar ngayGD;
	protected double donGia;
	protected double dienTich;

	public abstract double getThanhTien();

	// Đóng gói
	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public Calendar getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Calendar ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	// Tao constructor
	public GiaoDich1() {

	}

	public GiaoDich1(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	// Hashcode kiểm tra sự trùng mã

	// xây dựng tiêu đề
	public static void inTieuDe() {
		System.out.println("\t\t\tCHUONG TRINH QUAN LY GIAO DICH");
		for (int i = 0; i < 57; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-10s|%-15s|%-15s|\n", "Mã GD", "Ngày GD", "Đơn giá", "Diện tích");

		for (int i = 0; i < 57; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maGD == null) ? 0 : maGD.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich1 other = (GiaoDich1) obj;
		if (maGD == null) {
			if (other.maGD != null)
				return false;
		} else if (!maGD.equals(other.maGD))
			return false;
		return true;
	}

	// Dùng đơn vị theo Regional setting
	Locale regional = new Locale("vi", "VN");
	// Các tham số cho định dạng cho date (0-3)
	DateFormat fd = DateFormat.getDateInstance(2, regional);
	NumberFormat ft = NumberFormat.getCurrencyInstance(regional);

	@Override
	public String toString() {

		String s = "";
		s += s.format("|%-12s|%-10s|%15s|%15s|", getMaGD(), fd.format(getNgayGD().getTime()), ft.format(getDonGia()),
				getDienTich());
		return s;
	}

}
