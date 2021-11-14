package prjKhoangCach1;

public class ToaDo {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	

	public ToaDo() {
		
	}
	public ToaDo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "ToaDo [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
