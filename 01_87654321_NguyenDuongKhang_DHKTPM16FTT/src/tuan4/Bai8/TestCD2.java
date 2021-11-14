package tuan4.Bai8;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestCD2 {
	public static void main(String[] args) throws Exception {
		CD2 cd = new CD2();
		ListCD2 ls = new ListCD2(2);
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		Locale localeVN = new Locale("vi", "VN");
		//LocalDate lc = new Locale(language, country)
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		DateFormat df= DateFormat.getDateInstance(0, localeVN);
		String ngayS = "01/12/2021";
		Date ngayPH;
		ngayPH = fd.parse(ngayS);
		CD2 cd1 = new CD2(1111111, "Mùa Đông Vắng em", "ĐỒM VĨNH ĐIỆN", ngayPH, 4, 100000);
		CD2 cd2 = new CD2(222222, "Mùa Đông Vắng em", "ĐỒM VĨNH ĐIỆN", ngayPH, 4, 100000);
		CD2 cd3 = new CD2(3333333, "Mùa Đông Vắng em", "ĐỒM VĨNH ĐIỆN", ngayPH, 4, 100000);
		CD2 cd4 = new CD2(4444444, "Mùa Đông Vắng em", "ĐỒM VĨNH ĐIỆN", ngayPH, 4, 100000);
		
		ls.themCD(cd1);
		ls.themCD(cd2);
		ls.themCD(cd3);
		ls.themCD(cd4);
		cd.tieuDe();
		ls.inKQ();
		System.out.println("Sau sắp xếp:");
		ls.sapXepCD();
		ls.inKQ();
		System.out.println("Số CD trong mảng: " + ls.demCD());
		String str = numberFormat.format(ls.tongTien());
		System.out.println("Tổng tiền các CD: " + str);
		DecimalFormat ft= new DecimalFormat("###,###.00 VND");
		System.out.println("Tồng tiền VND: "+ ft.format(ls.tongTien()));
		System.out.println(df.format(ngayPH));
	}

}
