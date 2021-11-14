package tryCatch;

public class HocSinh {
private int maHS;
private String tenHS;
private int lop;// Học Sinh tiểu học
public int getMaHS() {
	return maHS;
}
public int taoMa() {
	 //Vòng lặp in ra 5 số ngẫu nhiên
	 int randomInt=0;
    for (int i=0; i<5; i++) {
        double randomDouble = Math.random();
        randomDouble = randomDouble*100;
        randomInt = (int) randomDouble;   
    }
   
	return randomInt;
}
public void setMaHS(int ma) {
	try {
		if (ma!=0) {
			this.maHS=ma;
		} 
	} catch (Exception e) {
		System.out.println("Lỗi");
	}
}
public String getTenHS() {
	return tenHS;
}
public void setTenHS(String tenHS) {
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	this.tenHS = tenHS;
}
public int getLop() {
	return lop;
}
public void setLop(int lop) {
	this.lop = lop;
}
public HocSinh(int maHS, String tenHS, int lop) {
	super();
	this.maHS = maHS;
	this.tenHS = tenHS;
	this.lop = lop;
}
public HocSinh() {
	
}


}
