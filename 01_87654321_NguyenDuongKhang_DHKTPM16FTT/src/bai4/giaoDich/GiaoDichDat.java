package bai4.giaoDich;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	@Override
	public double getThanhTien() {
		if (getLoaiDat() == "A") {
			return getDonGia() * getDienTich() * 1.5;
		} else {
			return getDonGia() * getDienTich();
		}
	}

	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	@Override
	public String toString() {
		String s = "";
		s += s.format("%17s|%15s|", getLoaiDat(), ft.format(getThanhTien()));
		return super.toString() + s;
	}

}
