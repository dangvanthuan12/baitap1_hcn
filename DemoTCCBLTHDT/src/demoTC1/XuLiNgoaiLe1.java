package demoTC1;

public class XuLiNgoaiLe1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
            int data = a / b;
        } catch (ArithmeticException e) {
        	System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
	
	}
