package day5_btvn_bai1;

import day5_btvn_bai1.HinhHoc;

public class HinhVuong extends HinhHoc {
	public int chieuDaiMotCanh;
	
	@Override
	public double tinhDienTich()
	{
		double dienTichHinhVuong = chieuDaiMotCanh * 4;
		return dienTichHinhVuong;
	}
}
