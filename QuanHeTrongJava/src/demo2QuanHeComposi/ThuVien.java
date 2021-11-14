package demo2QuanHeComposi;

import java.util.List;

public class ThuVien {
	// reference to refer to list of books.
	private final List<Sach> ls;

	ThuVien(List<Sach> ls) {
		this.ls = ls;
	}

	public List<Sach> getTongSachTV() {
		return ls;
	}

}
