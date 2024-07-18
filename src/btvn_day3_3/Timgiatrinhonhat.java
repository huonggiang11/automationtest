package btvn_day3_3;
import java.util.Scanner;

public class Timgiatrinhonhat {

	public static void nhapMang(int doDaiMang)
	{
		Scanner scanner= new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i< doDaiMang; i++)
		{
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: "+ i);
			mangSoNguyen[i]= scanner.nextInt();
		}
		
		timGiaTriNhoNhat(mangSoNguyen);
	}

	public static void timGiaTriNhoNhat(int[]mangSoNguyen) {
		int soNhoNhat= mangSoNguyen[0];
		for (int i = 0; i < mangSoNguyen.length;i++) {
			if(soNhoNhat > mangSoNguyen[i]) 
				soNhoNhat = mangSoNguyen[i];
		}
		System.out.println("Gia tri nho nhat cua mang la:" + soNhoNhat);
	}
	public static void main(String[] args) {
		nhapMang(5);
	}
}

