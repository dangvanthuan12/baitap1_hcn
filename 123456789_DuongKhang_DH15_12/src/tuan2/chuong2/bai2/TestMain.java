package tuan2.chuong2.bai2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		int chon;
		Scanner sc= new Scanner(System.in);
		chon=sc.nextInt();
		switch (chon) {
		case 18:
			System.out.println("Tuổi 18");
			
		case 20:
			System.out.println("Tuổi 20");
		
			
		default:
			System.out.println(" Không phải 18 hoachwj 20");
			break;
		}

	}

}
