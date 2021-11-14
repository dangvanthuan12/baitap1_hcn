package bai1.HinhChuNhat;

public class Demo {
	int a;
	int b;
	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public static void main(String[] args) {
		Demo t = new Demo();
		if (t instanceof Demo) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
 
	}

}
