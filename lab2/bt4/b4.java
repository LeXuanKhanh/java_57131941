package bt4;
import java.util.Scanner;

import bt1.B1;
import bt2.B2;
import bt3.B3;
public class b4 {
	public static void menu()
	{
		System.out.println("+--------------------------------+");
		System.out.println("1.giai phuong trinh bac nhat");
		System.out.println("2.giai phuong trinh bac hai");
		System.out.println("3.tinh tien dien");
		System.out.println("4.ket thuc");
		System.out.println("+--------------------------------+");
		System.out.print("chon chuc nang: ");
		Scanner scanner= new Scanner(System.in);
		byte c = scanner.nextByte();
		
		switch(c){
			case 1:
	    		B1.main(null);
	    		break; 
			case 2:
				B2.main(null);
				break; 
			case 3:
				B3.main(null);
				break;
			case 4:
				System.exit(0);
				break;
			default : 
				System.out.print("nhap khong hop le: ");

		}
	}
	public static void main (String[] args)
	{
		menu();
	}
}
