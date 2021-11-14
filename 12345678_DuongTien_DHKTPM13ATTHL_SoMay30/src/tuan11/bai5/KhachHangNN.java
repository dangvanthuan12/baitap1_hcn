package tuan11.bai5;

import java.util.Calendar;

public class KhachHangNN extends KhachHang {
	private String quocTich;
	// get set
	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	// tinh tien
	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		return getDonGia()*getSoKw();
	}
	// tao consructor

	public KhachHangNN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHangNN(String maKH, String hoTen, Calendar ngayLapHD, double soKw, double donGia, String qt) {
		super(maKH, hoTen, ngayLapHD, soKw, donGia);
		this.quocTich=qt;
	}
	// tostring khachhangNN
	@Override
	public String toString() {
		String s1="", s2="";
		s1=s1.format("%-10s|", getQuocTich());
		s2=s2.format("%18s|", super.tf.format(getThanhTien()));
		return super.toString()+s1+s2;
	}
	

	
	

}
