package demo123456789;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;
	//get set

	public String getLoaiDat() {
		return loaiDat;
	}


	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	
// constructor
	
	@Override
	public double getThanhTien() {
		if (getLoaiDat().equalsIgnoreCase("A")) {
			return getDienTich()*getDonGia()*1.5;
		} else {
			return getDienTich()*getDonGia();
		}
		
	}

public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String ld) {
	super(maGD, ngayGD, donGia, dienTich);
	this.loaiDat=ld;
}
@Override
public String toString() {
	String s1="";
	s1=s1.format("%8s|%23s|", getLoaiDat(), super.tf.format(getThanhTien()));
	return super.toString()+s1;
}


}
