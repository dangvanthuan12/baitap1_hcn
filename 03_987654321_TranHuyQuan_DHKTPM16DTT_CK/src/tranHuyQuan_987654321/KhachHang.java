package tranHuyQuan_987654321;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class KhachHang {
	// khai bao thuoc tinh
	// mã khách hàng, họ tên, ngày lập hoá đơn, đơn giá, số kw,
		protected String maKH, hoTenKH;
		protected Calendar ngayLapHD;
		protected double donGia, soKW;
		public abstract double getThanhTien();// pt ảo
	// Dong goi
		public String getMaKH() {
			return maKH;
		}
		public void setMaKH(String maKH) {
			this.maKH = maKH;
		}
		public String getHoTenKH() {
			return hoTenKH;
		}
		public void setHoTenKH(String hoTenKH) {
			this.hoTenKH = hoTenKH;
		}
		public Calendar getNgayLapHD() {
			return ngayLapHD;
		}
		public void setNgayLapHD(Calendar ngayLapHD) {
			this.ngayLapHD = ngayLapHD;
		}
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}
		public double getSoKW() {
			return soKW;
		}
		public void setSoKW(double kw) {
			try {
				if (kw>0) {
					this.soKW = kw;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		
		}
	// Contructor
		public KhachHang(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW) {
			super();
			this.maKH = maKH;
			this.hoTenKH = hoTenKH;
			this.ngayLapHD = ngayLapHD;
			this.donGia = donGia;
			this.soKW = soKW;
		}
		public KhachHang() {
			super();
			// TODO Auto-generated constructor stub
		}
	// Hashcode and Equals
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			KhachHang other = (KhachHang) obj;
			if (maKH == null) {
				if (other.maKH != null)
					return false;
			} else if (!maKH.equals(other.maKH))
				return false;
			return true;
		}

	// Tiêu đề
		public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		public DecimalFormat sf = new DecimalFormat("#,###.00 VND");

		public void tieuDeVN() {
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
			System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Mã Khách hàng", "Tên khách hàng",
					"Ngày lập hóa đơn", "Đơn giá", "Số KW", "Đối tượng", "Thành tiền");
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
		}

		public void tieuDeNN() {
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
			System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Mã Khách hàng", "Tên khách hàng",
					"Ngày lập hóa đơn", "Đơn giá", "Số KW", "Quốc tịch", "Thành tiền");
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
		}

		@Override
		public String toString() {
			String s = "";
			s = s.format("|%-14s|%-25s|%-16s|%15s|%10s|", getMaKH(), getHoTenKH(), df.format(getNgayLapHD().getTime()),
					sf.format(getDonGia()), getSoKW());
			return s;
		}

		
		
		

}
