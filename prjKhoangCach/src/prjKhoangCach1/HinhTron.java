package prjKhoangCach1;

public class HinhTron {
	private double bankinh;
	private ToaDo tam;

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public HinhTron(double bankinh, ToaDo tam) {
		this.bankinh = bankinh;
		this.tam = tam;
	}

	@Override
	public String toString() {
		return "HinhTron [bankinh=" + bankinh + ", tam=" + tam + "]";
	}
	

}
