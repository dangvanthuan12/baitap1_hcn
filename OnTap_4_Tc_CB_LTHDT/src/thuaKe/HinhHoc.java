package thuaKe;

public abstract class HinhHoc {
	protected String tenHinh;
	// Encapsulation (đóng gói)
	// Che dấu bảo vệ ràng buộc tránh truy xuất trực tiếp đến thuộc tính...
	// cho truy xuất gián tiếp qua hai pt get và set.
	public String getTenHinh() {
		return tenHinh;
	}
	public void setTenHinh(String ten) {
		if (ten!=null) {
			this.tenHinh = ten;
		} else {
			System.out.println("1");
		}
	}
	public HinhHoc(String tenHinh) {
		this.tenHinh = tenHinh;
	}
	public HinhHoc() {}
	
	// Tính chất thừa kế
	// Một class B thừa hưởng thuộc tính và phương thức từ class A 
	//thì ta gọi class B thừa kế Class A. Class B gọi class con, class A gọi là Class cha
	// A gọi lớp cơ sở, B gọi lớp dẫn xuất
	// Tính chất đa hình:
	// các đối tượng có cùng kiểu dữ liêu nhưng thể hiện nhiều hình thái khác nhau 
	// tùy theo hoàn cảnh khác nhau
	// Tính trừu tượng: 
	//- là tính chỉ nêu vấn đề khái quát hóa, không nêu các thuộc tính vấn đề chi tiết
	// class trừu tượng (abstract) là class chứa phương thức trừu tượng
	// phương thức trừu tượng là phương thức chỉ có phần tên,
	// phương thức không có thân ( không nêu chi tiết code nội dung của pt)
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();
	
	
}
