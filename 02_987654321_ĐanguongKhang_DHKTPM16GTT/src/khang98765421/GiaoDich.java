package khang98765421;

import java.util.Calendar;

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


	// Cài đặt tiêu đề
	public static void inTeuDe() {
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIAO DỊCH");
		for (int i = 0; i < 80; i++) {
			System.out.printf("-");

		}
		System.out.println();
		System.out.printf("|%-12s|%-12s|%-15s|%-15s|%12|%\n", "Mã giao dịch", "Ngày giao dịch", "Đơn giá", "Diện tích");
		for (int i = 0; i < 80; i++) {
			System.out.printf("-");

		}
		System.out.println();
	}

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
	public static void main(String[] args) {
		inTeuDe();
		
	}
}
