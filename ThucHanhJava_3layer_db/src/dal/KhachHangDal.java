package dal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.KhachHang;
public class KhachHangDal {
	
	public static Vector<KhachHang> getALL(){
		
		try {
			DBconnect db = new DBconnect();
			db.MoKetNoi();
			Statement stm = db.con.createStatement();
			
			String sqlSelect = "select * from KhachHang;";
			ResultSet rs = stm.executeQuery(sqlSelect);
			
			Vector<KhachHang> kh = new Vector<KhachHang>(); 
			
			int j=0;
			while (rs.next())
			{
				KhachHang a= new KhachHang();
				a.setmaKhachHang(rs.getString("maKhachHang"));				
				a.setten(rs.getString("ten"));	
				a.setngaySinh(rs.getString("ngaySinh"));
				a.setdiaChi(rs.getString("diaChi"));
				a.setngayGiaNhap(rs.getString("ngayGiaNhap"));
				a.setdoanhSo(rs.getInt("doanhSo"));
				
				kh.add(a);
			
				j++;
				
				//for (int i=0; i<j ;i++){
				//	System.out.println(kh.get(i).getmaKhachHang() + " " +kh.get(i).getten());
		        //}
				
				//System.out.println();
			}
			
			return kh;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
		
	}
	public static KhachHang getByID(int id){
		try {
			DBconnect db = new DBconnect();
			db.MoKetNoi();
			
			String sqlSelect = "select * from khachhang where maKhachHang = ?;";
			
			PreparedStatement preparedStmt = DBconnect.con.prepareStatement(sqlSelect);
		    preparedStmt.setString (1, Integer.toString(id));
		    
			ResultSet rs = preparedStmt.executeQuery();
			
			KhachHang a = new KhachHang();
			
			while (rs.next())
			{
				a.setmaKhachHang(rs.getString("maKhachHang"));
				a.setten(rs.getString("ten"));
				a.setngaySinh(rs.getString("ngaySinh"));
				a.setdiaChi(rs.getString("diaChi"));
				a.setngayGiaNhap(rs.getString("ngayGiaNhap"));
				a.setdoanhSo(rs.getInt("doanhSo"));
				
				//System.out.println(a.getmaKhachHang() + " " +a.getten() + " " + a.getngaySinh() +" "+a.getdiaChi() + " " + a.getngayGiaNhap() + " "+ a.getdoanhSo());
			}
			
			return a;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}
	public static void insert(String maKhachHang,String ten,String ngaySinh,String diaChi,String ngayGiaNhap,int doanhSo){
		
		
		try {
			DBconnect db = new DBconnect();
			db.MoKetNoi();
			Statement stm = db.con.createStatement();
			String sqlInsert = "insert into KhachHang(maKhachHang,ten,ngaySinh,diaCHi,ngayGiaNhap,doanhSo)" 
					+ "values(?,?,?,?,?,?)";
			
			// create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = DBconnect.con.prepareStatement(sqlInsert);
		      preparedStmt.setString (1, maKhachHang);
		      preparedStmt.setString (2, ten);
		      preparedStmt.setString (3, ngaySinh);
		      preparedStmt.setString (4, diaChi);	      
		      preparedStmt.setString (5, ngayGiaNhap);
		      preparedStmt.setInt    (6, doanhSo);
		      preparedStmt.execute();
		      
		      db.con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void update(String maKhachHang,String ten,String ngaySinh,String diaChi,String ngayGiaNhap,int doanhSo){
		
		
		try {
			DBconnect db = new DBconnect();
			db.MoKetNoi();
			
			String sqlInsert = "update KhachHang " 
					+ "set ten = ?,ngaySinh=?,diaChi = ?,ngayGiaNhap = ?,doanhSo = ? "
					+ "where maKhachhang = ?";
			
			// create the mysql update preparedstatement
		      PreparedStatement preparedStmt = DBconnect.con.prepareStatement(sqlInsert);
		      
		      preparedStmt.setString (1, ten);
		      preparedStmt.setString (2, diaChi);
		      preparedStmt.setString (3, ngaySinh);
		      preparedStmt.setString (4, ngayGiaNhap);
		      preparedStmt.setInt    (5, doanhSo);
		      preparedStmt.setString (6, maKhachHang);
		      
		      preparedStmt.execute();
		      
		      db.con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void delete(int maKhachHang){
			
		try {
			DBconnect db = new DBconnect();
			db.MoKetNoi();
			Statement stm = db.con.createStatement();
			String sqlInsert = "delete from KhachHang where maKhachhang = ?";
			
			// create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = DBconnect.con.prepareStatement(sqlInsert);
		      
		      preparedStmt.setString (1, Integer.toString(maKhachHang));
		      preparedStmt.execute();
		      
		      db.con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws ParseException{
	    /* 
	    (String nsString = "20041997";
	    String ngnString ="20041997";
		
	    SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
	    
        Date parsedNS = format.parse(nsString);
        java.sql.Date sqlNS = new java.sql.Date(parsedNS.getTime());
        
        Date parsedNGN = format.parse(ngnString);
        java.sql.Date sqlNGN = new java.sql.Date(parsedNGN.getTime());*/
        
        //test insert command
        //insert("8","b","14/4/1992","b","14/4/1002",4);
		
		//test select command
		//getALL();
		//getByID(7);
		
		//test update command
		//update("7","sua","14/4/1992","b","14/4/1002",4);
		
		//test delete command
		//delete(7);
		
		
	}
}
