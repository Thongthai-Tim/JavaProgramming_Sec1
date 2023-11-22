import javax.swing.*;

import java.text.DecimalFormat;
import java.util.Random;//use library for random class

public class Withdrawal {

	public static void main(String[] args) {
		//using class random for random money 
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		
		int omoney = Integer.parseInt(JOptionPane.showInputDialog(null, "Your balance: " + frm.format(balance) +"\nInput money to withdraw: "));
		
		if(omoney > balance) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdarw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else if(omoney > 20000){
			JOptionPane.showMessageDialog(null,"Error:Cannot withdarw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else if (omoney % 100 != 0) {
			int aftermod = omoney%100;
			JOptionPane.showMessageDialog(null,"Error Cannot withdarw " + aftermod + " baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"You withdraw "+frm.format(omoney)+" baht."+"\n1,000 = "+ omoney/1000 + "\n500 = "+ (omoney%1000)/500 + "\n100 = "+ (omoney%500)/100);
		}
	}

}
