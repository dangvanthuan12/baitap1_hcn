package anhDemo;

import java.awt.List;

public class TestSV {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("123456788", "Đặng Dương Khang");
		SinhVien sv2 = new SinhVien("123456789","Trần Anh Khoa");
		SinhVien sv3 = new SinhVien("97619999", "Dương Khôi Minh");
		ListSV ls = new ListSV();
		ls.themObSV(sv1);
		ls.themObSV(sv2);
		ls.themObSV(sv3);
		// In kết quả
		System.out.println(" Sau khi thêm");
		ls.inKQ();
		ls.SapXep();
		System.out.println("Sau khi sắp xếp");
		ls.inKQ();
		ls.xoaObSV("123456788");
		System.out.println("Sau khi xóa: ");
		ls.inKQ();
		

	}

}
