package day5_btvn_bai2;

import day5_btvn_bai2.tinhLuong;

public class Application {

	public static void main(String[] args) {
		tinhLuong luong = new tinhLuong();
		luong.luong(10000000,1.5);
		System.out.println("Lương: "+ luong.luong(19000000,1.5));
		System.out.println("Lương theo năm kinh nghiệm: "+ luong.luong(19000000,1.5,3));
		System.out.println("Lương chuyên khoa: "+ luong.luong(19000000, 1.5,3, 0.2));
		System.out.println("Lương đa khoa: "+ luong.luong(10000000,1.5,3, 0.45));

	}

}