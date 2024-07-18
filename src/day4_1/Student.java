package day4_1;

public class Student {

	private Object studen1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student1= new Person();
		student1.name= "Nguyen Van A";
		student1.setPhoneNumber("0123456789");
		System.out.println("Họ tên: "+ student1.name+ ", số điện thoại: "+ student1.getPhoneNumber());
		
		Person student2= new Person();
		student2.name= "Nguyen Van B";
		student2.setPhoneNumber("9876543210");
		System.out.println("Họ tên: "+ student2.name+ ", số điện thoại: "+ student2.getPhoneNumber());
	}

}