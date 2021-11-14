package prjKhoangCach1;

public class TestDT {
	public static void main(String[] args) {
		ToaDo x1 = new ToaDo(2, 4);
		HinhTron ht = new HinhTron(0, x1);
		HinhTron ht2 = new HinhTron(12, new ToaDo(4, 9));
		System.out.println(ht2);
		double kc= Math.sqrt(Math.pow((ht2.getTam().getX()-ht.getTam().getX()),2)+ Math.pow(ht2.getTam().getY()-ht.getTam().getY(), 2));
		System.out.println(kc);
		double kf= Math.pow(3, 2);
		System.out.println(kf);
	}
	

}
