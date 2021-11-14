package tuan2.chuong2.bai2;

public class SinhVien {
	private String maSV, hoTenSV;
	private boolean gioiTinh;
	private final int NAMHOC=2020;
	private double diemLT, diemTH;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String ma) {
		if (ma!=null) {
			this.maSV = ma;
		}
		
	}
	public String getHoTenSV() {
		return hoTenSV;
	}
	public void setHoTenSV(String ht) {
		if (ht!=null) {
			this.hoTenSV = ht;
		} else {
			System.out.println("1");
		}
		
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double dTH) {
		if (dTH>0 || dTH<=10) {
			this.diemTH = dTH;
		} else 
		if(dTH<0){
			// lệnh if else 1
		} else 
		if(dTH>7){ 
			//lệnh if else 2
		} else {
			//lệnh else 3
		}
		
	}
	
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double dLT) {
		this.diemLT = dLT;
	}
	

}
