package day4_1;

public class Person {
	
	public String name;
	private String phoneNumber;
	
	//vì phoneNuber là biến private nên cần tạo phương thức Get để lấy thông tin và set để nhập thông tin sđt
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String value) {
		this.phoneNumber= value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}