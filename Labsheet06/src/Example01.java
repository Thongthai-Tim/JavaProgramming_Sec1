import javax.swing.*;
public class Example01 {

	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();//รับแล้วแปลงเป็นพิมเล็ก
		
		boolean chkEmail = checkEmail(inputEmail);
		
		displayEmail(chkEmail,inputEmail);
	}
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		return false;//ที่ไม่ต้องใส้ else เพราะมันเช็ค Ifก่อนอยู่แล้ว
	}//end checkEmail
	
	public static void displayEmail(boolean chEmail,String inEmail) {
		
		if(chEmail==true) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + inEmail);
		}else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail ");
		}//end method
	}
	
}
