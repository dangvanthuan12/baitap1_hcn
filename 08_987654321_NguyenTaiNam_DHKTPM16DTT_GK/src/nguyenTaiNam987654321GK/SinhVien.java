package nguyenTaiNam987654321GK;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private Calendar ngaySinh;
	private double hocPhi;

	// Đóng gói tạo ràng buộc
	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		try {
			if (maSV != null) {
				this.maSV = maSV;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Calendar getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Calendar ngay) {
				this.ngaySinh = ngay;	
		}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		try {
			if (hocPhi > 0) {
				this.hocPhi = hocPhi;
			}
		} catch (Exception e) {
			System.out.println("HP>0");
		}

	}
	// contructor;

	public SinhVien(String maSV, String hoTen, Calendar ngaySinh, double hocPhi) {
		super();
	 try {
		 	this.maSV = maSV;
			this.hoTen = hoTen;
			this.ngaySinh = ngaySinh;
			this.hocPhi = hocPhi;
	} catch (Exception e) {
		System.out.println(e);
	}
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSV == null) ? 0 : maSV.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		if (maSV == null) {
			if (other.maSV != null)
				return false;
		} else if (!maSV.equals(other.maSV))
			return false;
		return true;
	}

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
 Locale lc= new Locale("vi", "VN");
 DateFormat df = DateFormat.getDateInstance(0, lc);
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + df.format(ngaySinh.getTime())+ ", hocPhi=" + hocPhi + "]";
	}
	
	

}
