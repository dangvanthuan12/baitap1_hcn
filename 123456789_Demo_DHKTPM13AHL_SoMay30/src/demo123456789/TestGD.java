package demo123456789;

import java.util.GregorianCalendar;

public class TestGD {

	public static void main(String[] args) {
		GiaoDich g1= new GiaoDichDat("12345678", new GregorianCalendar(2019, 10, 12), 15000, 50, "A");
		g1.tieuDeGDD();
		System.out.println(g1);
		GiaoDich g2 = new GiaoDichNha("87654321", new GregorianCalendar(2019,9,8), 200000, 30,"Cao Cap","12 Nguyen Van Bao TP.HCM");
		g2.tieuDeGDN();
		System.out.println(g2);
		ListGD ls= new ListGD();
		ls.themGD(g1);
		ls.themGD(g2);
		
			g1.tieuDeGDN();
			ls.xuatKQN();
		
			g2.tieuDeGDD();
			ls.xuatKQD();		
}

}
