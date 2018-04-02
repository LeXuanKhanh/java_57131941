package bt1;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("nhap a : ");
		double a= scanner.nextDouble();
		System.out.print("nhap b : ");
		double b= scanner.nextDouble();
		if (a==0)
		{
			if (b==0)
				System.out.println("phuong trinh vo so nghiem:");
			else
				System.out.println("phuong trinh vo nghiem:");
		}
		else
			System.out.printf("phuong trinh co nghiem: %f \n",(float)-b/a);
	}
}
