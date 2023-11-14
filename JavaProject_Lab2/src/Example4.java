import java.text.DecimalFormat;

import javax.swing.*;//1.import library for input data from dialog box
public class Example4 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		//input data from dialogbox		
		String strUnit = JOptionPane.showInputDialog("Input Product Unit:");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);
		
		//input and convert data from dialog
		String strPrice = JOptionPane.showInputDialog("Input Price per unit:");
		float pricePerUnit =Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		float totalVat = totalPrice + (totalPrice*7/100);
		
		//display data to dialog box
		JOptionPane.showMessageDialog(null, "Total Price is " +frm.format(totalPrice)+"baht."
				+"\nAdd VAT 7% is " +frm.format(totalVat)+"baht.");
		
	}

}
