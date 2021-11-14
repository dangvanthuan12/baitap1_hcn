package tuan4.Bai8;

public class SinhVien {
	/*
	 * Tính chất đóng gói (Encapsulation) che dấu ẩn hóa, ràng buộc bảo vệ dữ liệu
	 * tránh việc truy xuất trực tiêp (đến các thuộc tính) dùng từ khóa private.
	 * việc truy xuất gián tiếp thông 2 phương thức get(), set() dùng từ khóa public
	 */
	private String maSV;
	private String tenSV;

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String ma) {
		if (ma != null) {
			this.maSV = maSV;
		} else {
			System.out.println("Lỗi mã khác null");
		}

	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	/*Tính chất thừa kế
	 * Một class B thừa hưởng thuộc tính và phương thức từ class A thì ta gọi class B thừa kế từ class A
	 * B class con của class A
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	

}
