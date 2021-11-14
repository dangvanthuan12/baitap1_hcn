package tryCatch;

public class Demo4 {

	public static void main(String[] args) {
		// Sử dụng khối lệnh finally trong trường hợp trong khối try có lệnh return.
		try {
            int data = 25;
            if (data % 2 != 0) {
             System.out.println(data + " is odd number");
             return;
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
	}
}
