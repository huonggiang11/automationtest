package day5_inheritance;

public class GiaoVien extends Nguoi {
		//Thuộc tính mở rộng: maSV,soTinChi
		//Ghi đè lên diChoi()
		//Mở rộng: diDay();
	private String maGV;
	private int soNamKN;
	
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public int getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(int soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	@Override 
	public void diChoi()
	{
		System.out.println("Dạy và chấm xong bài + Trời đẹp thì đi chơi");
	}
	public void diDay()
	{
		System.out.println("Đi dạy 15 tiết/1 tuần");
	}
}
