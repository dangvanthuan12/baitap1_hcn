package modul1;

public class HoanViThamBien {
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

public void hoanVi( HoanViThamBien c, HoanViThamBien d) {
	HoanViThamBien e=c;
	c=d;
	d=e;
}
	
	

	public static void main(String[] args) {
		int a=10;
		int b=5;
		HoanViThamBien p;
		p= new HoanViThamBien();
		p.setA(a);
		p.setB(b);

	}

}
