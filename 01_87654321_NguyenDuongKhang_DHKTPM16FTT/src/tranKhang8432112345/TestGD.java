package tranKhang8432112345;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGD {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar ngay1;
		ngay1= new GregorianCalendar(2021, 11,9);
		GiaoDich gd= new GiaoDichDat("12345678", ngay1, "A", 200000, 100);
		GiaoDichDat gdt= new GiaoDichDat();
		GiaoDich gd1= new GiaoDichDat("12345677", new GregorianCalendar(2022,3,30), "A", 200000, 100);
		ListGD ls= new ListGD();
		ls.themGD(gd);
		ls.themGD(gd1);
		gdt.inTieuDeGDD();
		System.out.println(gd);
		ls.inKQ();

}
}