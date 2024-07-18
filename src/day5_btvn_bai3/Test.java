package day5_btvn_bai3;

import day5_btvn_bai3.Employee;

public class Test extends Employee {
	private String namKinhNghiemTest;

	
	public String getNamKinhNghiemTest() {
		return namKinhNghiemTest;
	}

	public void setNamKinhNghiemTest(String namKinhNghiemTest) {
		this.namKinhNghiemTest = namKinhNghiemTest;
	}
	
	@Override
	public void displayInformation() 
	{
		System.out.println("Tester: "+ getHoTen()+ "," + "Mã nhân viên:" + getMaNV()+ ", "+ "Tuổi:"+ gettuoi()+ "," + "Năm kinh nghiệm: "+ getNamKinhNghiemTest());
	}
}