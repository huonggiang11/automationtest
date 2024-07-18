package day3_2;

import java.util.Scanner;

public class Thuchanh_for {

public static void inraSo110()
{
	for (int i =0; i <=10; i++) {
		if (i%2 == 0)
		System.out.println("Gia tri cua i la: "+ i);
	}
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
	timGiaTriLonNhat(mangSoNguyen);
	sapXepMangTangDan(mangSoNguyen);
}

public static void InMang(int[]mangSoNguyen ) {
	System.out.println("Do dai legth cua mang " +mangSoNguyen.length);
	System.out.print("Cac gia tri cua mang vua nhap la: ");
	for (int i = 0; i < mangSoNguyen.length;i++) {
		System.out.print( mangSoNguyen[i]+ " ");
	}
}
public static void timGiaTriLonNhat(int[]mangSoNguyen) {
	int soLonNhat= 0;
	for (int i = 0; i < mangSoNguyen.length;i++) {
		if(soLonNhat < mangSoNguyen[i]) 
			soLonNhat= mangSoNguyen[i];
	}
	System.out.print("So lon nhat cua mang la:" + soLonNhat);
}

public static void sapXepMangTangDan(int[] mangSoNguyen) {
	int tmp= 0;
	for (int i = 0; i < mangSoNguyen.length; i++) 
		for (int j= 0; j < mangSoNguyen.length - 1 ; j ++) {
			System.out.println("Lần lặp thứ " + j + " để so sánh "+ mangSoNguyen[j] + " và " + mangSoNguyen[j+1] + ": ");
			if(mangSoNguyen[j] > mangSoNguyen[j+ 1])
			{
			tmp= mangSoNguyen[j];
			mangSoNguyen[j]= mangSoNguyen[j+ 1];
			mangSoNguyen[j+ 1]= tmp;
			}
			InMang(mangSoNguyen);
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inraSo110();
		nhapMang(10);
	}

}

