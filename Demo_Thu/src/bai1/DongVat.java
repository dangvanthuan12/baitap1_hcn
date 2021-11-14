package bai1;

public abstract class DongVat {
	protected String ten;
	protected int soChan;
	protected String tiengKeu;
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


	public String getTiengKeu() {
		return tiengKeu;
	}


	public void setTiengKeu(String tiengKeu) {
		this.tiengKeu = tiengKeu;
	}
	
	// phuong thức abstract 
	public abstract String diChuyen();
	
	public DongVat() {
		
	}
	
	private boolean chon;

	public DongVat(String ten, int soChan, String tiengKeu) {
		this.ten = ten;
		this.soChan = soChan;
		this.tiengKeu = tiengKeu;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
