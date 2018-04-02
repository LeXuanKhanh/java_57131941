package bt2;

import java.util.Scanner;

public class b2 {
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("nhap chieu dai: ");
		double dai= scanner.nextDouble();
		System.out.print("nhap chieu rong: ");
		double rong= scanner.nextDouble();
		System.out.printf("chu vi: %s \ndien tich: %s diem \n", 2*(dai+rong), dai*rong);
		if (dai>rong)
			System.out.printf("canh nho nhat: %s \n", rong);
		else 
			System.out.printf("canh nho nhat: %s \n", dai);
		
	}
}
