package quanHeLienKet;

public class MainNH_NV {

	public static void main(String[] args) {
		NganHang agribank = new NganHang("Bình Sơn");
		NhanVien nv1= new NhanVien("Dương Khang");
		System.out.println("Ngân hàng: "+agribank.getTenNH() + 
				" " + "Có nhân viên: "+nv1.getTenNV());
	}

}
