package btvnday2;
import java.util.Scanner;
public class BTVNday2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z; double ketqua;
		Scanner myObj= new Scanner(System.in);
		System.out.println("Nhập số thứ nhất :");
		x= myObj.nextInt();
		System.out.println("Nhập số thứ 2 :");
		y= myObj.nextInt();
		System.out.println("Nhập số thứ 3 :");
		z= myObj.nextInt();
		ketqua= (x*y)/z;
		System.out.println("Số thứ nhất "+ x +"\nNhân số thứ 2 "+ y+ " \nChia số thứ 3 "+ z + " \nbằng " + ketqua);
	}

}