package bai4.giaoDich;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class TestGD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ngayGD;
		ngayGD= new GregorianCalendar(2013, 8,12);
		GiaoDich gd1= new GiaoDichDat("1234678", ngayGD, 10000, 100, "A");
		gd1.inTieuDeDat();
		ListGD ls= new ListGD();
		ls.themGD(gd1);
		ls.inKQ();
		System.out.println("Xuất theo tháng");
		ls.xuatTheTG();

	}

}
