package baiTrang32;

public class ListCD {
	CD[] ls;
	int count;
	public ListCD(int n) {
		ls= new CD[n];
		count=0;
	}
	public void tangKT() {
		CD[] tam = new CD[ls.length*2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls=tam;
	}
	public boolean themCD(CD cr) {
		if (count==ls.length) {
			tangKT();
		}
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaCD().equalsIgnoreCase(cr.getMaCD())) {
				return false;
			}
		}
		ls[count]=cr;
		count++;
		return true;
	}
	public double tongGiaThanh() {
		double tt=0;
		for (int i = 0; i < count; i++) {
			tt+=ls[i].getGia();
		}
		return tt;
	}
	public void inKetQua() {
		for (CD cr : ls) {
			if ( cr!=null) {
				System.out.println(cr);
			}
		}
	}

}
