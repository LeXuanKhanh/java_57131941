package bll;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import dal.KhachHangDal;
import dto.KhachHang;

public class KhachHangBLL {
	public static void them(JTextField maKhachHang, JTextField ten, JTextField ngaySinh, JTextField diaChi, JTextField ngayGiaNhap,JTextField doanhSo, JTable table){
		KhachHangDal.insert(maKhachHang.getText(), ten.getText(), ngaySinh.getText(), diaChi.getText(), ngayGiaNhap.getText(), Integer.parseInt(doanhSo.getText()) );
		
		capNhatTable(table);
	}
	public static void xoa(JTextField maKhachHang, JTable table){
		KhachHangDal.delete(Integer.parseInt(maKhachHang.getText()) );
		
		capNhatTable(table);
	}
	public static void sua(JTextField maKhachHang, JTextField ten, JTextField ngaySinh, JTextField diaChi, JTextField ngayGiaNhap,JTextField doanhSo, JTable table){
		KhachHangDal.update(maKhachHang.getText(), ten.getText(), ngaySinh.getText(), diaChi.getText(), ngayGiaNhap.getText(), Integer.parseInt(doanhSo.getText()) );
		
		capNhatTable(table);
	}
	public static void capNhatTable(JTable table){
		
		DefaultTableModel model= new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"M\u00E3 Kh\u00E1ch H\u00E0ng", "H\u1ECD T\u00EAn", "Ng\u00E0y Sinh", "\u0110\u1ECBa Ch\u1EC9", "Ng\u00E0y Gia Nh\u1EADp", "Doanh S\u1ED1"
				}
			);
		Vector<KhachHang> a = new Vector<KhachHang>();
		a = KhachHangDal.getALL();
		// tinh toan lai model
        for  (int i = 0; i < a.size(); i++){
        	
            Vector<String> rowData = new Vector<String>();
            
            rowData.add(a.get(i).getmaKhachHang() );        
            rowData.add(a.get(i).getten() );
            rowData.add(a.get(i).getngaySinh() );
            rowData.add(a.get(i).getdiaChi() );
            rowData.add(a.get(i).getngayGiaNhap() );
            rowData.add(Integer.toString(a.get(i).getdoanhSo()) );
            System.out.println(a.get(i).getmaKhachHang()+ " "+ i);
           
            model.addRow(rowData);
        }
        //cap nhat
        table.setModel(model);
	}
	
	public static void main(String args[]){
		
	}
}
