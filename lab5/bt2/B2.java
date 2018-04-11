package bt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B2 {
	public static void main(String[] args){
		ArrayList<Double> list = new ArrayList<Double>();
		menu(list);
	}
	public static void menu(ArrayList<Double> list){
		while (true){
			System.out.println("1)nhap mang: ");
			System.out.println("2)xuat mang: ");
			System.out.println("3)sap xep mang: ");
			System.out.println("4)hoan doi ngau nhien");
			System.out.println("5)xoa 1 phan tu: ");
			System.out.println("chon (1,2,3,4,5): ");
			short x=(new Scanner(System.in)).nextShort();
			switch (x){
		    case 1:
		       nhap(list);
		       break; 
		    case 2 :
		    	xuat(list);
		        break; 
		    case 3 :
		    	sapxep(list);
		        break;
		    case 4 :
		    	ngaunhien(list);
		        break;
		    case 5 :
		    	xoa(list);
		        break;
		    default : 
		    	System.out.println("nhap khong hop le");
			}		
		}
	}
	public static void nhap(ArrayList<Double> list){
		while (true){
			System.out.print("nhap phan tu: ");
			Double x=(new Scanner(System.in)).nextDouble();
			list.add(x);
			
			System.out.print("Nhap them (y/n): ");
			if((new Scanner(System.in)).nextLine().equals("n")){
				break;
			}
		}
	}
	public static void xuat(ArrayList<Double> list){
		for (Object x:list)
		{
			System.out.print(x +" ");
		}
		System.out.println();
	}
	public static void sapxep(ArrayList<Double> list){
		Collections.sort(list);
		System.out.println("mang sau khi sap xep: ");
		xuat(list);
	}
	public static void ngaunhien(ArrayList<Double> list){
		Collections.shuffle(list);
		System.out.println("mang sau khi hoan doi ngau nhien: ");
		xuat(list);
	}
	public static void  xoa(ArrayList<Double> list){
		System.out.println("nhap phan tu can xoa :");
		Double a=(new Scanner(System.in)).nextDouble();
		int vt = 0;
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i)==a)
			{
				vt=i;
				break;
			}
		}
		list.remove(vt);
		System.out.println("mang sau khi xoa phan tu: ");
		xuat(list);
		
	}
	
}
