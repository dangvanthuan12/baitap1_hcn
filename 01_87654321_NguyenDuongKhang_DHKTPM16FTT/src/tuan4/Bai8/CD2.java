package tuan4.Bai8;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class CD2 {
	private int maCD;
	private String tuaCD;
	private String caSy;
	private Date ngayPH;
	private int soBH;
	private double giaThanh;
	// Đóng gói thuộc tính
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
	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	// contructor
	public  CD2() {
		
	}
	public CD2(int maCD, String tuaCD, String caSy, Date ngayPH, int soBH, double giaThanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.ngayPH = ngayPH;
		this.soBH = soBH;
		this.giaThanh = giaThanh;
	}
	// Tạo tiêu đề in KQ
	public void tieuDe() {
		System.out.println("\t\t\t CHƯƠNG TRÌNH QUẢN LÝ ĐĨA CD");
		for (int i = 0; i < 125; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-25s|%-30s|%-25s|%-12s|%-15s|\n", 
				"Mã CD", "Tựa CD", "Ca sỹ", "Ngày phát hành",
				"Số bài hát", "Giá thành");

		for (int i = 0; i < 125; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
	DecimalFormat ft = new DecimalFormat("###,###.00 VND");
	// Khởi tạo Regional setting quốc gia Việt Nam
	Locale localeVN = new Locale("vi", "VN");
	Currency ff = Currency.getInstance(localeVN);
	NumberFormat fx =NumberFormat.getCurrencyInstance(localeVN);
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
	// Định dạng kiểu ngày theo các tham số 0->3, theo localeVN
	DateFormat df= DateFormat.getDateInstance(1, localeVN);
	
	// toString
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-12s|%-25s|%-30s|%-14s|%-12s|%-15s|", getMaCD(), getTuaCD(), getCaSy(),
				df.format(getNgayPH().getTime()), getSoBH(),fx.format(getGiaThanh()) );
		return s;
	}
	
	

}
