package tranHuyQuan_987654321;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListKH {
	List<KhachHang> ls;
	public ListKH() {
		ls= new Vector<KhachHang>();
	}
	public boolean themKH(KhachHang kh) {
		if (ls.contains(kh)) {
			return false;
		} else {
			return ls.add(kh);
		}
	}

}
