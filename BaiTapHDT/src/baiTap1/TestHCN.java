package baiTap1;

import java.util.Scanner;

public class TestHCN {

	public static void main(String[] args) {
		// phương thức nhập từ bàn phím
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhập chiều dài: ");
				double cd =sc.nextDouble();
				System.out.println("Nhập chiều rộng: ");
				double cr= sc.nextDouble();
				// gán giá trị vừa nhập cho đối tượng HCN
				// Khởi tạo đối tượng
				HinhChuNhat hc1= new HinhChuNhat();
				hc1.
				hc1.setChieuRong(cr);
				// xuất kết quả 
				System.out.println("Chiều rộng của hc1: " +hc1.getChieuRong());
				System.out.println("Chiêu dài của hc1: "+ hc1.chieuDai);
				System.out.println(" Chu vi HCN: "+ hc1.getChuVi());
				System.out.println("Dien Tích HCN: "+hc1.getDienTich());
				HinhChuNhat hc2 = new HinhChuNhat(200, 100);
				System.out.println("Diện tích HCN hc2: "+hc2.getDienTich());
				System.out.println(" chiêu dài cua hc2: "+hc2.getChieuDai());

	}

}
