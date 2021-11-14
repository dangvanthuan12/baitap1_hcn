package tuan3.Bai6;

public class ListHTP {
	HangThucPham[] ls;
	int count;
	public ListHTP(int n) {
		ls=new HangThucPham[n];
		count =0;
	}
	// tăng kích thước cho mảng 2 lần
			public void tangKTM() {
				HangThucPham[] tam= new HangThucPham[ls.length*2];
				System.arraycopy(ls, 0, tam,0, count);
				ls=tam;
			}
	
		// thêm tp vào mảng ls có kiểm tra trùng mã và mảng đầy tăng kích thước mảng
		public boolean themTP(HangThucPham tp) {
			if (count==ls.length) {
				tangKTM();
			}
			for (int i = 0; i < count; i++) {
				if (ls[i].getMaHang()==tp.getMaHang()) {
					System.out.println("trùng mã");
					return false;
				} 
			}
			ls[count]=tp;
			count++;
			return true;
		}
		//Tìm theo mã
		public int timMa(int ma) {
			for (int i = 0; i < count; i++) {
				if (ls[i].getMaHang()==ma) {
					return i;
				} 
			}
			return -1;
		}
		// Xóa mặt hàng theo mã
		public boolean xoaHang(int ma) {
			int vt=timMa(ma);
			if (timMa(ma)!=-1) 
				for (int i = count; i > vt; i--) {
					ls[i]=ls[i+1];
					count--;
					return true;
				}
			return false;
		}
		// Sắp xếp tăng dần theo mã hàng
		public void sapXep() {
			for (int i = 0; i < count-1; i++) {
				for (int j = i+1; j < count; j++) {
					if (ls[i].getMaHang()>ls[j].getMaHang()) {
						HangThucPham tam=ls[i];
						ls[i]=ls[j];
						ls[j]=tam;
					}
				}
			}
		}
		public void inKetQua() {
			for (HangThucPham tp : ls) {
				if (tp!=null) {
					System.out.println(tp);
				}
			}
		}
}
