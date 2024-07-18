package day5_Overloading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhTong test = new TinhTong();
		test.add(2, 678);
		System.out.println(test.add(2, 678));
		System.out.println(test.add(4.15, 678.76));
		System.out.println(test.add("chuoi 1", "chuoi 2"));
	}

}
