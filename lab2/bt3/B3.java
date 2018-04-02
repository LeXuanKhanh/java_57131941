package bt3;

import java.util.Scanner;

public class B3 {
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("nhap so dien : ");
		double sodien = scanner.nextDouble();
		double tien;
		if (sodien<50)
			tien= sodien*1000;
		else
			tien = 50*1000 + (sodien-50)*1200;
		System.out.printf("tien dien : %s ",tien);
	}
}
