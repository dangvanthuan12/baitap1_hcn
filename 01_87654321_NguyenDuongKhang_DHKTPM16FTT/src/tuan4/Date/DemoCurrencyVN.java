package tuan4.Date;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DemoCurrencyVN {
	public static void main(String[] args) {
		double tien=-12000;
		Locale lc = new Locale("vi", "VN");
		NumberFormat ft= NumberFormat.getCurrencyInstance(lc);
		System.out.println("Tiền định dạng: "+ ft.format(tien));
		DecimalFormat ft2= new DecimalFormat("###,###.00 VND");
		System.out.println("Tiền Việt Nam: "+ft2.format(tien));
	}

}
