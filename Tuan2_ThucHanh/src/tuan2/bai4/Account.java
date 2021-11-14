package tuan2.bai4;

public class Account {
	// Khai báo thuộc tính
	private int soTK;
	private String tenTK;
	private double tienTK= 50000;
	public final double LAISUAT=0.7;
	public int getSoTK() {
		return soTK;
	}
	public void setSoTK(int soTK) {
		try {
			if (soTK>0) {
				this.soTK = soTK;
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public double getTienTK() {
		return tienTK;
	}
	public void setTienTK(double tienTK) {
		this.tienTK =getTienTK()+tienTK;
	}
	// Tạo constructor
	public Account() {}
	public Account(int soTK, String tenTK, double tienTK) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.tienTK = tienTK;
	}
	// cài đặt phương thức nạp tiền và rút tiền
	public void napTienTK(Account ac, double tien) {
		if (tien>0) {
			this.tienTK =getTienTK()+tienTK;
		} else {
			System.out.println("tiền nạp bé hơn 0");
		}
	}
	public boolean kiemTraTK(Account ac, double tienRut) {
		if (tienRut>ac.getTienTK()-50.000) {
			return false;
		} else {
			return true;
		}
	}
	public void rutTienTK(Account ac, double tien) {
		if (ac.kiemTraTK(ac,tien)==true) {
			ac.tienTK= ac.getTienTK()-tien;
		} else {
			System.out.println("Lỗi");
		}
	}
	public void chuyenTienTK(Account acA, Account acB, double tienChuyen) {
		acA.rutTienTK(acA, tienChuyen);
		acB.napTienTK(acB, tienChuyen);
	}
	public static void inTieuDe() {
		System.out.println("HOẠT ĐỘNG CỦA ACCOUNT");
		for (int i = 0; i < 63; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-30s|%-15s|\n","Số tài khoản", "Tên tài khoản",
				"Số tiền tài khoản");
		for (int i = 0; i < 63; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-12s|%-30s|%17s|", getSoTK(), getTenTK(), getTienTK());
		return s;
	}
	public static void main(String[] args) {
		inTieuDe();
	Account ac1 = new Account();
	ac1.setSoTK(-1);
	ac1.setTenTK("Trần Anh Dương");
	ac1.setTienTK(12000);
	System.out.println(ac1);
	ac1.rutTienTK(ac1, 50000);
	System.out.println(ac1);
	System.out.println("Tạo tài khoản acB để Chuyển tiền");
	Account acB= new Account();
	acB.setSoTK(222222);
	acB.setTenTK("Trần Phương Anh");
	acB.napTienTK(acB, 50000);
	System.out.println(acB);
	System.out.println("Chuyển tiền 10000");
	ac1.chuyenTienTK(ac1, acB, 10000);
	System.out.println("Sau khi chuyển");
	System.out.println(ac1);
	System.out.println(acB);
	}
}
