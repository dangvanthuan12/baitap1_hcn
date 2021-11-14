package tuan4.Bai8;

public class ListCD {
	int count;
	CD[] ls;

	public ListCD(int n) {
		ls = new CD[n];
		count = 0;
	}

	public void tangKT() {
		CD[] tam = new CD[ls.length * 2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls = tam;
	}

	public boolean themCD(CD crd) {
		if (count == ls.length) {
			tangKT();
		}
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaCD() == crd.getMaCD()) {
				return false;
			}
		}
		ls[count] = crd;
		count++;
		return true;
	}

	public int countCD() {
		int countCD = 0;
		for (CD cd : ls) {
			if (cd != null) {
				countCD++;
			}
		}
		return countCD;
	}

	public double tong() {
		double tong = 0;
		for (CD cd : ls) {
			tong = tong + cd.getGiaThanh();
		}
		return tong;
	}

	public void sapXep() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (ls[i].getMaCD() > ls[j].getMaCD()) {
					CD tam = ls[i];
					ls[i] = ls[j];
					ls[j] = tam;
				}
			}
		}
	}

	public void inKetQua() {
		for (CD cdr : ls) {
			if (cdr != null) {
				System.out.println(cdr);
			}
		}
	}
}
