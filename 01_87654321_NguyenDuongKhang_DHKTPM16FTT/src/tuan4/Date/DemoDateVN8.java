package tuan4.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DemoDateVN8 {
	public static void main(String[] args) {
		Calendar ngay = Calendar.getInstance();
		SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(ngay.getTime());
		// Sau khi định dạng
		System.out.println("Ngày đã định dạng: "+fd.format(ngay.getTime()));
		// Định dạng theo đối tượng Regional setting
		Locale regional = new Locale("vi", "VN");
		DateFormat df0= DateFormat.getDateInstance(0, regional);
		DateFormat df1= DateFormat.getDateInstance(1, regional);
		DateFormat df2= DateFormat.getDateInstance(2, regional);
		DateFormat df3= DateFormat.getDateInstance(3, regional);
		System.out.println("Ngày đã định dạng 0: "+df0.format(ngay.getTime()));
		System.out.println("Ngày đã định dạng 1: "+df1.format(ngay.getTime()));
		System.out.println("Ngày đã định dạng 2: "+df2.format(ngay.getTime()));
		System.out.println("Ngày đã định dạng 3: "+df3.format(ngay.getTime()));
	// Kiểu ngày sau
		Date ngay1= new Date();
		System.out.println(ngay1.getTime());
		System.out.println("Ngày đã định dạng: "+df3.format(ngay1.getTime()));
		Date ngay2 = new Date(2012, 9, 12, 14, 30);
		SimpleDateFormat ff =new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(ff.format(ngay2.getTime()));
		
	}

}
