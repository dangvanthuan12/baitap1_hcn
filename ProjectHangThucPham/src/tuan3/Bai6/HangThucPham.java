package tuan3.Bai6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.*;

public class HangThucPham {
	// Khai báo thuộc tính cho class HangThucPham
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nSX, hSD;

	// Đóng gói các thuộc tính
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

	// khởi tạo phương thức kiểm tra tên hàng không được để trống
	public boolean kiemTraTenHang(boolean kt) {
		if (this.tenHang == "" || this.tenHang.isEmpty()) {
			System.out.println("Tên hàng không được để trống : ");
		} else {
			kt = false;
		}
		return kt;
	}

	// khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
	public boolean kiemTraNgay(boolean kt) {
		if (this.getnSX().compareTo(this.gethSD()) < 0) {
			kt = false;
		} else {
			System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
		}
		return kt;
	}

	public boolean testTrangThaiHSD() {
		Date ngayHT = new Date();
		// ngayHT.getTime();
		SimpleDateFormat fn = new SimpleDateFormat("dd/MM/yyyy");
		String st = fn.format(ngayHT);
		if (this.gethSD().getTime()>(ngayHT.getTime())) {
			return false;
		} else {
			return true;
		}
	}

	public void tieuDe() {
		System.out.printf("\t\t\tCHƯƠNG TRÌNH HÀNG THỰC PHẨM\n");
		for (int i = 0; i < 94; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-30s|%-12s|%-12s|%-12s|%-12s|\n", "Mã hàng", "Tên hàng", "Đơn giá", "Ngày SX",
				"Ngày HH", "Trạng thái");
		for (int i = 0; i < 94; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	@Override
	// khởi tạo phương thức toString
	public String toString() {
		// sử dung phương thức Locale để biến đổi theo tiền tệ việt nam
		Locale localeVN = new Locale("vi", "VN");
		//LocalDate lc = new Locale(language, country)
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String str = numberFormat.format(donGia);
		// sử dụng phương thức SimpleDateFormat để biến đổi ngày tháng năm theo dạng
		// "dd/MM/yyyy"
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str1 = simpleDateFormat.format(nSX);
		String str2 = simpleDateFormat.format(hSD);
		String tt = "";
		if (testTrangThaiHSD() == true) {
			tt = "Còn hạn";
		} else {
			tt = "Hết hạn";
		}
		String s = "";
		s += s.format("|%-12s|%-30s|%-12s|%-12s|%-12s|%-12s|", getMaHang(), getTenHang(), str, str1, str2, tt);
		return s;
	}
}
