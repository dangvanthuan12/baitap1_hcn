package bai1;

public class Chim extends DongVat {
	private String mlong;
	
	public Chim() {
		super();
		
	}

	public Chim(String ten, int soChan, String tiengKeu) {
		super(ten, soChan, tiengKeu);
		
	}

	

	@Override
	public String diChuyen() {
		String dc="bay";
		return dc;
	}
	

}
