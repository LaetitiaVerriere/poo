package banque;

public class Customer {
	private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private int age;
    private char gender;//F ou M
    private double monthSalary;
    
    
    Customer (String firstName,String lastName,String email,String password,String phoneNumber,String address, int age, char gender, double monthSalary) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.age = age;
	this.gender = gender;
	this.monthSalary = monthSalary;
		
}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public double getMonthSalary() {
		return monthSalary;
	}


	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

}
