package bt3;
import bt3.sanpham;
import java.util.*;
public class B3 {
	public static void main( String[] args){
		ArrayList<sanpham> sp=new ArrayList<sanpham>();
		menu(sp);		
	}
	public static void menu(ArrayList<sanpham> sp){
		while (true){
			System.out.println("1)nhap danh sach san pham: ");
			System.out.println("2)xuat danh sach san pham: ");
			System.out.println("3)sap xep danh sach san pham: ");
			System.out.println("4)xoa 1 san pham: ");
			System.out.println("chon (1,2,3,4): ");
			short x=(new Scanner(System.in)).nextShort();
			switch (x){
		    case 1:
		       nhap(sp);
		       break; 
		    case 2 :
		    	xuat(sp);
		        break; 
		    case 3 :
		    	sapxep(sp);
		        break;
		    case 4 :
		    	xoa(sp);
		        break;
		    default : 
		    	System.out.println("nhap khong hop le");
			}		
		}
	}
	public static void nhap(ArrayList<sanpham> sp){
		while (true){
			sanpham s = new sanpham();
			System.out.println("nhap ten san pham: ");
			String ten=(new Scanner(System.in)).nextLine(); 
			s.setTenSanPham(ten);
			System.out.println("nhap gia san pham: ");
			double gia=(new Scanner(System.in)).nextDouble();
			s.setGiaSanPham(gia);
			sp.add(s);
			
			System.out.print("Nhap them (y/n): ");
			if((new Scanner(System.in)).nextLine().equals("n")){
				break;
			}
		}
	}
	public static void xuat(ArrayList<sanpham> sp){
		for (Object x:sp)
		{
			System.out.println("ten: " +((sanpham) x).getTenSanPham());
			System.out.println("gia: " +((sanpham) x).getGiaSanPham());
		}
		System.out.println();
	}
	public static void sapxep(ArrayList<sanpham> sp){
		
		Comparator<sanpham> comp=new Comparator<sanpham>(){

			@Override
			public int compare(sanpham arg0, sanpham arg1) {
				// TODO Auto-generated method stub
				
				//return arg0.getGiaSanPham().compareTo(arg1.getGiaSanPham());
				//Cannot invoke compareTo(double) on the primitive type double
				//fixed: https://stackoverflow.com/questions/20142192/cannot-invoke-comparetodouble-on-the-primitive-type-double
				return Double.compare(arg1.getGiaSanPham(),arg0.getGiaSanPham());
			}
			
		};
		
		Collections.sort(sp,comp);
		System.out.println("danh sach san pham sau khi sap xep");
		xuat(sp);
	}
	public static void xoa(ArrayList<sanpham> sp){
		System.out.println("nhap ten san pham can xoa :");
		String a=(new Scanner(System.in)).nextLine();
		int vt = 0;
		for (int i=0;i<sp.size();i++)
		{
			if (sp.get(i).getTenSanPham()==a)
			{
				vt=i;
				break;
			}
		}
		sp.remove(vt);
		System.out.println("danh sach san pham sau khi xoa");
		xuat(sp);
	}
	public static void tb(ArrayList<sanpham> sp){
		double s=0;
		for (Object x:sp){
			s=s+((sanpham) x).getGiaSanPham();
		}
		System.out.println("gia trung binh cua danh sach san pham: "+(float) s/(sp.size()));
	}
}
