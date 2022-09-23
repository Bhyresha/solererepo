package dayone.helloword;

import java.time.LocalDate;

public class Employee {
int emId;
String name;
double salary;
LocalDate dateofBirth;
private Address address; //Has A relationship


public Employee(int emId, String name, double salary, LocalDate dateofBirth, Address address) {
	super();
	this.emId = emId;
	this.name = name;
	this.salary = salary;
	this.dateofBirth = dateofBirth;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [emId=" + emId + ", name=" + name + ", salary=" + salary + ", dateofBirth=" + dateofBirth
			+ ", address=" + address + ", getEmId()=" + getEmId() + ", getName()=" + getName() + ", getSalary()="
			+ getSalary() + ", getDateofBirth()=" + getDateofBirth() + ", getAddress()=" + getAddress()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getEmId() {
	return emId;
}
public void setEmId(int emId) {
	this.emId = emId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public LocalDate getDateofBirth() {
	return dateofBirth;
}
public void setDateofBirth(LocalDate dateofBirth) {
	this.dateofBirth = dateofBirth;
}
public Address getAddress() {
	return address;
}
public void setAddres(Address address) {
	this.address = address;
}


}
