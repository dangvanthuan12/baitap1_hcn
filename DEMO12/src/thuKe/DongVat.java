package thuKe;

public abstract class DongVat {
	private String ten;
	private int soChan;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoChan() {
		return soChan;
	}
	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}
	public abstract void diChuyen();
	
	

}
