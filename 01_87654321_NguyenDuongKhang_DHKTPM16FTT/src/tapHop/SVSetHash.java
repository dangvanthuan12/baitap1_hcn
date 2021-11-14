package tapHop;

import java.util.HashSet;
import java.util.Iterator;

public class SVSetHash {
	public static void main(String[] args) {
		 HashSet<SinhVien> hs = new HashSet<SinhVien>();
		 SinhVien s1= new SinhVien("12345678", "Trần Thu Hà");
		 SinhVien s2= new SinhVien("123456788", "Lý Thụy Khuê");
		 SinhVien s3= new SinhVien("123456799", "Trần Hạnh Nhân");
		 hs.add(s1);
		 hs.add(s2);
		 hs.add(s3);
		 Iterator<SinhVien> itr= hs.iterator();
		 while (itr.hasNext()) {
			System.out.println(itr.next()+",");
		}
		 for (SinhVien sv : hs) {
			 System.out.println(sv);
		}
		 
	}
	

}
