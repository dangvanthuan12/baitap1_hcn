package tryCatch;

import java.io.IOException;

public class Demo00 {
	
	    void kiemTraThietBi() throws IOException {
	        throw new IOException("Loi thiet bi");// checked exception
	    }
	 
	    void goiKiemTra() throws IOException {
	        kiemTraThietBi();
	    }
	 
	    void xuli() {
	        try {
	            goiKiemTra();
	        } catch (Exception e) {
	            System.out.println("ngoai le duoc xu ly");
	        }
	    }
	 
	    public static void main(String args[]) {
	        Demo00 obj = new Demo00();
	        obj.xuli();
	        System.out.println("luong binh thuong...");
	    }


}
