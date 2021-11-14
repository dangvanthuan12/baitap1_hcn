package tranKhang8432112345;

import java.util.Calendar;

public class GiaoDichNha1 extends GiaoDich1 {
	private String loaiNha, diaChi;

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	// construtor

	@Override
	public double getThanhTien() {
		if (getLoaiNha()=="Cao cấp") {
			return getDienTich()*getDonGia();
		} else {
			return getDienTich()*getDonGia()*0.9;
		}
	}

	public GiaoDichNha1(String maGD, Calendar ngayGD, String loaiNha, String diaChi, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	// Tiêu đề
	public static void inTieuDeGNha() {
		System.out.println("\t\t\tCHUONG TRINH QUAN LY GIAO DICH");
		for (int i = 0; i < 84; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-10s|%-15s|%-15s|%-10s|%-15s|\n", "Mã GD", "Ngày GD", "Đơn giá", "Diện tích",
				"Loại nhà", "Thành tiền");

		for (int i = 0; i < 84; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		String s = "";
		s += s.format("%-10s|%-15s|", getLoaiNha(), ft.format(getThanhTien()));
		return super.toString() + s;
	}


}
