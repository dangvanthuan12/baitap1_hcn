package bai5.chuong4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class KhachHang {
	//mã khách hàng, họ tên, ngày lập hoá đơn, đơn giá, số kw, 
	protected String maKH, hoTenKH;
	protected Calendar ngayLapHD;
	protected double donGia, soKW;
	//Phương thức abstract
	public abstract double getThanhTien();
	//Đóng gói dữ liệu
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public Calendar getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(Calendar ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}
	// Tạo constructor
	public KhachHang(String maKH, String hoTenKH, Calendar ngayLapHD, 
			double donGia, double soKW) {
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.ngayLapHD = ngayLapHD;
		this.donGia = donGia;
		this.soKW = soKW;
	}
	public KhachHang() {
		
	}
	public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public DecimalFormat sf= new DecimalFormat("#,###.00 VND");
	public void tieuDeVN() {
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Mã Khách hàng", "Tên khách hàng", "Ngày lập hóa đơn","Đơn giá","Số KW","Đối tượng","Thành tiền");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
	}
	public void tieuDeNN() {
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Mã Khách hàng", "Tên khách hàng", "Ngày lập hóa đơn","Đơn giá","Số KW","Quốc tịch","Thành tiền");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
	}
	@Override
	public String toString() {
		String s="";
		s=s.format("|%-14s|%-25s|%-16s|%15s|%10s|", getMaKH(), getHoTenKH(), 
				df.format(getNgayLapHD().getTime()), sf.format(getDonGia()), getSoKW());
		return s;
	}
	
	
	
	
	
	

}
