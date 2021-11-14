package nguyenTaiNam987654321GK;

import java.util.Iterator;

public class ListSV {
	SinhVien[] ls;
	int count;
	public ListSV(int n) {
		ls= new SinhVien[n];
		count=0;
	}
	public void tangKT() {
		SinhVien[] tam= new SinhVien[ls.length+3];
		System.arraycopy(ls, 0, tam, 0, count);
		ls=tam;
	}
	public boolean themSV(SinhVien sv) {
		if (ls.length==count) {
			tangKT();
		}
		for (SinhVien s : ls)
			if (s.getMaSV().equalsIgnoreCase(sv.getMaSV())) {
				return false;
			}
		ls[count]=sv;
		count++;
		return true;
	}
	public void inKQ() {
		for (SinhVien sinhVien : ls) {
			if (sinhVien!=null) {
				System.out.println(sinhVien);
			}
			
		}
	}
	public double tongHP() {
		double tong=0;
		for (SinhVien s : ls) {
			tong+=s.getHocPhi();
		}
		return tong;
	}
	

}
