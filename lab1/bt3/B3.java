package bt3;

import java.util.Scanner;

public class B3 {
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("nhap canh cua khoi lap phuong: ");
		double canh= scanner.nextDouble();
		System.out.printf("the tich khoi lap phuong: %s ", Math.pow(canh,3));
		
	}
}
