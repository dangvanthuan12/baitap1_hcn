package demoTC1;

public abstract class HinhHoc {
	protected String tenHinh;
	// Đóng gói
	public void setTenHinh(String ten) {
		try {
			if (ten!=null) {
				this.tenHinh=ten;
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	public String getTenHinh() {
		return this.tenHinh;
	}
	// constructor
	public HinhHoc() {
	}
	public HinhHoc(String th) {
		this.tenHinh = th;
	}
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();
	// Overrider và OverLoad
	

}
