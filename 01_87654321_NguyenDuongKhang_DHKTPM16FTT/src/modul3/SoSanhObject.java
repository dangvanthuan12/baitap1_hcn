package modul3;

public class SoSanhObject {
	public String ten;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ten == null) ? 0 : ten.hashCode());
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
		SoSanhObject other = (SoSanhObject) obj;
		if (ten == null) {
			if (other.ten != null)
				return false;
		} else if (!ten.equals(other.ten))
			return false;
		return true;
	}
	public static void main(String[] args) {
		 SoSanhObject ob1 = new SoSanhObject();
		 ob1.setTen("Khang");
		 SoSanhObject ob2 = new SoSanhObject();
		 ob2.setTen("Khang");
		 System.out.println(ob1.equals(ob2));
		 
	}

	

}
