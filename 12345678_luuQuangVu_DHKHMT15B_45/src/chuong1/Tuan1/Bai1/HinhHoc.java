package chuong1.Tuan1.Bai1;

public class HinhHoc {
	// khai báo các thuộc tính 
	private double cDai;
	private double cRong;
	// Đóng gói
	public double getcDai() {
		return cDai;
	}
	// Tạo ràng buộc cho thuộc tính
	public void setcDai(double d) {
		if (d>0) {
		this.cDai=d;	
		} else {
		System.out.println("1");
		}
		
	}
	public double getcRong() {
		return cRong;
	}
	public void setcRong(double r) {
		if (r>0) {
			this.cRong = r;
		} else {
			System.out.println("1");
		}
	}
	//Tạo hàm tạo hay constructor
	public HinhHoc(double cd, double cr) {
		if (cd>0) {
			this.cDai = cd;
		} else {
			System.out.println("1");
		}
		if (cr>0) {
			this.cRong = cr;
		} else {
			System.out.println("1");
		}
		
	}
	public HinhHoc() {
		
	}
	// Tạo phương thức tính diện và chu vi
	public double getTinhDT() {
		return this.cDai*cRong;
	}
	public double getChuVi(double d, double r) {
		return (d+r)*2;
	}
	public float tinhToan()
	{
		return 0;
	}
	
	public double tinhToan(double a, double b) {
		return a+b;
	}
	public void tieuDe() {
		System.out.println("------------------------------------------");
		System.out.printf("|%10s|%10s|%10s|%10s|","Chiều dài", "Chiều rộng","Chu vi","Diện tích");
		System.out.println();
		System.out.println("------------------------------------------");
	}
	// Tạo mẫu in
	@Override
	public String toString() {
		return "HinhHoc [cDai=" + cDai + ", cRong=" + cRong + ", getcDai()=" + getcDai() + ", getcRong()=" + getcRong()
				+ ", getTinhDT()=" + getTinhDT() + "]";
	}
	
	
	
	
	
	

}
