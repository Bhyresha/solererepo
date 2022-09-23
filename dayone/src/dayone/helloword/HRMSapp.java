package dayone.helloword;

import java.time.LocalDate;

public class HRMSapp {

	public static void main(String[] args) {
		
		Address add = new Address();
		
		add.setAddressId(1);
		add.setDistrict("Bangaluru");
		add.setState("Karnataka");
		
//		employee.setEmpId(1);
//		employee.setName("Vishnu");
//		employee.setDateOfbirth(LocalDate.now());
//		Object address;
//		employee.setAddress(address);
		
//		System.out.println(employee);
		Employee emp = new Employee(2,"Sacket",1434534,LocalDate.now(),add);
		System.out.println(emp);
		System.out.println(emp.getName());
		
		
 	}

}
