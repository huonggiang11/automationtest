package day2;

public class Information {
	public static int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Họ và tên: Giang");
		System.out.println("Số điện thoại: 987654321");
		System.out.println("Email: abc@gmail.com");
		a =5;
		b=7;
		int result= a+b;
		System.out.println("a+b =" + result);
		printLargerNumber(a,b);
	}

	public static void printLargerNumber( double s1, double s2) {
		if (s1>s2) {
		System.out.println("Số lớn hơn là: " + s1);
	}
			else {
				System.out.println("Số lớn hơn là: " + s2);
			}
	}
}