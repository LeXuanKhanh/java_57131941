package btth2;

public class SinhVien {
	private int stt;
	private String hoten;
	private String namsinh;
	private String gioitinh;
	int getStt(){
		return this.stt;
	}
	public String getHoTen(){
		return this.hoten;
	}
	public String getNamSinh(){
		return this.namsinh;
	}
	public String getGioiTinh(){
		return this.gioitinh;
	}
	
	public void setStt(int stt){
		this.stt=stt;
	}
	public void setHoTen(String hoten){
		this.hoten=hoten;
	}
	public void setNamSinh(String namsinh){
		this.namsinh=namsinh;
	}
	public void setGioiTinh(String gioitinh){
		this.gioitinh=gioitinh;
	}
}
