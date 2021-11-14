package tuan11.bai5;

import java.util.Calendar;

public class KhachHangVN extends KhachHang {
	private String doiTuong;
	final double DMSH=50, DMKD=100, DMSX=200;
	// get set
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String dt) {
		this.doiTuong = dt;
	}
	@Override
	public double getThanhTien() {
		double tt=0;
	if (getDoiTuong().equalsIgnoreCase("San Xuat"))
		if (getSoKw()>DMSX) {
			tt=getDonGia()*DMSX+(getSoKw()-DMSX)*getDonGia()*2.5;
		} else {
			tt=getDonGia()*getSoKw();
		}
	if (getDoiTuong().equalsIgnoreCase("Kinh doanh"))
		if (getSoKw()>DMKD) {
			tt=getDonGia()*DMKD+(getSoKw()-DMKD)*getDonGia()*2.5;
		} else {
			tt=getDonGia()*getSoKw();
		}
	if (getDoiTuong().equalsIgnoreCase("Sinh hoat"))
		if (getSoKw()>DMSH) {
			tt=getDonGia()*DMSH+(getSoKw()-DMSH)*getDonGia()*2.5;
		} else {
			tt=getDonGia()*getSoKw();
		}
		return tt;
	}
	// constructor
	public KhachHangVN() {
		
	}
	public KhachHangVN(String maKH, String hoTen, Calendar ngayLapHD, double soKw, double donGia, String dt) {
		super(maKH, hoTen, ngayLapHD, soKw, donGia);
		this.doiTuong=dt;
	}

	@Override
	public String toString() {
		String s1="", s2="";
		s1=s1.format("%-10s|", getDoiTuong());
		s2=s2.format("%18s|", super.tf.format(getThanhTien()));
		return super.toString()+s1+s2;
	}
}
