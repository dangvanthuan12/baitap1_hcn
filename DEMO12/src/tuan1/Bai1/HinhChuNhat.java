package tuan1.Bai1;

import java.util.Scanner;

public class HinhChuNhat {
	// Khai báo thuộc tính
	double chieuDai;
	private double chieuRong;
	// Đóng gói
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double cd) {
		if (cd>0) {
			this.chieuDai = cd;
		} else {
			System.out.println("1");
		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double cr) {
		if (cr>0) {
			this.chieuRong = cr;
		} else {
			System.out.println("2");
		}
	}
	public HinhChuNhat(double cd, double cr) {
		this.chieuDai = cd;
		this.chieuRong = cr;
	}
	public HinhChuNhat() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}
