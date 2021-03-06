package HangThucPham;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class HangThucPham {
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nSX, hSD;

	/**
	 * @return the maHang
	 */
	public int getMaHang() {
		return maHang;
	}

	/**
	 * @param maHang the maHang to set
	 */
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	/**
	 * @return the tenHang
	 */
	public String getTenHang() {
		return tenHang;
	}

	/**
	 * @param tenHang the tenHang to set
	 */
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	/**
	 * @return the nSX
	 */
	public Date getnSX() {
		return nSX;
	}

	/**
	 * @param nSX the nSX to set
	 */
	public void setnSX(Date nSX) {
		this.nSX = nSX;
	}

	/**
	 * @return the hSD
	 */
	public Date gethSD() {
		return hSD;
	}

	/**
	 * @param hSD the hSD to set
	 */
	public void sethSD(Date hSD) {
		this.hSD = hSD;
	}

	public HangThucPham(int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.nSX = nSX;
		this.hSD = hSD;
	}

	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Khoi tao phuong thuc NSX
	public void setNSX(int year, int month, int day) {
		Calendar ngaySX = Calendar.getInstance();
		ngaySX.set(year, month - 1, day);
		this.nSX = ngaySX.getTime();
	}

	// Khoi tao phuong thuc HSD
	public void setHSD(int year, int month, int day) {
		Calendar hanSD = Calendar.getInstance();
		hanSD.set(year, month - 1, day);
		this.nSX = hanSD.getTime();
	}

	// Khoi tao phuong thuc kiem tra hang hoa khong dc de trong
	public boolean kiemTraTenHangHoa(boolean kt) {
		if (this.tenHang == "" || this.tenHang.isEmpty()) {
			System.out.println("T??n h??ng kh??ng ???????c ????? tr???ng");
		} else {
			kt = false;
		}
		return kt;
	}

	// khoi t???o ki???m tra ng??y h???t h???ng kh??ng nh??? h??n ng??y s???n xu???t
	public boolean KiemTraNgay(boolean kt) {
		if (this.getnSX().compareTo(this.gethSD()) < 0) {
			kt = false;
		} else {
			System.out.println("H???n s??? d???ng kh??ng ???????c nh??? h??n ng??y s???n xu???t");
		}
		return kt;
	}

	public boolean testHSD() {
		Date ngayHT = new Date();
		ngayHT.getTime();
		SimpleDateFormat fn = new SimpleDateFormat("dd/MM/yy");
		String st = fn.format(ngayHT);
		if (this.gethSD().compareTo(ngayHT) < 0) {
			return false;
		} else {
			return true;
		}
	}

	public void tieuDe() {
		System.out.println("Tieu de");
		for (int i = 0; i < 94; i++) {
			System.out.println("-");
		}
		System.out.println();
		System.out.printf("|%-12s |%-30s |%-12s |%-12s |%-12s |%-12s |\n", "M?? H??ng", "T??n ????n H??ng", "????n gi??",
				"Ng??y SX", "Ng??y HH", "Tr???ng Th??i");
		for (int j = 0; j < 94; j++) {
			System.out.println("-");
		}
	}

	// Kh???i t???o ph????ng th???c toString
	@Override
	public String toString() {
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String str = numberFormat.format(donGia);
		// S??? d???ng ph????ng th???c simpledate ????? chuy???n ng??y th??ng n??m theo d???ng dd/mm/yy
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
		String str1 = simpleDateFormat.format(nSX);
		String str2 = simpleDateFormat.format(hSD);
		String tt = "";
		if (testHSD() == true) {
			tt = "Con Han";
		} else {
			tt = "Het Han";
		}
		String s = "";
		s += s.format("|%-12s |%-30s |%-12s |%-12s |%-12s |%-12s |", getMaHang(), getTenHang(), str, str1, str2, tt);
		return s;
	}
}
