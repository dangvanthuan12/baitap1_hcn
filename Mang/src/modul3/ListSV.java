package modul3;

public class ListSV {
	// Khai báo mảng ls của đối tượng SinhVien
	SinhVien[] ls;
	// chỉ số dùng mảng hiện tại count
	int count;
	// Dùng hàm tạo để khởi tạo mảng ls có kiểu SinhVien n chổ
	public ListSV( int n) {
		ls= new SinhVien[n];
		count=0;
	}
	// cài phương thức tăng kích thước cho mảng
	public void tangKT() {
		SinhVien[] tam;
		tam = new SinhVien[2*ls.length];
		System.arraycopy(ls, 0, tam, 0, count);
		ls=tam;
	}
	public boolean themSV(SinhVien sv) {
		if (count==ls.length) {
			tangKT();
		}
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaSV().equalsIgnoreCase(sv.getMaSV())) {
				return false;
			} 
		}
		ls[count]=sv;
		count++;
		return true;
	}
	public int timMa(String ma) {
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaSV().equalsIgnoreCase(ma)) {
				return i;
			}
		}
		return -1;
	}
	public boolean xoaSV(int vitri) {
		if (vitri == -1)
			return false;
		for (int i = vitri; i < count-1; i++) 
			ls[i] = ls[i+1];
		count--;
		return true;
	}
/*public boolean capNhap(String ma) {
	for (int i = 0; i < count; i++) {
		
	}
}*/
	public void inDanhSachSV() {
		for (SinhVien sv : ls) {
			if (sv!=null) {
				System.out.println(sv);
			}
		}
	}

}
