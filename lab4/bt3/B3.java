package bt3;

import java.util.Scanner;

public class B3 {
	public static void main (String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		int[] a=new int[100];
		System.out.println("nhap n: ");
		double n= scanner.nextDouble();
		
		System.out.printf("nhap a[1]: \n");
		a[1]= scanner.nextInt();
		int min=a[1];
		int s=0;
		int d=0;
		if (a[1] % 3==0)
		{
			s=s+a[1];
			d++;
		}
		for (int i=2;i<=n;i++)
		{
			System.out.printf("nhap a[%d]: \n",i);
			a[i]= scanner.nextInt();
			if (min > a[i])
				min = a[i];
			if (a[i] % 3==0)
			{
				s=s+a[i];
				d++;
			}
		}
		
		System.out.println(n);
		for (int i=1;i<=n;i++)
			System.out.printf(" ",a[i]);
		System.out.println();
		System.out.printf(" so nho nhat : %d \n",min);
		System.out.printf(" trung binh cong cac so chia het cho 3 : %f \n",(float) s/d);
		

	}
}
