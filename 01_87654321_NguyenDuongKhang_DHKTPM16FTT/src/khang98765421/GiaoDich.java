package khang98765421;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public abstract class GiaoDich {
	protected String maGD;
	protected Calendar ngayGD;
	protected double donGia;
	protected double dienTich;
	// Đong gói

	public abstract double getThanhTien();

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

	// constructor
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	// Cài đặt tiêu đề
	public static void inTeuDe() {
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIAO DỊCH");
		for (int i = 0; i < 93; i++) {
			System.out.printf("-");

		}
		System.out.println();
		System.out.printf("|%-12s|%-12s|%-15s|%-15s|%-15s|%-15s|\n", "Mã giao dịch", "Ngày giao dịch", "Đơn giá",
				"Diện tích", "Loại đất", "Thành tiền");
		for (int i = 0; i < 93; i++) {
			System.out.printf("-");

		}
		System.out.println();
	}
	// Hashcode
	
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
		GiaoDich other = (GiaoDich) obj;
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
	DateFormat fd = DateFormat.getDateInstance(3, regional);
	NumberFormat ft = NumberFormat.getCurrencyInstance(regional);

	@Override
	public String toString() {
		String s = "";
		s += s.format("|%-12s|%-14s|%-15s|%-15s|", getMaGD(), fd.format(getNgayGD().getTime()), ft.format(getDonGia()),
				getDienTich());
		return s;
	}

}
