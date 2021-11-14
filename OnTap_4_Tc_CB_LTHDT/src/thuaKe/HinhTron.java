package thuaKe;

public class HinhTron extends HinhHoc{
	
	private double banKinh;
	public final double PI=3.14;
	// Đóng gói 
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) {
		try {
			if (bk>0) {
				this.banKinh = bk;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public HinhTron(String tenHinh, double banKinh) {
		super(tenHinh);
		this.banKinh = banKinh;
	}
	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhTron(String tenHinh) {
		super(tenHinh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return getBanKinh()*2*PI;
	}
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return getBanKinh()*getBanKinh()*PI;
	}
	
	
	
}
