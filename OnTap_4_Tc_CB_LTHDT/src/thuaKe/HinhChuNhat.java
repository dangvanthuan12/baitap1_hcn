package thuaKe;

public class HinhChuNhat extends HinhHoc {
	private double chieuDai;
	private double chieuRong;
	// Dong goi
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
	// constructor
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhChuNhat(String tenHinh) {
		super(tenHinh);
		// TODO Auto-generated constructor stub
	}
	public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong) {
		super(tenHinh);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return (getChieuDai()+getChieuRong())*2;
	}
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return getChieuDai()*getChieuRong();
	}

}
