package thucHanhTuan1;

import java.util.Scanner;

public class TestHCN {
	public static void main(String[] args) {
		HinhChuNhat hc1= new HinhChuNhat();
		// tạo và cập nhập cứng các giá trị 
		hc1.setChieuDai(15);
		hc1.setChieuRong(10);
		System.out.println(hc1);
		HinhChuNhat hc2 = new HinhChuNhat(20, 12);
		System.out.println(hc2);
		// Nhập từ bàn phím
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		HinhChuNhat hc3= new HinhChuNhat();
		double d= sc.nextDouble();
		hc3.setChieuDai(d);
		System.out.println("Nhập chiều rộng: ");
		double r= sc.nextDouble();
		hc3.setChieuRong(r);
		System.out.println(hc3);
		System.out.println(" chiều dài là: "+ hc3.getChieuDai());
		System.out.println("Chiều rộng là: "+ hc3.getChieuRong());
		
		
	}

}
