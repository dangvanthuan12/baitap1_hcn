package chuong1.Tuan1.Bai1;

public class TestSinhVien {

	public static void main(String[] args) {
		// khởi tạo sinh vien có field
		SinhVien sv1= new SinhVien("Trần A", 15, 6, 7,true);
		SinhVien sv2= new SinhVien("Trần A", -15, 6, 7,true);
		System.out.println(sv1);
		System.out.println(sv2);
		// khởi tạo sinh viên không đối
		SinhVien sv3= new SinhVien();
		sv3.setHoTen("Trần Anh");
		sv3.setTuoi(-17);
		sv3.setDiemToan(7.5);
		sv3.setDiemVan(9);
		sv3.isGioiTinh();
		System.out.println(sv3);
		System.out.println(sv3.tuoi);
		// TODO Auto-generated method stub

	}

}
