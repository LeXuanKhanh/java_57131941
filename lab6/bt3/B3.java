package bt3;
import java.util.ArrayList;
import java.util.Scanner;

import bt3.SinhVien;
public class B3 {
	public static void main(String[] args){
		ArrayList<SinhVien> sv= new ArrayList<SinhVien>();
		while (true){
			SinhVien s = new SinhVien();
			System.out.println("nhap ten san pham: ");
			String ten=(new Scanner(System.in)).nextLine(); 
			s.setHoTen(ten);
			System.out.println("nhap email: ");
			String email=(new Scanner(System.in)).nextLine();
			s.setEmail(email);
			System.out.println("nhap so dien thoai: ");
			String dienthoai=(new Scanner(System.in)).nextLine();
			s.setDienThoai(dienthoai);
			System.out.println("nhap so cmnd: ");
			String cmnd=(new Scanner(System.in)).nextLine();
			s.setCmnd(cmnd);
			sv.add(s);
			
			System.out.print("Nhap them (y/n): ");
			if((new Scanner(System.in)).nextLine().equals("n")){
				break;
			}
		}
		
		
		
		for (Object x:sv)
		{
			System.out.println("ten: " +((SinhVien) x).getHoTen());
			System.out.println("email: " +((SinhVien) x).getEmail());
			System.out.println("so dt: " +((SinhVien) x).getDienThoai());
			System.out.println("cmnd: " +((SinhVien) x).getCmnd());
			System.out.println();
		}
		
	}
}
