package chuong1.Tuan1.Bai1;

import java.util.Scanner;

public class TestKQ {

	public static void main(String[] args) {
		
		HinhHoc hc= new HinhHoc(23, 12);
		//in kết quả
		System.out.println(hc);
		// Nhap từ bàn phím
		HinhHoc hh= new HinhHoc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài:");
		double dai=sc.nextDouble();
		hh.setcDai(dai);
		
		sc.nextLine();
		System.out.println("Nhập chiều rộng");
		double rong=sc.nextDouble();
		hh.setcRong(rong);
		System.out.println("Chiều dài: "+hh.getcDai());
		System.out.println("Chiều rộng: "+hh.getcRong());
		
		// in kết quả
		hh.getChuVi(hh.getcDai(),hh.getcRong());
		System.out.println(hh);
		//In Tieu mẫu tự định nghĩa
		hh.tieuDe();
		
		

	}

}
