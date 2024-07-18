package day5_btvn_bai3;

import day5_btvn_bai3.Employee;

public class BA extends Employee
{
		private String namKinhNghiemBA;

		
		public String getNamKinhNghiemBA() {
			return namKinhNghiemBA;
		}

		public void setNamKinhNghiemBA(String namKinhNghiemBA) {
			this.namKinhNghiemBA = namKinhNghiemBA;
		}
		
		@Override
		public void displayInformation() 
		{
			System.out.println("BA: "+ getHoTen()+ "," + "Mã nhân viên:" + getMaNV()+ ", "+ "Tuổi:"+ gettuoi()+ ", "+ "Năm kinh nghiệm: "+ getNamKinhNghiemBA());
		}
}

