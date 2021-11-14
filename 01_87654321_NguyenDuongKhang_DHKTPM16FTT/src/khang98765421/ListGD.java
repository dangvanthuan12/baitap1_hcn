package khang98765421;

import java.util.ArrayList;
import java.util.List;

public class ListGD {
public List<GiaoDich> ls;
public ListGD() {
	ls= new ArrayList<GiaoDich>();
}
public boolean themGD(GiaoDich gd) {
	for (GiaoDich g : ls) {
		if (g.getMaGD().equalsIgnoreCase(gd.getMaGD())) {
			return false;
		}
	}
	return ls.add(gd);
}
public void inKQ() {
	for (GiaoDich gd : ls) {
		if (gd!=null) {
			System.out.println(gd);
		}
	}
}
}
