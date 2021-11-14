package tryCatch;

public class Demo3 {

	public static void main(String[] args) {
		// sử dụng khối lệnh finally nơi ngoại lệ xảy ra và được xử lý.
		try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
