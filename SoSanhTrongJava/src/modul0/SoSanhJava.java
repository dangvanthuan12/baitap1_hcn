package modul0;

public class SoSanhJava {
	String ten;
		public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}


	public static void main(String[] args) {
		int a=8;
		int b=10;
		// phép so sánh thông thường
		//==, >, <, >=, <=, !=, <>
		System.out.println(a==b);
		SoSanhJava t1= new SoSanhJava();
		t1.setTen("Duong");
		SoSanhJava t2= new SoSanhJava();
		t2.setTen("Duong");
		System.out.println(t1.getTen());
		System.out.println(t2.getTen());
		System.out.println(t2.ten==t1.ten);
		System.out.println(t1==t2);
		// Chú ý: các đối tượng khi khởi tạo thì được lưu trữ trong bộ nhớ head
		// khi so sánh nó một tham biến do vậy nó sẽ so sánh địa chỉ với nhau
		// nên kết quả so sánh false
		// Để so sánh ta phải dùng phương thức sau:
		System.out.println("So sánh theo equals");
		System.out.println(t1.equals(t2));
		
		
	}

}
