package bai1.HinhChuNhat;

import java.util.Date;
import java.util.GregorianCalendar;

public class KieuNgay {
	public String hoTen;
	public Date ngaySinh;
	public GregorianCalendar ngaySinhNhat;
	final double PI=3.14;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public GregorianCalendar getNgaySinhNhat() {
		return ngaySinhNhat;
	}
	public void setNgaySinhNhat(GregorianCalendar ngaySinhNhat) {
		this.ngaySinhNhat = ngaySinhNhat;
	}
	public KieuNgay() {}
	
	public KieuNgay(String hoTen, GregorianCalendar ngaySinhNhat) {
		this.hoTen = hoTen;
		this.ngaySinhNhat = ngaySinhNhat;
	}
	public static void main(String[] args) {
		 KieuNgay kn= new KieuNgay();
		 KieuNgay kn2 = new KieuNgay("Trần Nam", new GregorianCalendar(1997,01,01));
		 

	}

}
