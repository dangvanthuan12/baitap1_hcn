package demo1;

public abstract class Cha {
	public double cao;
	public String toc;
	public String da;
	public double getCao() {
		return cao;
	}
	public void setCao(double cao) {
		this.cao = cao;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getDa() {
		return da;
	}
	public void setDa(String da) {
		this.da = da;
	}
	// là tính chất chỉ nêu vấn đề tổng quát, không chi tiết vấn đề.
	
	public abstract void hat();
	public abstract double chay();
	// tạo constructor
	
	public Cha(double cao, String toc, String da) {
		this.cao = cao;
		this.toc = toc;
		this.da = da;
	}
	public Cha() {
	}
	
}
