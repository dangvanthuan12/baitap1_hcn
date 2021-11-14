package modul0;

public class PhuongThucTX {
	// phương thức truy xuất private 
		private String name;
	// Phương thức truy xuất mặc định khai báo
	String hoTen;
	
	// Phương thức truy xuất public
	public String tenToi;
	// Phương thức truy xuất protected 
	protected String tenBan;
	
	

	public static void main(String[] args) {
		PhuongThucTX tc= new PhuongThucTX();
		tc.name="Paul";
		System.out.println(tc.name);
	}

}
