package day5_btvn_bai3;

import day5_btvn_bai3.Employee;

public class Dev extends Employee{
	private String namKinhNghiemDev;

	public String getNamKinhNghiem() {
		return namKinhNghiemDev;
	}

	public void setNamKinhNghiem(String namKinhNghiemDev) {
		this.namKinhNghiemDev = namKinhNghiemDev;
	}
	
	@Override
	public void displayInformation() 
	{
		System.out.println("Developer: "+ getHoTen()+ "," + "Mã nhân viên:" + getMaNV()+ ", "+ "Tuổi:"+ gettuoi()+ "Năm kinh nghiệm: "+ getNamKinhNghiem());
	}
}