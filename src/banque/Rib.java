package banque;
import javax.swing.JOptionPane;

public class Rib {
	Account account;
	public static void main(String[] args) {
		Account account  =new Account();
		JOptionPane.showMessageDialog(null,  account.messageBank + "\n" + account.dot +"\n" + "\n" + account.messageCustomer + "\n" + account.dot + "\n" + account.iban +"\n"+ account.dot + "\n" + account.code  );
	}

}
