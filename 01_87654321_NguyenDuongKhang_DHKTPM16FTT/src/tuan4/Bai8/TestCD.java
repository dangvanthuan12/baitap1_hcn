package tuan4.Bai8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCD {
	public static CD nhapCD() {
		System.out.println("Nhập thông tin CD");
		int maCD;
		String tuaCD;
		String caSy;
		String ngayS;
		Date ngayPH=null;
		int soBH;
		double giaThanh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã CD:");
		maCD = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập tựa CD:");
		tuaCD=sc.nextLine();
		System.out.println("Nhập họ tên ca sỹ:");
		caSy = sc.nextLine();
		System.out.println("Nhập ngày phát hành dạng: dd/MM/yyyy");
		ngayS=sc.nextLine();
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayPH= fd.parse(ngayS);
		} catch (Exception e) {
			System.out.println("lỗi ngày");
		}
		System.out.println("Nhập số bài hát:");
		soBH=sc.nextInt();
		System.out.println("Nhập giá CD:");
		giaThanh= sc.nextDouble();
		CD cdr= new CD(maCD, tuaCD, caSy, ngayPH, soBH, giaThanh);
		return cdr;
	}
	
	public static void main(String[] args) throws ParseException {
		CD cd = new CD();
		String ngay = "10/10/2011";
		Date ngayPH;
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		ngayPH = fd.parse(ngay);
		CD cd1 = new CD(123456789, "Mùa Xuân", "Phi Nhung", ngayPH, 10, 2000);
		cd.tieuDe();
		ListCD ls = new ListCD(2);
		ls.themCD(cd1);
		ls.inKetQua();
		ls.themCD(nhapCD());
		ls.sapXep();
		cd.tieuDe();
		ls.inKetQua();
		System.out.println("Tổng tiền các CD: "+ls.tong());
		

	}
}
