package tranThanhVan_123456789;

public class HocSinh {
	private String maHS;
	private String hoTenHS;
	public String getMaHS() {
		return maHS;
	}
	public void setMaHS(String maHS) {
		this.maHS = maHS;
	}
	public String getHoTenHS() {
		return hoTenHS;
	}
	public void setHoTenHS(String hoTenHS) {
		this.hoTenHS = hoTenHS;
	}
	// cóntructor
	public HocSinh(String maHS, String hoTenHS) {
		super();
		this.maHS = maHS;
		this.hoTenHS = hoTenHS;
	}
	public HocSinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHS == null) ? 0 : maHS.hashCode());
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
		HocSinh other = (HocSinh) obj;
		if (maHS == null) {
			if (other.maHS != null)
				return false;
		} else if (!maHS.equals(other.maHS))
			return false;
		return true;
	}
	public void convertToUPPer(String name) {
		String firstLetter = name.substring(0, 1);
	    // chuỗi remainingLetters chứa phần còn lại của name
	    String remainingLetters = name.substring(1, name.length());
	 
	    //sử dụng phương thức toUpperCase() để chuyển đổi firstLetter thành chữ in hoa
	    firstLetter = firstLetter.toUpperCase();
	}
 
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-12s|%-30s|", getMaHS(), getHoTenHS());
		return s;
	}
	

}
