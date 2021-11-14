package tuan3.Bai6;

import java.util.Scanner;

public class TestHTP {
	public static HangThucPham nhapThucPham() {

		HangThucPham h1 = new HangThucPham();

		Scanner sc = new Scanner(System.in);
		boolean kt = true;
		boolean th = true;
		System.out.println("Nhập mã hàng : ");
		h1.setMaHang(sc.nextInt());
		// sc.nextLine();
		do {
			System.out.println("Nhập tên hàng : ");
			h1.setTenHang(sc.nextLine());
		} while (h1.kiemTraTenHang(kt));
		System.out.println("Nhập đơn giá : ");
		h1.setDonGia(sc.nextDouble());
		do {
			System.out.println("Ngày sản xuất");
			System.out.println("ngày");
			int ngaySX = sc.nextInt();
			System.out.println("tháng:");
			int thangSX = sc.nextInt();
			System.out.println("Năm");
			int namSX = sc.nextInt();
			h1.setNSX(namSX, thangSX, ngaySX);
			System.out.println("ngày hết hạn : ");
			System.out.println("ngày");
			int ngayHH = sc.nextInt();
			System.out.println("tháng:");
			int thangHH = sc.nextInt();
			System.out.println("Năm");
			int namHH = sc.nextInt();
			h1.setHSD(namHH, thangHH, ngayHH);
		} while (h1.kiemTraNgay(th));
		return h1;
	}

	public static void main(String[] args) {
		int chon;
		Scanner sc = new Scanner(System.in);
		ListHTP ls = new ListHTP(2);
		HangThucPham tp = new HangThucPham();
		do {

			System.out.println("\t\t\tCHƯƠNG TRÌNH HÀNG THỰC PHẨM\n");
			System.out.println("1. Nhập hàng thực phẩm");
			System.out.println("2. In hàng thực phẩm");
			System.out.println("3. Xóa hàng thực phẩm");
			System.out.println("4. Sắp xếp hàng thực phẩm");
			System.out.println("Vui lòng chọn từ 1-4 và thoát chon 13");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				ls.themTP(nhapThucPham());
				break;
			}
			case 2: {
				tp.tieuDe();
				ls.inKetQua();
				break;
			}
			case 3: {
				System.out.println("Nhập mã hàng cần xóa");
				int ma = sc.nextInt();

				ls.xoaHang(ls.timMa(ma));
				break;
			}
			case 4: {
				ls.sapXep();
				ls.inKetQua();
				break;
			}
			default:
				break;
			}
		} while (chon != 13);

	}
}
