package bt2;
import bt2.SanPham6;
import java.util.*;
public class B2 {
	public static void main(String args[]){
		ArrayList<SanPham6> sp= new ArrayList<SanPham6>();
		for (int i=0;i<5;i++){
			SanPham6 t=new SanPham6();
			t.nhap();
			sp.add(t);
		}
		
		for (int i=0;i<2;i++){
			sp.get(i).xuat();
			System.out.println();
		}
		
		System.out.println("nhung san pham co hang la nokia");
		for (int i=0;i<2;i++){
			if (sp.get(i).getHangSanPham().equals("nokia")){
				
				sp.get(i).xuat();
				System.out.println();
			}

		}
	}
}
