package bt2;

import java.util.Scanner;

public class SanPham6 {
	private String ten;
	private String hang;
	private double dongia;
	public String getTenSanPham(){
		return this.ten;
	}
	public String getHangSanPham(){
		return this.hang;
	}
	public double getDonGiaSanPham(){
		return this.dongia;
	}
	
	
	public void setTenSanPham(String ten){
		this.ten=ten;
	}
	public void setHangSanPham(String ten){
		this.hang=ten;
	}
	public void setDonGiaSanPham(double dongia){
		this.dongia=dongia;
	}
	public void nhap()
	{
		System.out.println("nhap ten san pham: ");
		ten= (new Scanner(System.in)).nextLine();
		System.out.println("nhap hang san pham: ");
		hang= (new Scanner(System.in)).nextLine();
		System.out.println("nhap don gia san pham: ");
		dongia= (new Scanner(System.in)).nextDouble();
		
	}
	public void xuat()
	{
		System.out.println(ten);
		System.out.println(hang);
		System.out.println(dongia);
	}
	
}
