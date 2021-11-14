package modul2;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("demo Switch thiếu");
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập vào giá trị của a=");
		a=sc.nextInt();
		switch (a) {
		case 1: System.out.println("Đọc là 1");
			break;
		case 2:System.out.println("Đọc là 2");
			break;
		case 3:System.out.println("Đọc là 3");
			break;
		case 4:System.out.println("Đọc là 4");
			break;
			default: System.out.println("Không đọc được"); 
			break;
		}		
	}

}
