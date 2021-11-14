package dongGoi;

public class HinhHoc {
	private String tenHinh;
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
	
	
	

}
