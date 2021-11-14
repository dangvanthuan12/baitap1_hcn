package khang98765421;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;
	// Encapsulation

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	// constructor

	@Override
	public double getThanhTien() {
		if (getLoaiDat()=="A") {
			return getDienTich()*getDonGia()*1.5;
		} else {
			return getDienTich()*getDonGia();
		}
	}

	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%15s|%-15s|", getLoaiDat(),ft.format(getThanhTien()));
		return super.toString()+s;
	}

}
