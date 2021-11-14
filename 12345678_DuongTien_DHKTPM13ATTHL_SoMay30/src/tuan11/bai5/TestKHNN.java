package tuan11.bai5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestKHNN {

	public static void main(String[] args) {
		Calendar ngay1 = new GregorianCalendar(2019, 9, 12);
		Calendar ngay2 = new GregorianCalendar(2019, 10, 12);
		Calendar ngay3 = new GregorianCalendar(2019, 10, 12);
		Calendar ngay4 = new GregorianCalendar(2019, 11, 12);
		Calendar ngay5 = new GregorianCalendar(2019, 1, 12);
		Calendar ngay6 = new GregorianCalendar(2019, 2, 12);
		KhachHang knn0= new KhachHangNN("12345678","Jang young kim", ngay1,100,10000, "Korea");
		KhachHang knn1= new KhachHangNN("12345678","Jang young Pack", ngay2,10,10000, "Korea");
		KhachHang knn2 = new KhachHangNN("12345679", "Sang young", ngay3, 6, 10000, "China");
		KhachHangVN kvn0 = new KhachHangVN("12345676", "Tran Anh", ngay4, 10, 20,"Sinh hoat");
		knn0.tieuDeNN();
		System.out.println(knn0);
		System.out.println(knn1);
		System.out.println(knn2);
		kvn0.tieuDeVN();
		System.out.println(kvn0);
	}

}
