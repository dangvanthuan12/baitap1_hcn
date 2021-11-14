package modul1;

import java.util.Scanner;

public class Mang {
	public static final int MAX=20;
	public static void nhap(int[] d, int n) {
		System.out.println("Nhập cái giá trị mảng:");
		Scanner sc= new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d]=", i);
			d[i]=sc.nextInt();
		}
		System.out.println();
	}
	public static void xuat(int[] c, int n) {
		System.out.println("Xuất các giá trị của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%1s]=%2s\n", i,c[i]);
			
		}
	}
	
	public static void sapXepTD(int[] a, int n) {
		System.out.println("Mảng sau khi sắp xếp tăng dần:");
		for (int i = 0; i <n-1; i++) {
			for (int j = i+1; j < n; j++) {
				int tam;
				if (a[i]>a[j]) {
					tam=a[i];
					a[i]=a[j];
					a[j]=tam;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] a= new int[MAX];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chỉ số dùng mảng:");
		n=sc.nextInt();
		nhap(a, n);
		System.out.printf("d[%1s]=%2s\n", 2,a[2]);
		xuat(a, n);
		sapXepTD(a, n);
		xuat(a, n);
		
	}

}
