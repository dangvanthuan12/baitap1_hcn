package tapHop;

public class TestSVSort {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("SV0009", "Trần Khải Anh");
		SinhVien sv2 = new SinhVien("SV0000", "Lê Cảnh Chân");
		SinhVien sv3 = new SinhVien("SV0003", "Trần Khải");
		SinhVien sv4 = new SinhVien("SV0002", "Trần Hoàng");
		ListSVSort ls= new ListSVSort();
		System.out.println("Thêm vào mảng:");
		ls.themSV(sv2);
		ls.themSV(sv3);
		ls.themSV(sv1);
		ls.themSV(sv4);
		System.out.println("Xuất sinh viên:");
		ls.inKQ();
		System.out.println("Sắp xếp theo mã sinh viên giảm dần: ");
		ls.sapXepMa();
		System.out.println("Sau khi sắp xếp:");
		ls.inKQ();
		

	}

}
