package tuan11.bai5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class KhachHang {
	protected String maKH, hoTen;
	protected Calendar ngayLapHD;
	protected double soKw, donGia;
	// Encapsulation
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Calendar getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(Calendar ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public double getSoKw() {
		return soKw;
	}
	public void setSoKw(double soKw) {
		this.soKw = soKw;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	// khai phuong thức abstract
	public abstract double getThanhTien();
	// constructor
	public KhachHang(String maKH, String hoTen, Calendar ngayLapHD, double soKw, double donGia) {
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLapHD = ngayLapHD;
		this.soKw = soKw;
		this.donGia = donGia;
	}
	public KhachHang() {
		
	}
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	DecimalFormat tf = new DecimalFormat("#,###.00 VND");
	// tao mẫu in kết quả
	public void tieuDeNN() {
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-10s|%-25s|%10s|%-15s|%-18s|%-10s|%-18s|\n", "Ma KH", "Ho ten","Ngay LHD", "So Kw", "Don Gia","Quoc tich", "Thanh Tien");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	public void tieuDeVN() {
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-10s|%-25s|%10s|%-15s|%-18s|%-10s|%-18s|\n", "Ma KH", "Ho ten","Ngay LHD", "So Kw", "Don Gia","Doi tuong", "Thanh Tien");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	@Override
	public String toString() {
		String s="";
		s=s.format("|%-10s|%-25s|%10s|%15s|%18s|", getMaKH(),getHoTen(),
				df.format(getNgayLapHD().getTime()), getSoKw(), tf.format(getDonGia()));
		return s;
	}
	
	

}
