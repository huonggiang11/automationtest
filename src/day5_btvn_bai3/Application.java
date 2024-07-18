package day5_btvn_bai3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Danh sách nhân viên Dev:");
	Dev dev1= new Dev();
	dev1.setHoTen("Nguyen Van A");
	dev1.setMaNV("DV01");
	dev1.settuoi ("25");
	dev1.setNamKinhNghiem("3");
	dev1.displayInformation();
	
	Dev dev2= new Dev();
	dev2.setHoTen("Nguyen Van An");
	dev2.setMaNV("DV02");
	dev2.settuoi ("27");
	dev2.setNamKinhNghiem("2");
	dev2.displayInformation();
	
	
	System.out.println("Danh sách nhân viên Tester:");
	Test test1= new Test();
	test1.setHoTen("Nguyen Van Hung");
	test1.setMaNV("T01");
	test1.settuoi ("28");
	test1.setNamKinhNghiemTest("2");
	test1.displayInformation();
	
	Test test2= new Test();
	test2.setHoTen("Nguyen Van Toan");
	test2.setMaNV("T02");
	test2.settuoi ("23");
	test2.setNamKinhNghiemTest("1");
	test2.displayInformation();
	
	System.out.println("Danh sách nhân viên BA:");
	BA ba1= new BA();
	ba1.setHoTen("Nguyen Thi Thu");
	ba1.setMaNV("BA01");
	ba1.settuoi ("27");
	ba1.setNamKinhNghiemBA("4");
	ba1.displayInformation();
	
	BA ba2= new BA();
	ba2.setHoTen("Nguyen Thu Huong");
	ba2.setMaNV("BA02");
	ba2.settuoi ("25");
	ba2.setNamKinhNghiemBA("3");
	ba2.displayInformation();
}
}
