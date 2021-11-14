package tuan1.Chuong1.Bai1a;

public class SinhVien {
	//Khai báo (Đinh nghĩa các thuộc tính)
	private String hoTen;
	private double diemToan;
	private double diemVan;
	// Đóng gói các thuộc tính
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(double diemVan) {
		this.diemVan = diemVan;
	}
	// Tạo constructor (Hàm tạo hay còn gọi cấu tử)
	/**
	 * Đây là constructor mặc định 
	 */
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String ht, double dt, double dv) {
		this.hoTen = ht;
		this.diemToan = dt;
		this.diemVan = dv;
	}
	// Tao phương thức tính điểm trung bình
	public double getDiemTB() {
		
		return (this.diemToan+this.diemVan)/2;
		
	}
	
	
	
	
	
	
}
