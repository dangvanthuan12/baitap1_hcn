package modul3;

public class TestListSV {

	public static void main(String[] args) {
		ListSV ls = new ListSV(2);
		SinhVien sv1= new SinhVien("12345678", "Dương Khang");
		SinhVien sv2= new SinhVien("1245679", "Dương Quá");
		SinhVien sv3 = new SinhVien("12345698", "Trương Tham");
		ls.themSV(sv1);
		ls.inDanhSachSV();
		ls.themSV(sv2);
		ls.themSV(sv3);
		System.out.println("Danh sách sinh viên");
		ls.inDanhSachSV();
	}

}
