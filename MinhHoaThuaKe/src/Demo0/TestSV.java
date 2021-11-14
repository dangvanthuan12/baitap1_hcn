package Demo0;

public class TestSV {

	public static void main(String[] args) {
		// Khởi tạo đối tượng sv1
		SinhVien sv1= new SinhVien();
		sv1.setMaSV(1000);
		sv1.setHoTen("Trần Anh Khoa");
		System.out.println(sv1.getMaSV());
		System.out.println(sv1.getHoTen());
		// Khởi tạo đối tượng sv2
		SinhVien sv2 = new SinhVien(1001, "Trần Anh");
		System.out.println(sv2.getMaSV());
		System.out.println(sv2.getHoTen());
		
	}

}
