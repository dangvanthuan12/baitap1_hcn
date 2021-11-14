package modul1;

public class ThamBien {
	private String ten;
    private int tuoi;
	    public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
		
	static void them(ThamBien p) {
	    p.setTuoi(p.getTuoi() + 1);
	}
	
public static void main(String[] args) {
	ThamBien tp1;
    tp1 = new ThamBien();
    tp1.setTen("Dương Khang");
    tp1.setTuoi(20);

    // tp1 là đối tượng do nó là tham số tham chiếu, hàm them tương tác với chính đối tượng
    // lớp ThamBien mà biến trỏ tới
    them(tp1);
    System.out.println(tp1.getTuoi()); //21
}  
}
