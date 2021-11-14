
public abstract class HinhHoc {
	// Encapsulation: Tính chất che dấu bảo vệ, ràng buộc dữ liệu không cho phép truy xuất trực tiếp
	// Dùng 2 phương thức get set, phương thức truy xuất private 
	protected String tenHinh;
	public void setTenhinh(String th) {
		if (th!=null) {
			this.tenHinh=th;
		} else {
			System.out.println("1");
		}	
	}
	public String getTenHinh() {
		return this.tenHinh;
	}
	// constructor
	public HinhHoc() {}
	public HinhHoc(String tenHinh) {
		
		this.tenHinh = tenHinh;
	}
	// Tính chất trừu tượng (Phương thức trừu tượng)
	public abstract double chuVi();
	
	
	

}
