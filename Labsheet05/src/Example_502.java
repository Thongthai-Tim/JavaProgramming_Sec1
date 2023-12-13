import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		String yourEmail = JOptionPane.showInputDialog("Input you e-mail : ");
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) {
			yourEmail = JOptionPane.showInputDialog("Input you e-mail, agian : ");
		}
		
		yourEmail = yourEmail.toLowerCase();
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + yourEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}
}
