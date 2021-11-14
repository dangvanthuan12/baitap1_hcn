package demo123456789;

import java.util.Calendar;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha, diaChi;
	
	
	public String getLoaiNha() {
		return loaiNha;
	}


	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	// constructor
	


	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		return 0;
	}


	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String ln, String dc) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha=ln;
		this.diaChi=dc;
	}
	@Override
	public String toString() {
		String s1="";
		s1=s1.format("%-8s|%-29s|%23s|", getLoaiNha(), getDiaChi(), super.tf.format(getThanhTien()));
		return super.toString()+s1;
	}
}
