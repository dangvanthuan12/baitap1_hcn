package baiTap1;

import java.util.Scanner;// import các gói vào

public class HinhChuNhat {
	// Khai báo thuộc tính
	public double chieuDai;
	public double chieuRong;
	// Đóng gói get set
	private double getChieuDai() {
		return chieuDai;
	}

	private void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	private double getChieuRong() {
		return chieuRong;
	}

	private void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	// hàm tạo 
	
	
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public HinhChuNhat() {
		
	}
	// Cài đặt các phương thức
		public double getDienTich() {
			return this.chieuDai*this.chieuRong;
		}
		public double getChuVi() {
			return (this.chieuDai+this.chieuRong)*2;
		}
}
