package demoTC1;

public class HinhCN extends HinhHoc {
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
 // contructor 
public HinhCN(String th, double chieuDai, double chieuRong) {
	super(th);
	this.chieuDai = chieuDai;
	this.chieuRong = chieuRong;
}
public HinhCN() {
	super();
	// TODO Auto-generated constructor stub
}
public HinhCN(String th) {
	super(th);
	// TODO Auto-generated constructor stub
}
@Override
public double tinhChuVi() {
	// TODO Auto-generated method stub
	return (getChieuDai()+getChieuRong())*2;
}
@Override
public double tinhDienTich() {
	// TODO Auto-generated method stub
	return 0;
}

}
