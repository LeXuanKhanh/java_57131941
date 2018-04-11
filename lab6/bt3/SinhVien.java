package bt3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
	private String hoten;
	private String email;
	private String dienthoai;
	private String cmnd;
	
	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public String getHoTen(){
		return this.hoten;
	}	
	public String getEmail(){
		return this.email;
	}	
	public String getDienThoai(){
		return this.getDienThoai();
	}	
	public String getCmnd(){
		return this.cmnd;
	}
	
	public void setHoTen(String hoten){
		this.hoten=hoten;
	}
	public void setEmail(String email){
		//https://stackoverflow.com/questions/8204680/java-regex-email
		 Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
		 if (matcher.find())
			this.email=email;
		 else
			 System.out.println("email ko hop le");
	}
	public void setDienThoai(String dienthoai){
		String dt[]=dienthoai.split(" ");
		if ((dt[0].charAt(0)==0) && (dt[0].charAt(0)==9) && (dt.length>=10) && (dt.length>=10))
			this.dienthoai=dienthoai;
		 else
			 System.out.println("so dt ko hop le");
	}
	public void setCmnd(String cmnd){
		if (cmnd.length()==9)
		this.cmnd=cmnd;
		 else
			 System.out.println("cmnd ko hop le");
	}
	
}
