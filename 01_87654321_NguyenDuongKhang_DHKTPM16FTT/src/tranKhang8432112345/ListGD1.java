package tranKhang8432112345;

import java.util.ArrayList;
import java.util.List;

public class ListGD1 {
	/*GiaoDich[] gd;
	int count;
	public ListGD1(int n) {
		gd= new GiaoDich[n];
		count =0;
	}*/
	// mới dùng Collection
	List<GiaoDich1> ls;
	public ListGD1() {
		ls= new ArrayList<GiaoDich1>();
	}
	public boolean themGD(GiaoDich1 gd) {
		return ls.add(gd);
	}

}
