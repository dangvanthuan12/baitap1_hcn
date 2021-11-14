package thuaKe;

public class TestDH {

	public static void main(String[] args) {
		// Minh họa cho tính chất đa hình
		//Các đối tượng h1, h2, h3 có cùng kiểu dữ liệu lớp HinhHoc 
		// nhưng thể hiện 3 hình thái HinhChuNhat,HinhTron 
		HinhHoc h1= new HinhChuNhat();
		HinhHoc h2 = new HinhTron();
	   // HinhHoc là class abstract nên 
		// không cho khởi tạo đối tượng cùng hình thái với lớp trừu tượng HinhHoc
		/// ??? no Hinhhoc h2= new HinhHoc()
	}
}
