package banque;
import javax.swing.JOptionPane;

public class Rib {

		 Account account  =new Account();
		 public String concatMessage =  account.messageBank + "\n" + account.dot +"\n" + "\n" + account.messageCustomer + "\n" + account.dot + "\n" + account.iban +"\n"+ account.dot + "\n" + account.code;
		 public void afficher( String message){
			 System.out.println(message);
					 }
		 public void afficherBoiteDialogue(String message) {
			 JOptionPane.showMessageDialog(null, message);
		 }

}
