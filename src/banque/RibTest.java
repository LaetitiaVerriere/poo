package banque;
import javax.swing.JOptionPane;
public class RibTest {

	public static void main(String[] args) {
		Rib rib = new Rib();
		rib.afficher(rib.concatMessage); //version terminal
		rib.afficherBoiteDialogue(rib.concatMessage);//version boite de dialogue
	}

}
