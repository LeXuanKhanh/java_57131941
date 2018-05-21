package dto;

public class KhachHang {
	private  String maKhachHang;
	private  String ten;
	private  String ngaySinh;
	private  String diaChi;
	private  String ngayGiaNhap;
	private  int doanhSo;
	public String getmaKhachHang(){
		return this.maKhachHang;
	}
	public String getten(){
		return this.ten;				
	}
	public  String getngaySinh(){
		return this.ngaySinh;
	}
	public  String getdiaChi(){
		return this.diaChi;
	}
	public String getngayGiaNhap(){
		return this.ngayGiaNhap;
	}
	public int getdoanhSo(){
		return this.doanhSo;
	}
	
	public void setmaKhachHang(String maKhachHang){
		this.maKhachHang= maKhachHang;
	}
	public void  setngaySinh(String ngaySinh){
		this.ngaySinh = ngaySinh;
	}
	public void setten( String ten){
		this.ten=ten;
	}
	public void setdiaChi( String diaChi){
		this.diaChi=diaChi;
	}
	public void setngayGiaNhap( String ngayGiaNhap){
		this.ngayGiaNhap= ngayGiaNhap;
	}
	public void setdoanhSo( int doanhSo){
		this.doanhSo= doanhSo;
	}
}
