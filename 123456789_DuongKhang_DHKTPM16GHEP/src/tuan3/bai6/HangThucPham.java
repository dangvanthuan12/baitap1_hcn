package tuan3.bai6;

import java.util.Calendar;
import java.util.Date;

public class HangThucPham {
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nSX, hSD;

	// dong goi
	public int getMaHang() {
		return maHang;
	}

	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Date getnSX() {
		return nSX;
	}

	public void setnSX(Date nSX) {
		this.nSX = nSX;
	}

	public Date gethSD() {
		return hSD;
	}

	public void sethSD(Date hSD) {
		this.hSD = hSD;
	}

	// tao constructor
	// Khởi tạo constructor mặc định
	public HangThucPham() {
	}

	// Khởi tạo constructor có tham số
	public HangThucPham(int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.nSX = nSX;
		this.hSD = hSD;
	}

	// Khởi tạo phương thức để nhập năm tháng ngày sản xuất
	public void setNSX(int year, int month, int day) {
		// khái báo ngaySX kiểu Calendar
		Calendar ngaySX = Calendar.getInstance();
		// set ngaySX vì tháng trong java tính từ 0, khi khởi tạo tăng lên 1 do vậy trừ
		// 1
		ngaySX.set(year, month - 1, day);
		this.nSX = ngaySX.getTime();
	}

	// Khởi tạo phương thức để nhập hạn sử dụng
	public void setHSD(int year, int month, int day) {
		Calendar ngayHSD = Calendar.getInstance();
		ngayHSD.set(year, month - 1, day);
		this.hSD = ngayHSD.getTime();
	}

}
