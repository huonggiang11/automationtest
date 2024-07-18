package day5_btvn_bai1;

import day5_btvn_bai1.HinhHoc;

public class HinhTron extends HinhHoc{
	public int banKinh;
	
	@Override
	public double tinhDienTich() 
	{
		double dienTichHinhTron=  2 * 3.14 * banKinh;
		return dienTichHinhTron;
	}
}