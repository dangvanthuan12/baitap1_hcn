package demoTC1;

public class HinhTron extends HinhHoc implements PhepTinh{
	private double banKinh;
	public final double PI=3.1416;
	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	

	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhTron(String th) {
		super(th);
		// TODO Auto-generated constructor stub
	}

	public HinhTron(String th, double banKinh) {
		super(th);
		this.banKinh = banKinh;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return getBanKinh()*2*PI;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getChuVi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTongDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String chiaDienTich() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
