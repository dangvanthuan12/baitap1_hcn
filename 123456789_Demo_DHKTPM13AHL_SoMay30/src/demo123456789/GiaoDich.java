package demo123456789;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class GiaoDich {
	protected String maGD;
	protected Calendar ngayGD;
	protected double donGia, dienTich;
	
	
	public abstract double getThanhTien();
	// get set
	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public Calendar getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Calendar ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	// constructor
	public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public GiaoDich() {
		
	}
	// tostring
	public void tieuDeGDD() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf("|%-11s|%-11s|%-18s|%-15s|%-10s|%-25s|\n", "Mã GD","Ngày GD","Đơn giá", "Diện tích","Loại đất", "Thành tiền");
		System.out.println("--------------------------------------------------------------------------------------");
	}
	public void tieuDeGDN() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-11s|%-11s|%-18s|%-15s|%-10s|%-30s|%-25s|\n", "Mã GD","Ngày GD","Đơn giá", "Diện tích","Loại nhà","Đia chỉ", "Thành tiền");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
	}
	// toString
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	DecimalFormat tf= new DecimalFormat("#,###.00 VND");
	NumberFormat sf = new DecimalFormat("#,###.00 m^2");
	@Override
	public String toString() {
		String s="";
		Calendar ngay = Calendar.getInstance();
		ngay=getNgayGD();
		ngay.add(Calendar.MONTH,-1);
		s=s.format("|%-10s|%-10s|%17s|%13s|",getMaGD(),df.format(ngay.getTime()), tf.format(getDonGia()), 
				sf.format(getDienTich()));
		return s;
	}
	

}
