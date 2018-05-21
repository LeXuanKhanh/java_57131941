package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	static Connection con;
	public static boolean MoKetNoi() {
		// TODO Auto-generated method stub
		String conString = "jdbc:mysql://localhost:3306/vd_db_java_qlbh?&useSSL=false";
		String tendn="root";
		String mk="khanh123";
		//"jdbc:sqlserver://DESKTOP-R1APMB1\\SQLEXPRESS;databaseName=vd_db_java;integratedSecurity=true";
		boolean kt=false;
		try {
			
			con = DriverManager.getConnection(conString,tendn,mk);
			
			if (con == null)
				kt = false;
			else
				kt = true;
			/*Statement stm = con.createStatement();
			
			String sqlSelect = "select maSV,ten from sinhvien;";
			ResultSet rs = stm.executeQuery(sqlSelect);
			
			while (rs.next())
			{
				String maSV = rs.getString("maSV");
				String ten = rs.getString("ten");
				System.out.println(maSV + " " + ten);
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kt;
	}
	//public static void main(String[] args){
	//	MoKetNoi();
	//}
}
