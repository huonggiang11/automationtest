package btvn_day3_2;
import java.util.Scanner;

public class Sochiahetcho2va3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(5);
	}
	public static void nhapMang(int doDaiMang)
	{
		Scanner scanner= new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i< doDaiMang; i++)
		{
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: "+ i);
			mangSoNguyen[i]= scanner.nextInt();
			if( mangSoNguyen[i] % 2 ==0 && mangSoNguyen[i] % 3 ==0 )
			{
				System.out.println("Điều kiện thoát xảy ra");
				return;
			}
		}
	}
}
