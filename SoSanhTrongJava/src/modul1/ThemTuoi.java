package modul1;

public class ThemTuoi {
	private String hoTen;
	private int tuoi;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public static void themTuoi(ThemTuoi tuoi) {
		tuoi.setTuoi(tuoi.getTuoi()+1);
	}
	public static void main(String[] args) {
		
		ThemTuoi tp1;
		tp1= new ThemTuoi();
		tp1.setHoTen("Đặng Khang");
		tp1.setTuoi(25);
		System.out.println("Họ tên: "+ tp1.hoTen +" Tuổi: "+ tp1.tuoi);
		themTuoi(tp1);
		System.out.println("Tuoi sau khi thêm:");
		System.out.println("Họ tên: "+ tp1.hoTen +" Tuổi: "+ tp1.tuoi);
		
	}
	
	

}
