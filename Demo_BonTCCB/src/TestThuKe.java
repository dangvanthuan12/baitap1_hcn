
public class TestThuKe {
public static void main(String[] args) {
	// Polymophism Cùng một kiểu DL HinhHoc nhưng các đối tượng h0, h1, h2 thể hiện nhiều hình thái khác nhau
	// HinhCN(...), HinhHoc(...), HinhTron(...) thừa kế thuộc tính tên hình của HinhHoc;
	 HinhHoc h1= new HinhCN("HCN", 20, 5);
	 //Không thừa kế
	 HinhHoc h0= new HinhHoc();
	 HinhHoc h2 =new HinhTron("Hình tròn",10);
}
}
