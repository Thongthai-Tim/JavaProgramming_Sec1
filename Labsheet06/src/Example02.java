import javax.swing.*;
public class Example02 {

	public static void main(String[] args) {
		int inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year :"));
		
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please Input year between 1000-3000:" + "\nInput Year, again "));
		}
		if(isLeapYear(inputYear)==true) {
			JOptionPane.showMessageDialog(null,inputYear +" is Leap Year");
		}else {
			JOptionPane.showMessageDialog(null,inputYear + " is not Leap Year");
		}
	}
	
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0))) {
			return true;
		}
		return false;
	}
	
	public static boolean checkYear(int year) {
		if(year >=1000 & year <=3000) {
			return true;
		}
		return false;
	}
}
