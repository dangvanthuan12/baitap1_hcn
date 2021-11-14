package thucHanhTuan1;

public class HinhChuNhat {
	// khai báo các thuộc tính
	private double chieuDai;
	private double chieuRong;
	// Đóng gói cho thuộc tính
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai=d;
		} else {
			System.out.println("Lỗi chiều dài lớn hơn 0");
		}
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuRong=r;
		} else {
			System.out.println("Lỗi chiều rộng lớn hơn 0");
		}
	}
	public double getChieuRong() {
		return this.chieuRong;
	}
	// Tạo constructor ( Hàm tạo để khởi tạo đố tượng)
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		this.chieuDai=d;
		this.chieuRong=r;
	}
	// phương thức tính diện tích
	public double tinhDienTich(double d, double r) {
		return d*r;
	}
	// phương thức tính chu vi
	public double tinhChuVi(double d, double r) {
		return (d+r)*2;
	}
	// mẫu in kết quả override (toString)
	@Override
	public String toString() {
		String s="";
		s+=s.format("Chiều dài là: %4s, Chiều rộng là: %4s, Chu vi là: %5s, Diện tích là: %4s", 
				getChieuDai(), getChieuRong(),tinhChuVi(getChieuDai(), getChieuRong()), 
				tinhDienTich(getChieuDai(), getChieuRong())) ;
		return s;
	}
	

}
