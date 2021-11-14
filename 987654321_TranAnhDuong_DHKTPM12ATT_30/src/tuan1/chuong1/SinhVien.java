package tuan1.chuong1;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public float getDiemTB(float lt, float th) {
		return (lt+th)/2;
		
	}
	public SinhVien() {}
	public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public void inTieuDe() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("|%-10s|%-30s|%-10s|%-10s|%-10s|\n", "Mã SV", "Họ tên", " Điểm LT","Điểm TH","Điểm TB");
		System.out.println("----------------------------------------------------------------------------");
	}
	@Override
	public String toString() {
		String s="";
		s=s.format("|%-10s|%-30s|%10s|%10s|%10s|", getMaSV(), getHoTen(), getDiemLT(),getDiemTH(),getDiemTB(getDiemLT(), getDiemTH()));
		return s;	
	}
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.inTieuDe();
		SinhVien sv1 = new SinhVien(1234578, "Đàm Vĩnh Hưng",9.0f, 7.0f);
		System.out.println(sv1.toString());
	}
	
	

}
