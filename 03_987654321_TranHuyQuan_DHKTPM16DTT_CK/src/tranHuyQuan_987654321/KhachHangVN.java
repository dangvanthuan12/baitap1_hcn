package tranHuyQuan_987654321;

import java.util.Calendar;

public class KhachHangVN extends KhachHang {
	private String doiTuong;
	final double DMSH=50, DMKD=100, DMSX=200;
	// dong goi


	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String dt) {
		if (dt=="SINH HOẠT" || dt=="KINH DOANH"|| dt=="SẢN XUẤT") {
			this.doiTuong = dt;
		} else {
			System.out.println("Lỗi");
		}
	}
	// constructor
	public KhachHangVN(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW, String doiTuong) {
		super(maKH, hoTenKH, ngayLapHD, donGia, soKW);
		this.doiTuong = doiTuong;
	}
	public KhachHangVN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHangVN(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW) {
		super(maKH, hoTenKH, ngayLapHD, donGia, soKW);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getThanhTien() {
		double tt=0;
		if (getDoiTuong()=="SẢN XUẤT") 
			if (getSoKW()>DMSX) {
				tt=getDonGia()*DMSX +(getSoKW()-DMSX)*2.5;
			} else {
				tt= getDonGia()*getSoKW();
			}
		if (getDoiTuong()=="KINH DOANH") 
			if (getSoKW()>DMKD) {
				tt=getDonGia()*DMKD +(getSoKW()-DMKD)*2.5;
			} else {
				tt= getDonGia()*getSoKW();
			}
		if (getDoiTuong()=="SINH HOẠT") 
			if (getSoKW()>DMSH) {
				tt=getDonGia()*DMSH +(getSoKW()-DMSH)*2.5;
			} else {
				tt= getDonGia()*getSoKW();
			}
		return tt;
	}
	// toString
	@Override
	public String toString() {
		String s1="", s2="";
		s1=s1.format("%-10s|",getDoiTuong());
		s2=s2.format("%15s|",super.sf.format(getThanhTien()));
		return super.toString()+s1+s2;
	}
}
