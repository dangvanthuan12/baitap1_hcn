package tuan4.Bai8;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CD {
	private int maCD;
	private String tuaCD;
	private String caSy;
	private Date ngayPH;
	private int soBH;
	private double giaThanh;

	// Đóng gói
	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public String getCaSy() {
		return caSy;
	}

	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}

	public Date getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(Date ngayPH) {
		this.ngayPH = ngayPH;
	}

	public int getSoBH() {
		return soBH;
	}

	public void setSoBH(int sb) {
		try {
			if (sb > 0) {
				this.soBH = sb;
			}
		} catch (Exception e) {
			System.out.println("sb>0");
		}

	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double g) {
		if (g > 0) {
			this.giaThanh = g;
		} else {
			System.out.println("Giá thành >0");
		}
	}

	// tạo constructor
	public CD(int maCD, String tuaCD, String caSy, Date ngayPH, int soBH, double giaThanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.ngayPH = ngayPH;
		this.soBH = soBH;
		this.giaThanh = giaThanh;
	}

	public CD() {

	}

	public void tieuDe() {
		System.out.println("\t\t\t CHƯƠNG TRÌNH QUẢN LÝ ĐĨA CD");
		for (int i = 0; i < 115; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-25s|%-30s|%-12s|%-12s|%-15s|\n", 
				"Mã CD", "Tựa CD", "Ca sỹ", "Ngày phát hành",
				"Số bài hát", "Giá thành");

		for (int i = 0; i < 115; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}

	// toString
	@Override
	public String toString() {
		String s = "";
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat ft = new DecimalFormat("###,###.00 VND");
		s += s.format("|%-12s|%-25s|%-30s|%14s|%12s|%15s|", getMaCD(), getTuaCD(), getCaSy(),
				fd.format(getNgayPH().getTime()), getSoBH(), ft.format(getGiaThanh()));
		return s;
	}
}
