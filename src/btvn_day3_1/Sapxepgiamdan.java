package btvn_day3_1;
import java.util.Scanner;

public class Sapxepgiamdan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(4);
	}
	public static void nhapMang(int doDaiMang)
	{
		Scanner scanner= new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i< doDaiMang; i++)
		{
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: "+ i);
			mangSoNguyen[i]= scanner.nextInt();
		}
		InMang(mangSoNguyen);
		sapXepMangGiamDan(mangSoNguyen);
	}

	public static void InMang(int[]mangSoNguyen ) {
		System.out.println("Do dai legth cua mang " +mangSoNguyen.length);
		System.out.print("Cac gia tri cua mang vua nhap la: ");
		for (int i = 0; i < mangSoNguyen.length;i++) {
			System.out.print( mangSoNguyen[i]+ " ");
		}
	}

	public static void sapXepMangGiamDan(int[] mangSoNguyen) {
		int tmp= 0;
		for (int i = 0; i < mangSoNguyen.length; i++) 
			for (int j= 0; j < mangSoNguyen.length - 1 ; j ++) {
				System.out.println("Lần lặp thứ " + j + " để so sánh "+ mangSoNguyen[j] + " và " + mangSoNguyen[j+1] + ": ");
				if(mangSoNguyen[j] < mangSoNguyen[j+ 1])
				{
				tmp= mangSoNguyen[j+ 1];
				mangSoNguyen[j+1 ]= mangSoNguyen[j];
				mangSoNguyen[j]= tmp;
				}
				InMang(mangSoNguyen);
			}
	}

}

