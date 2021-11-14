package demo1;

public class ConTrai extends Cha{
	private String mui;
	private String boi;
	public String getMui() {
		return mui;
	}

	public void setMui(String mui) {
		this.mui = mui;
	}

	public String getBoi() {
		return boi;
	}

	public void setBoi(String boi) {
		this.boi = boi;
	}
	@Override
	public void hat() {
				
	}

	@Override
	public double chay() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ConTrai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConTrai(double cao, String toc, String da, String mui, String boi) {
		super(cao, toc, da);
		this.mui=mui;
		this.boi=boi;
	}
}
