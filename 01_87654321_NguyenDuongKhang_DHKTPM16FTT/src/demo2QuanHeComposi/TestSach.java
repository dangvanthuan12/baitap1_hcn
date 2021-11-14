package demo2QuanHeComposi;

import java.util.ArrayList;
import java.util.List;

public class TestSach {

	public static void main(String[] args) {
		// Creating the Objects of Book class.
		Sach b1 = new Sach("EffectiveJ Java", "Joshua Bloch");
		Sach b2 = new Sach("Thinking in Java", "Bruce Eckel");
		Sach b3 = new Sach("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains the
		// no. of books.
		List<Sach> ls = new ArrayList<Sach>();
		ls.add(b1);
		ls.add(b2);
		ls.add(b3);

		ThuVien library = new ThuVien(ls);
		List<Sach> bks = library.getTongSachTV();
		for (Sach bk : bks) {
			System.out.println("Tên sách : " + bk.tenSach + " and " + " Tác giả : " + bk.tacGia);
		}
	}

}
