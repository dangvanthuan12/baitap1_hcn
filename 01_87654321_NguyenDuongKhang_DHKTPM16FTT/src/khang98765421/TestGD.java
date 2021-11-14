package khang98765421;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGD {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		cal = new GregorianCalendar(2012,11,16);
		GiaoDich g1= new GiaoDichDat("123456789", cal,200000,10,"A");
		GiaoDich g2= new GiaoDichDat("123456799", cal,200000,10,"B");
		g1.inTeuDe();
		System.out.println(g1);
		ListGD ls= new ListGD();
		ls.themGD(g1);
		ls.themGD(g2);
		ls.inKQ();

	}

}
