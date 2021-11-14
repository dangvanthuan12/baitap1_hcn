package nguyenTaiNam987654321GK;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestSV {

	public static void main(String[] args) {
		Calendar ngay1, ngay2, ngay3;
		ngay1= new GregorianCalendar(2012, 6, 7);
		SinhVien s1= new SinhVien("987654321","Trần Anh Khoa", ngay1,10000);
		ngay1= new GregorianCalendar(2012, 6, 7);
		SinhVien s2= new SinhVien("987654233","Trần Anh Khoa", ngay1,10000);
		ngay1= new GregorianCalendar(2012, 6, 7);
		SinhVien s3= new SinhVien("987654233","Trần Anh Khoa", ngay1,10000);
		ListSV ls= new ListSV(2);
		ls.themSV(s1);
		ls.themSV(s2);
		ls.themSV(s3);
		ls.inKQ();
		System.out.println(ls.tongHP());
		

	}

}
