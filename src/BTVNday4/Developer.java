package BTVNday4;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee nv1 = new Employee();
		nv1.setEmployee_id(1234);
		nv1.setEmployee_name("Nguyen Van A");
		nv1.getEmployee_salary();
		System.out.println("ID là: " + nv1.getEmployee_id() + ", Tên: " + nv1.getEmployee_name() + ", Salary: "
				+ nv1.getEmployee_salary());

		Employee nv2 = new Employee();
		nv2.setEmployee_id(5678);
		nv2.setEmployee_name("Nguyen Van B");
		nv2.getEmployee_salary();
		System.out.println("ID là: " + nv2.getEmployee_id() + ", Tên: " + nv2.getEmployee_name() + ", Salary: "
				+ nv2.getEmployee_salary());

	}

}
//Không thể thiết lập được giá trị của Salary