package tuan4.Bai8;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCD1 {

	public static void main(String[] args) throws Exception {
		CD1 cd = new CD1();
		cd.tieuDe();
		String ngayS="12/12/2012";
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat dt = new DecimalFormat("###,###.00 VND");
		Date ngayPH=null;
		ngayPH=df.parse(ngayS);
		CD1 d1 = new CD1(123456789, "Mùa Đông", "Mạnh Quỳnh", ngayPH, 10, 50000);
		CD1 d2 = new CD1(123456788, "Mùa Hạ", "Phi Nhung", ngayPH, 9, 60000);
		DanhSach ls= new DanhSach(2);
		ls.themCD(d1);
		ls.themCD(d2);
		ls.inKQ();
		System.out.println("Số CD phát hành là: "+ ls.demCD());
		System.out.println("Tổng tiền các CD là: "+ dt.format(ls.tongTienCD()));
	}

}
