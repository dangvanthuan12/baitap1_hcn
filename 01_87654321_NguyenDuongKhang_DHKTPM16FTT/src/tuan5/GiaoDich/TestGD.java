package tuan5.GiaoDich;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestGD {
	public static void main(String[] args) {
		Calendar ngay = Calendar.getInstance();
		ngay = new GregorianCalendar(2010, 6, 8);
		GiaoDich g1 = new GiaoDichDat("865431", ngay, 100000, 100, "A");
		ListGD ls = new ListGD();
		ls.themGD(g1);
		ls.inKQ();
		Calendar ngay1, ngay2, ngay3, ngay4, ngay5, ngay6;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 12);
		cal.roll(Calendar.MONTH, -1);
		cal.set(Calendar.DAY_OF_MONTH, 31);
		cal.set(Calendar.YEAR, 2019);
		ngay2 = new GregorianCalendar(2019, 5, 8);
		ngay2.roll(Calendar.MONTH, -1);
		ngay3 = new GregorianCalendar(2019, 7, 10);
		ngay3.roll(Calendar.MONTH, -1);
		ngay4 = new GregorianCalendar(2019, 10, 12);
		ngay4.roll(Calendar.MONTH, -1);
		ngay5 = new GregorianCalendar(2019, 9, 18);
		ngay5.roll(Calendar.MONTH, -1);
		ngay6 = new GregorianCalendar(2019, 12, 10);
		ngay6.roll(Calendar.MONTH, -1);
		ngay6.roll(Calendar.YEAR, -1);
		GiaoDich g2 = new GiaoDichDat("865431", ngay2, 100000, 100, "A");
		GiaoDich g3 = new GiaoDichDat("345678", ngay3, 100000, 100, "A");
		GiaoDich g4 = new GiaoDichDat("865433", ngay4, 100000, 100, "A");
		GiaoDich g5 = new GiaoDichDat("0987456", ngay5, 100000, 100, "A");
		GiaoDich g6 = new GiaoDichDat("34567888", ngay6, 100000, 100, "A");
		ls.themGD(g2);
		ls.themGD(g3);
		ls.themGD(g4);
		ls.themGD(g5);
		ls.themGD(g6);
		ls.inKQ();
		

	}
}
