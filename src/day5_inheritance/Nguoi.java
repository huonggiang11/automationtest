package day5_inheritance;

public abstract class Nguoi {
//Thuộc tinh private: hoTen,ngaySinh=> getter và setter
// Phuong thuc diChoi()
	private String hoTen; 
	private String ngaySinh ;
	

	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public void diChoi()
	{
		System.out.println("Trời đẹp thì đi chơi");
	}
}