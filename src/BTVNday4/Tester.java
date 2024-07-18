package BTVNday4;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ts1 = new Employee();
		ts1.setEmployee_id(2468);
		ts1.setEmployee_name("Do Huong Giang");
		ts1.getEmployee_salary();
		System.out.println("ID là: " + ts1.getEmployee_id() + ", Tên: " + ts1.getEmployee_name() + ", Salary: "
				+ ts1.getEmployee_salary());

		Employee ts2 = new Employee();
		ts2.setEmployee_id(1357);
		ts2.setEmployee_name("Nguyen Van B");
		ts2.getEmployee_salary();
		System.out.println("ID là: " + ts2.getEmployee_id() + ", Tên: " + ts2.getEmployee_name() + ", Salary: "
				+ ts2.getEmployee_salary());
	}

}
