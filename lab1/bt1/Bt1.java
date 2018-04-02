package bt1;

import java.util.Scanner;

public class Bt1 {
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("ho va ten: ");
		String hoten= scanner.nextLine();
		System.out.print("Diem TB: ");
		double diemTB= scanner.nextDouble();
		System.out.printf("%s %f diem", hoten, diemTB);
		
	}
}
