package day5_btvn_bai1;

import day5_btvn_bai1.HinhTron;
import day5_btvn_bai1.HinhVuong;

public class Application {

	public static void main(String[] args) {
	HinhTron htr1 = new HinhTron();
	htr1.setTenHinh("Hình Tròn");
	htr1.banKinh = 5;
	System.out.println("Tên hình: " + htr1.getTenHinh() + ", " + htr1.banKinh + ", " +  "Diện tích: " + htr1.tinhDienTich());
	
	HinhVuong hv1= new HinhVuong();
	hv1.setTenHinh("Hình Vuông");
	hv1.chieuDaiMotCanh = 10;
	System.out.println("Tên hình: " + hv1.getTenHinh() +", " + hv1.chieuDaiMotCanh + ", " + "Diện tích: " + hv1.tinhDienTich() );
	
	}

}
