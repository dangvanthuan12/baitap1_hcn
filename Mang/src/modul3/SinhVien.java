package modul3;

public class SinhVien {
	private String maSV;
	private String hoTenSV;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTenSV() {
		return hoTenSV;
	}
	public void setHoTenSV(String hoTenSV) {
		this.hoTenSV = hoTenSV;
	}
	// tạo constructor
	public SinhVien() {
		
	}
	public SinhVien(String maSV, String hoTenSV) {
		this.maSV = maSV;
		this.hoTenSV = hoTenSV;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSV == null) ? 0 : maSV.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		if (maSV == null) {
			if (other.maSV != null)
				return false;
		} else if (!maSV.equals(other.maSV))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTenSV=" + hoTenSV + "]";
	}
}
