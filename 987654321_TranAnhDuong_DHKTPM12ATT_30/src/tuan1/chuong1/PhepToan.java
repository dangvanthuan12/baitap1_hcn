package tuan1.chuong1;

import java.util.Scanner;

public class PhepToan {
	// khai báo biến
	private double soA;
	private double soB;
	// Đóng gói
	public void setSoA(double a) {
		if (a>0) {
			this.soA=a;
		} else {
			System.out.println("số a> 0");
		}
	}
	public double getSoA() {
		return this.soA;
	}
	public void setSoB(double b) {
		if (b>0) {
			this.soB=b;
		} else {
			System.out.println("b>0");
		}
	}
	public double getSoB() {
		return this.soB;
	}
	public double tongHaiSo(double c, double d) {
		return c+d;
	}
	// constructor ( Hàm tạo cho đối tượng)
	public PhepToan() {}
	public PhepToan(double a, double b) {
		this.soA=a;
		this.soB=b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị của số a: ");
		double a= sc.nextDouble();
		PhepToan pt1= new PhepToan();
		pt1.setSoA(a);
		System.out.println("Nhập vào giá trị của số b: ");
		double b= sc.nextDouble();
		pt1.setSoB(b);
		// xuất giá trị các biến vừa nhập
		System.out.println(" giá trị của số a vừa nhập: "+pt1.getSoA());
		System.out.println(" giá trị của số b vừa nhập: "+pt1.getSoB());
		System.out.println("Tổng hai số là : "+pt1.tongHaiSo(pt1.getSoA(), pt1.getSoB()));
		PhepToan pt2 = new PhepToan(-12, 13);
		System.out.println(" giá trị của số a vừa khởi tạo: "+pt2.getSoA());
		System.out.println(" giá trị của số b vừa khởi tạo từ constructor: "+pt2.getSoB());
		System.out.println("Tổng hai số là : "+pt2.tongHaiSo(pt2.getSoA(), pt2.getSoB()));
	}

}
