package day5_inheritance;

public class SinhVien extends Nguoi{
	private String maSV;
	private String soTinchi;
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getSoTinchi() {
		return soTinchi;
	}
	public void setSoTinchi(String soTinchi) {
		this.soTinchi = soTinchi;
	}
	@Override
	public void diChoi()
	{
		System.out.println("Trời đẹp thì đi chơi");
	}
	public void diHoc()
	{
		System.out.println("Sinh viên học 5 ngày/tuần");
	}
	}