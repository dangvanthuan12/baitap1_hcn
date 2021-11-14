package tryCatch;

public class Demo1 {
	public static void main(String[] args) {
		// sử dụng khối lệnh finally nơi ngoại lệ không xảy ra
		 try {
	            int data = 25 / 5;
	            System.out.println(data);
	        } catch (NullPointerException e) {
	            System.out.println(e);
	        } finally {
	            System.out.println("finally block is always executed");
	        }
	        System.out.println("rest of the code...");
	    }
	}

