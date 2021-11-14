package Demo0;

public class SinhVien {
	public int maSV;
	public String hoTen;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int ma) {
		if (ma>999) {
			this.maSV = ma;
		} else {
			this.maSV=0;
		}
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String ht) {
		if (ht!=null) {
			this.hoTen = ht;
		} else {
			this.hoTen="Rong";
		}
	}
	// hàm tạo (constructor)
	public SinhVien() {} // hàm tạo mặc định
	public SinhVien(int ma, String ht) {
		if (ma>999) {
			this.maSV=ma;
		} else {
			this.maSV=0;
		}
		if (ht!=null) {
			this.hoTen=ht;
		} else {
			this.hoTen="Rong";
		}	
	}	
	// tạo mẫu in 
	public void tieuDe() {
		for (int i = 0; i <45; i++) {
			System.out.print("-");
		}	
		System.out.println();
		System.out.printf("|%-12s|%-30s|\n", "Mã Sinh viên", "Họ tên sinh viên");
		for (int i = 0; i <45; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-12s|%-30s|", getMaSV(), getHoTen());
		return s;
	}
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.setMaSV(1234567);
		sv.setHoTen("Trường Đình Phường");
		sv.tieuDe();
		System.out.println(sv);
	}
}
