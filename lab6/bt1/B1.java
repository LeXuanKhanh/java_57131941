package bt1;

import java.util.*;

public class B1 {
	public static void main(String[] args){
		System.out.println("nhap ho va ten: ");
		String hoten=(new Scanner(System.in)).nextLine();
		int csCuoiHo=0,csDauDem=0,csCuoiDem=0;
		int DemKhoangTrang=0;
		for (int i=0;i< hoten.length();i++){
			if (hoten.charAt(i)== ' ')
			{
				if (DemKhoangTrang==0)
				{
					csCuoiHo=i;
					DemKhoangTrang++;
					csDauDem=i+1;
					csCuoiDem=i;
				}		
				else
				{
					csCuoiDem=i;
				}
			}
		}
		
		
		hoten = hoten.trim();
		hoten = hoten.replaceAll("\\s+", " ");
		
		 String temp[] = hoten.split(" ");
		 hoten = ""; 
	        for (int i = 0; i < temp.length; i++) {
	        	hoten += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
	            if (i < temp.length - 1)
	            	hoten += " ";
	        }
		
		System.out.println(hoten.substring(0,csCuoiHo));
		System.out.println(hoten.substring(csDauDem, csCuoiDem));
		System.out.println(hoten.subSequence(csCuoiDem+1, hoten.length()));
		
	}
}
