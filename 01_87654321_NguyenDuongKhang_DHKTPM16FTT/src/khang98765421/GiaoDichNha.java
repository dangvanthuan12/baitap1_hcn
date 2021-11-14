package khang98765421;

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
		if (getLoaiNha() == "Cao cap") {
			return getDienTich() * getDonGia();
		} else {
			return getDienTich() * getDonGia() * 0.9;
		}
		// TODO Auto-generated method stub
	}

	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%-12s|%-25s|%15s|", 
				getLoaiNha(), getDiaChi(),ft.format(getThanhTien()));
		return super.toString();
	}

}
