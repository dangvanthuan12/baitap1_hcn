
public class HinhCN extends HinhHoc implements PhepToan {
	// Tính chất thừa kế: Lớp B thừa hưởng thuộc tính và phương thức của class A;
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	// tạo constructor
	
	public HinhCN(String tenHinh, double chieuDai, double chieuRong) {
		super(tenHinh);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public HinhCN(String tenHinh) {
		super(tenHinh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double chuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	//@overload
	public int phepToan(int a, int b) {
		return a*b;
	}
	public void pheToan(int a, int b) {
		System.out.println("Tích a*b:=%10s"+a*b);
	}
	public int phepToan(int a) {
		return a*a;
	}
	@Override
	public int phepNhan() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double phepChia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
