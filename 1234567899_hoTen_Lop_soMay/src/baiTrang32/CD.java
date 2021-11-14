package baiTrang32;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CD {
	private String maCD;
	private String tuaCD;
	private String caSy;
	private Date ngayXuatBan;
	private int SoBH;
	private double gia;
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
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
	public Date getNgayXuatBan() {
		return ngayXuatBan;
	}
	public void setNgayXuatBan(Date ngayXuatBan) {
		this.ngayXuatBan = ngayXuatBan;
	}
	public int getSoBH() {
		return SoBH;
	}
	public void setSoBH(int soBH) {
		SoBH = soBH;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public CD() {
	
	}
	public CD(String maCD, String tuaCD, String caSy, Date ngayXuatBan, int soBH, double gia) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.ngayXuatBan = ngayXuatBan;
		SoBH = soBH;
		this.gia = gia;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maCD == null) ? 0 : maCD.hashCode());
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
		CD other = (CD) obj;
		if (maCD == null) {
			if (other.maCD != null)
				return false;
		} else if (!maCD.equals(other.maCD))
			return false;
		return true;
	}
	public void tieuDe() {
		System.out.println("Chương trình bài 8");
		for (int i = 0; i < 108; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.printf("|%-12s|%-25s|%-25s|%-12s|%-12s|%-15s|\n", 
				"Mã CD", "Tựa CD","Tên Ca sỹ", "Ngày Xuất bản", "Số bài hát","Giá bán");
		for (int i = 0; i < 108; i++) {
			System.out.print("-");
		}
		System.out.println("");
	}
	@Override
	public String toString() {
		DecimalFormat dt= new DecimalFormat("###,###.00 VND");
		SimpleDateFormat dd= new SimpleDateFormat("dd/MM/yyyy");
		String s="";
		s+=s.format("|%-12s|%-25s|%-25s|%-13s|%-12s|%-12s|",
				getMaCD(), getTuaCD(), getCaSy(), 
				dd.format(getNgayXuatBan()),getSoBH(),dt.format(getGia()));
		return s;
	}
}
