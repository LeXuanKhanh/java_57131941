package bt4;

import java.util.Scanner;

public class B4 {
	public static void hocluc(float a)
	{
		if (a<5)
			System.out.println("yeu");
		if ((5<=a) && (a<6.5))
			System.out.println("trung binh");
		if ((6.5<=a) && (a<7.5))
			System.out.println("kha");
		if ((7.5<=a) && (a<9))
			System.out.println("gioi");
		if (a>=9)
			System.out.println("xuat sac");
	}
	public static void main (String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		String ten = null;
		float[] diem = new float[100];
		System.out.println("nhap n: ");
		int n= scanner.nextInt();
		for (int i=0;i<n;i++)
		{
			try {
			System.out.println("nhap ho ten sinh vien thu "+ (i+1) + ":");
			ten= scanner.nextLine();
			System.out.println("nhap diem sinh vien thu "  + (i+1) + ":");
			diem[i]=scanner.nextFloat();
			}
			catch (Exception e) {
				System.out.println("Error!");
				}
			
		}
		
		for (int i=0;i<n;i++)
		{
			System.out.println(ten);
			System.out.println(diem[i]);
			hocluc(diem[i]);

		}
		
		
	}
}
