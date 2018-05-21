package bt89;

public class NhanVien {
	private String maNV;
	private String phanXuong;
	private int soSP;
	public NhanVien(String maNV, String phanXuong, int soSP)
	{
		this.maNV= maNV;
		this.phanXuong= phanXuong;
		this.soSP= soSP;
	}
	public String getMaNV()
	{
		return this.maNV;
	}
	public String getPhanXuong()
	{
		return this.phanXuong;
	}
	public int getSoSP()
	{
		return this.soSP;
	}
	public void setMaNV(String maNV)
	{
		this.maNV= maNV;
	}
	public void setPhanXuong(String phanXuong)
	{
		this.phanXuong= phanXuong;
	}
	public void setSoSP(int soSP)
	{
		this.soSP= soSP;
	}
	public int getChuan()
	{
		if (phanXuong.equals("a"))
			return 300;
		else 
			return 500;
	}
	public boolean vuotChuan()
	{
		if (getSoSP() > getChuan())
			return true;
		else 
			return false;
	}
	public long tinhLuong()
	{
		if (vuotChuan())
			return getSoSP()*30000;
		else 
			return getSoSP()*20000;
	}
}
