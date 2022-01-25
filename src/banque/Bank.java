package banque;

public class Bank {
	private String name;
    private String logo;
    private String address;
    private String phoneNumber;
    private String countryIdentifier;
    private int bankIdentifier;
    private String swiftCode;//BIC
    private int officeCode;// branche
    Customer customer;

  public Bank(String name, String logo, String address,String phoneNumber,String countryIdentifier, int bankIdentifier,String swiftCode,int officeCode ) {
    	this.name = name;
    	this.logo = logo;
    	this.address = address;
    	this.phoneNumber = phoneNumber;
    	this.countryIdentifier = countryIdentifier;
    	this.swiftCode = swiftCode;
    	this.officeCode = officeCode;
    }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountryIdentifier() {
		return countryIdentifier;
	}

	public void setCountryIdentifier(String countryIdentifier) {
		this.countryIdentifier = countryIdentifier;
	}

	public int getBankIdentifier() {
		return bankIdentifier;
	}

	public void setBankIdentifier(int bankIdentifier) {
		this.bankIdentifier = bankIdentifier;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public int getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
}
