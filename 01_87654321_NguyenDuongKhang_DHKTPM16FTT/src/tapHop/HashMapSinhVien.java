package tapHop;

public class HashMapSinhVien {
	private int maSV;
	private String hoTen;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public HashMapSinhVien(int maSV, String hoTen) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
	}
	public HashMapSinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HashMapSinhVien [maSV=" + maSV + ", hoTen=" + hoTen + "]";
	}
	

}
