package modul3;

public class SoSanhinJava {
	private String ten;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

	public static void main(String[] args) {
		SoSanhinJava p1= new SoSanhinJava(); // khởi tạo lần 1 có địa chỉ đầu tiên
		p1.setTen("Khang");
		SoSanhinJava p2= new SoSanhinJava(); // khởi tạo lần 2 có địa chỉ khác địa chỉ đầu tiên
		p2.setTen("Khang");
		System.out.println(p1==p2);
		int a=7;
		int b=7;
		//so sánh
		System.out.println(a==b);
	}

}
