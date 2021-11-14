package baiTrang32;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCD {

	public static void main(String[] args) throws Exception {
		String ngayXB="20/12/2009";
		SimpleDateFormat dd= new SimpleDateFormat("dd/MM/yyyy");
		Date ngayXuatBan =dd.parse(ngayXB);
		CD cr1= new CD("12345678","Mùa Xuân","Hồng Nhung", ngayXuatBan, 10,300000);
		CD cr2= new CD("12345679","Mùa Xuân","Hồng Nhung", ngayXuatBan, 10,300000);
		CD cr3= new CD("12345688","Mùa Xuân","Hồng Nhung", ngayXuatBan, 10,300000);
		CD cr4= new CD("123456789","Mùa Xuân","Hồng Nhung", ngayXuatBan, 10,300000);
		ListCD ls = new ListCD(2);
		ls.themCD(cr1);
		ls.themCD(cr2);
		ls.themCD(cr3);
		ls.themCD(cr4);
		cr1.tieuDe();
		ls.inKetQua();
		DecimalFormat dt = new DecimalFormat("###,###.00 VND");
		System.out.println("Tổng giá thành: "+dt.format(ls.tongGiaThanh()));
		
	}

}
