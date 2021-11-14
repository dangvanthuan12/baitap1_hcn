package tapHop;

public class SinhVien {
	private String maSV;
	private String tenSV;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public SinhVien() {
	}
	public SinhVien(String maSV, String tenSV) {
		this.maSV = maSV;
		this.tenSV = tenSV;
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", tenSV=" + tenSV + "]";
	}
	

}
