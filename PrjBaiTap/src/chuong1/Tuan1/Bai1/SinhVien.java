package chuong1.Tuan1.Bai1;

public class SinhVien {
	// Khai báo các biến 
	private String hoTen;// private là phương thức truy xuất
	public int tuoi;// int kiểu dữ liệu nguyên
	private double diemToan;// kiểu dữ liệu thực
	private float diemVan;// kiểu dữ liệu
	private boolean gioiTinh;// kiểu logic True hoac false
	// Đóng gói dữ liệu Encapsulation
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String ht) {
		// thiết đặt điều kiện cho việc gán ht khác rổng cho biến hoTen;
		if (ht!=null) {
			this.hoTen = ht;
		}
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tu) {
		if (tu>0) {
			this.tuoi = tu;
		} else {
			System.out.println("1");
		}
		
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	// Tạo constructor hay hàm tạo
	public SinhVien(String hoTen, int tuoi, double diemToan, float diemVan, boolean gioiTinh) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.gioiTinh = gioiTinh;
	}
	// hàm tạo không đối 
	public SinhVien() {
		
	}

	
	public double getDiemTrungBinh() {
		return (this.diemToan+this.diemVan)/2;
	}
	// toString : in kết quả theo mẫu nay
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", tuoi=" + tuoi + ", diemToan=" + diemToan + ", diemVan=" + diemVan
				+ ", gioiTinh=" + gioiTinh + ", getDiemTrungBinh()=" + getDiemTrungBinh() + "]";
	}
	
	
	
	

}
