package btvn_day7;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter the company's employee number: ");
	     int numberEmployee = scanner.nextInt();
	     Employee[] Employee = new Employee[numberEmployee];
	     
	     System.out.println("Enter imformation for employee:");
	        for (int i = 0; i < numberEmployee; i++) {
	            Employee[i]= new Employee();
	            System.out.println("Enter details for employee "+ (i + 1) + ":");  
	            Employee[i].inputData();
	        }
	        System.out.println("Employee list: ");
	        for (Employee employee: Employee) {
	        	System.out.println(employee);
	        }
	        scanner.close();
	}

}
