
public class HinhTron extends HinhHoc{
	private double banKinh;

	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	// constructor
	public HinhTron() {
	}
	public HinhTron(String tenHinh, double banKinh) {
		super(tenHinh);
		this.banKinh = banKinh;
	}
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return getBanKinh()*2*3.1416;
	}
	
	
	
	

}
