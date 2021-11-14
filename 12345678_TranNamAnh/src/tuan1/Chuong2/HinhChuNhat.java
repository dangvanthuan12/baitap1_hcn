package tuan1.Chuong2;

import java.util.Scanner;

public class HinhChuNhat {
	// khai báo thuộc tính của HCN
	private double chieuDai;
	private double chieuRong;
	// đóng gói
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai=d;
		} else {
			System.out.println("1");
		}
		
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuRong=r;
		} else {
			System.out.println("2");
		}
	}
	public double getChieuRong() {
		return this.chieuRong;
	}
	public double tinhDienTich(double d, double r) {
		return d*r;
	}
	public double tinhChuVi(double d, double r) {
		return (d+r)*2;
	}
	public static void inTieuDe() {
		System.out.println("Chương trình tính diện tích và chu vi hình chữ nhật");
		for (int i = 0; i < 56; i++) {
			System.out.print("-");
		}
		System.out.println();
		// in các nét kẻ chữ trong tiêu đề
		System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "TÊN HCN", 
				"CHIỀU DÀI","CHIỀU RỘNG",
				"CHU VI", "DIỆN TÍCH");
		for (int i = 0; i < 56; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-10s|%-10s|%-10s|%-10s|%-10s|","HCN", getChieuDai(), 
				getChieuRong(),tinhChuVi(getChieuDai(), getChieuRong()),
				tinhDienTich(getChieuDai(), getChieuRong()));
		return s;
	}
	
	public static void main(String[] args) {
		HinhChuNhat hc1= new HinhChuNhat();
		hc1.setChieuDai(10);
		hc1.setChieuRong(5);
		System.out.println(hc1.getChieuDai());
		System.out.println(hc1.getChieuRong());
		System.out.println(hc1.tinhChuVi(hc1.getChieuDai(), hc1.getChieuRong()));
		System.out.println(hc1.tinhDienTich(hc1.getChieuDai(), hc1.getChieuRong()));
		inTieuDe();
		System.out.println(hc1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài");
		HinhChuNhat hc2= new HinhChuNhat();
		hc2.setChieuDai(sc.nextDouble());
		System.out.println("Nhập chiều rộng:");
		hc2.setChieuRong(sc.nextDouble());
		inTieuDe();
		System.out.println(hc2);
		
	}
}
