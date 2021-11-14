package thiGK;

import java.util.Date;

public abstract class GiaoDich {
	protected String maGD;
	protected Date ngayGD;
	protected double donGia;
	protected double dienTich;
	// phuong thức ảo thanhTien
	public abstract double thanhTien();
	// property get set
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String ma) throws Exception {
		if (ma!=null) {
			this.maGD = maGD;
		} else {
			throw new Exception("Ma khac rong");
		}
		
	}
	public Date getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(Date ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public GiaoDich(String maGD, Date ngayGD, double donGia, double dienTich) throws Exception {
		setMaGD(maGD);
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maGD == null) ? 0 : maGD.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GiaoDich))
			return false;
		GiaoDich other = (GiaoDich) obj;
		if (maGD == null) {
			if (other.maGD != null)
				return false;
		} else if (!maGD.equals(other.maGD))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GiaoDich [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", dienTich=" + dienTich + "]";
	}
	
	

	
}
