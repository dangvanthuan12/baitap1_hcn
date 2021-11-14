package HangThucPham;

import java.util.Scanner;

public class TestHTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Chuon");
			HangThucPham h1 = new HangThucPham();
			Scanner sc = new Scanner(System.in);
			boolean kt = true;
			boolean th = true;
			System.out.println("Nhap Ma Hang");
			h1.setMaHang(sc.nextInt());
			sc.nextLine();
			
			do {
				System.out.println("Nhập tên hàng");
				h1.setTenHang(sc.nextLine());
			}while(h1.kiemTraTenHangHoa(kt));
			System.out.println("Nhập Đơn Giá");
			h1.setDonGia(sc.nextDouble());
			do {
				System.out.println("Ngày sản xuất ");
				System.out.println("Ngày : ");
				int ngaySX= sc.nextInt();
				System.out.println("Tháng : ");
				int thangSX= sc.nextInt();
				System.out.println("Năm : ");
				int namSX= sc.nextInt();
				
				h1.setNSX(thangSX, namSX, ngaySX);
				System.out.println("Ngày hết hạn ");
				System.out.println("Ngày : ");
				int ngayHH = sc.nextInt();
				System.out.println("Tháng  : ");
				int thangHH = sc.nextInt();
				System.out.println("Năm  : ");
				int namHH = sc.nextInt();
			}while(h1.KiemTraNgay(th));
			h1.tieuDe();
			System.out.println(h1);
	}

}
