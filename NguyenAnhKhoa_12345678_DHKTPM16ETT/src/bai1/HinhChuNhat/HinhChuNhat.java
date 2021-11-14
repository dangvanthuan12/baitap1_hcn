package bai1.HinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {
	// Khai báo thuộc tính
	private double chieuDai;
	private double chieuRong;
	// Đóng gói 
	public void setChieuDai(double cd) {
		if (cd>0) {
			this.chieuDai=cd;
		} else {
			System.out.println(" Lỗi 1");
		}
		
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	
	public void setChieuRong(double cr) {
		if (cr>0) {
			this.chieuRong=cr;
		} else {
			System.out.println("Lỗi 2");
		}
		
	}
	public double getChieuRong() {
		return this.chieuRong;
	}
	// Hàm tạo dùng để khởi tạo đối tượng (constructor)
	public HinhChuNhat() {}
	public HinhChuNhat(double cd, double cr) {
		if (cd>0) {
			this.chieuDai=cd;
		} else {
			System.out.println("Lỗi 3");
		}
		if (cr>0) {
			this.chieuRong=cr;
		} else {
			System.out.println("Lỗi 4");
		}	
	}
	// cài đặt phương thức tính chu vi
	public double tinhChuVi(double cd, double cr) {
		return (cd+cr)*2;
	}
	// cài đặt phương thức tính diện tích
	public void tinhDienTich(double cd, double cr) {
		double dt= cd*cr;
		System.out.println("Diện tích là: "+ dt);
	}
	public static double tinhNuaChuVi(double d, double r) {
		return d+r;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("Chiều dài là: %4s mét, Chiều rộng %4s mét", getChieuDai(), 
				getChieuRong() );
		return s;
	}
	public static void main(String[] args) {
		// khởi tạo đối tương hc không đối số
		HinhChuNhat hc = new HinhChuNhat();
		hc.setChieuDai(7);
		hc.setChieuRong(3);
		// in kết quả theo thuộc tính
		System.out.println(hc.chieuDai);
		System.out.println(hc.chieuRong);
		// Khởi tạo đối tượng hc1 có 2 đối cd và cr
		HinhChuNhat hc1 = new HinhChuNhat(16, 7);
		System.out.println(hc1.chieuDai);
		// in kết quả theo mẫu của toString
		System.out.println(hc1);
		// nhập các thuộc tính từ bàn phím
		// khởi tạo đối tượng sc của Scanner để đọc giá trị từ bàn phím vào biến nhớ
		Scanner sc = new Scanner(System.in);
		// Nhập từ bàn phím
		System.out.println("Nhập chiều dài: ");
		double cd= sc.nextDouble();
		hc.setChieuDai(cd);
		// cách khác
		System.out.println("Chiều rộng: ");
		hc.setChieuRong(sc.nextDouble());
		System.out.println(hc);
		// cách khác nhập chiều dài và chiều rộng
		System.out.println("Nhập chiều dài và chiều rộng");
		HinhChuNhat hc3= new HinhChuNhat(sc.nextDouble(), sc.nextDouble());
		System.out.println(hc3);
		System.out.println("Chu vi hình chữ nhật hc: "+hc.tinhChuVi(hc.getChieuDai(),hc.getChieuRong() ));
		hc.tinhDienTich(hc.getChieuDai(), hc.getChieuRong());
		tinhNuaChuVi(15, 2);
	}
	
	

}
