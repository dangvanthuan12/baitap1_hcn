package tuan4.Bai8;

public class DanhSach {
	int count;
	CD1[] ls;
// dùng hàm tạo để khởi tạo các thông số cho mảng ls;
	public DanhSach(int n) {
		ls = new CD1[n];
		count = 0;
	}

	public void tangKTM() {
		if (count == ls.length) {
			CD1[] tam = new CD1[ls.length * 2];
			System.arraycopy(ls, 0, tam, 0, count);
			ls = tam;
		}
	}

	public boolean themCD(CD1 cr) {
		tangKTM();
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaCD() == cr.getMaCD()) {
				return false;
			}
		}
		ls[count] = cr;
		count++;
		return true;
	}
	public void sapXep() {
		for (int i = 0; i < count-1; i++) {
			for (int j = i+1; j < count; j++) {
				if (ls[i].getMaCD()>ls[j].getMaCD()) {
					CD1 tam=ls[i];
					ls[i]=ls[j];
					ls[j]=tam;
				}
			}
		}
	}
	public int demCD() {
		int count=0;
		for (CD1 cd : ls) {
			if (cd!=null) {
				count++;
			}
		}
		return count;
	}
	public double tongTienCD() {
		double tong=0;
		for (int i = 0; i < count; i++) {
			tong=tong+ls[i].getGiaThanh();
		}
		return tong;
	}

	public void inKQ() {
		for (CD1 cd : ls) {
			if (cd != null) {
				System.out.println(cd);
			}
		}
	}
}
