package banque;

public class Account {
	  Bank bank;
	  Customer customer;
	  
	  
	 // public Bank(String name, String logo, String address,String phoneNumber,String countryIdentifier, int bankIdentifier,String swiftCode,int officeCode )
	 // Customer (String firstName,String lastName,String email,String password,String phoneNumber,String address, int age, char gender, double monthSalary) 
	  Bank banque = new Bank("CREDIT MUTUEL", "CM", "15 rue de la tune 89100 picsouland", "0108454569", "FR76",98542, "CM45875", 45675 );
	  Customer client = new Customer("Josiane","Dupont","josiane.dupont@gmail.com","picsou","0102030405","35 rue des bisounours 47852 Groland", 41, 'F', 1425.87);
	  
	  
	  
		  public String messageBank = banque.getName() + " " +banque.getBankIdentifier() + " " +  banque.getAddress() ;
		  public String messageCustomer = client.getLastName() + " " + client.getFirstName();
		  public String iban = "IBAN " + banque.getCountryIdentifier() + " " + banque.getSwiftCode() ;
		  public  int code = banque.getOfficeCode();
		  String dot = "--------------------------";

	 String getMessageBank() {
		return messageBank;
	}
	void setMessageBank(String messageBank) {
		this.messageBank = messageBank;
	}
	String getMessageCustomer() {
		return messageCustomer;
	}
	void setMessageCustomer(String messageCustomer) {
		this.messageCustomer = messageCustomer;
	}
	String getIban() {
		return iban;
	}
	void setIban(String iban) {
		this.iban = iban;
	}
	String getDot() {
		return dot;
	}
	void setDot(String dot) {
		this.dot = dot;
	}

	  
	  
	  

	}
