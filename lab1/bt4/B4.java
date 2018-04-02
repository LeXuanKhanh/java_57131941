package bt4;

import java.util.Scanner;

public class B4 {
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("nhap a : ");
		double a= scanner.nextDouble();
		System.out.print("nhap b : ");
		double b= scanner.nextDouble();
		System.out.print("nhap c : ");
		double c= scanner.nextDouble();
		if (a==0)
			if (b==0)
			{
				if (c==0)
					System.out.println("phuong trinh vo so nghiem:");
				else
					System.out.println("phuong trinh vo nghiem:");
			}
			else
				System.out.printf("phuong trinh co nghiem: \n",-c/b);
		else
		{
			float delta = (float) (Math.pow(b,2) - 4*a*c);
			if (delta < 0)
				System.out.println("phuong trinh vo nghiem:");
			else
			{
				float n1=(float)((-b-Math.sqrt(delta))/(2*a*c));
				float n2=(float)((-b+Math.sqrt(delta))/(2*a*c));	
				System.out.printf("phuong trinh 2 co nghiem: %f %f \n",n1,n2);
			}	
		}
		
	}
}
