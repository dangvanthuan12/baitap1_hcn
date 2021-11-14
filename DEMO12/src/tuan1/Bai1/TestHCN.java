package tuan1.Bai1;

import java.util.Scanner;

public class TestHCN {

	public static void main(String[] args) {
		
		HinhChuNhat hc1 = new HinhChuNhat(10,5);
		System.out.println("Chiều cua hc1: "+hc1.chieuDai);
		System.out.println("Chiều rộng hc1: " + hc1.chieuRong);
		HinhChuNhat hc2 = new HinhChuNhat();
		hc2.setChieuDai(20);
		hc2.setChieuRong(12);
		System.out.println("Chiều dài của hc2: "+hc2.chieuDai);
		System.out.println("Chiêu rộng của hc2: "+hc2.chieuRong);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị từ bàn phím:");
		HinhChuNhat hc3= new HinhChuNhat();
		System.out.println("Nhập chiều dài của hình chữ nhật hc3:");
		double d= sc.nextDouble();
		hc3.setChieuDai(d);
		System.out.println("Nhập chiều rộng của hình chữ nhật hc3:");
		hc3.setChieuRong(sc.nextDouble());
		System.out.println("Chiều dài hc3: "+hc3.chieuDai);
		System.out.println("Chiều rộng hc3 "+hc3.chieuRong);

	}

}
