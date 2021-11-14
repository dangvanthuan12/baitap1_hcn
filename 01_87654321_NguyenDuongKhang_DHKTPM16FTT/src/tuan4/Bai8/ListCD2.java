package tuan4.Bai8;

public class ListCD2 {
	int count;
	CD2[] ls;

	public ListCD2(int n) {
		ls = new CD2[n];
		count = 0;
	}

	public void tangKTM() {
		CD2[] tam = new CD2[ls.length * 2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls = tam;
	}

	public boolean themCD(CD2 crd) {
		if (count == ls.length) {
			tangKTM();

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

	public int demCD() {
		int dem = 0;
		for (CD2 cd : ls) {
			if (cd != null) {
				dem++;
			}
		}
		return dem;
	}

	public double tongTien() {
		double tong = 0;
		for (CD2 cd : ls) {
			tong = tong + cd.getGiaThanh();
		}
		return tong;
	}

	public void inKQ() {
		for (CD2 cd : ls) {
			if (cd != null) {
				System.out.println(cd);
			}
		}
	}

	public void sapXepCD() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (ls[i].getMaCD() > ls[j].getMaCD()) {
					CD2 tam = ls[i];
					ls[i] = ls[j];
					ls[j] = tam;
				}
			}
		}
	}

}
