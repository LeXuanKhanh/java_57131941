package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class B1 {
	public static void main(String[] args){
		ArrayList<Double> list = new ArrayList<Double>();
		while (true){
			System.out.print("nhap phan tu: ");
			Double x=(new Scanner(System.in)).nextDouble();
			list.add(x);
			
			System.out.print("Nhap them (y/n): ");
			if((new Scanner(System.in)).nextLine().equals("n")){
				break;
			}
		}
		
		for (Object x:list)
		{
			System.out.print(x +" ");
		}
	}

}
