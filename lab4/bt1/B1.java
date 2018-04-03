package bt1;

import java.util.Scanner;
public class B1 {
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("nhap n: ");
		double n= scanner.nextDouble();
		boolean ok= true;
		for (int i=2; i < n-1 ;i++)
			if (n % i ==0)
			{
				ok=false;
				break;
			};
		if (ok)
			System.out.println("so nguyen to ");
		else
			System.out.println("khong phai la so nguyen to ");
	}
}
