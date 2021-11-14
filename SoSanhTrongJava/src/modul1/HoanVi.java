package modul1;

public class HoanVi {
	public static void hoanVi(int a, int b) {
		int c=a;
		a=b;
		b=c;
	}

	public static void main(String[] args) {
		int d=10;
		int e=12;
		hoanVi(d, e);
		System.out.println("gia trị d="+d);
		System.out.println("giá trị e= "+e );

	}

}
