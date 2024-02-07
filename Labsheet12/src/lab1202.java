import java.util.*;
import java.io.*;
public class lab1202 {

	public static void main(String[] args) throws IOException {
	Scanner inputEmail = new Scanner(System.in);
	System.out.print("Input Email: ");
	String sectionInput = inputEmail.next();
	boolean found = false;
	Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
	
	while(readFile.hasNext()){
			readFile.next(); //name
			readFile.next(); //surname
			String password = readFile.next(); //password
			String email = readFile.next();
			
			if(sectionInput.equalsIgnoreCase(email)) {
				System.out.println("Your password is "+password);
				found = true;
				break;
			}
			/*if (sectionInput.equalsIgnoreCase(email)) {
					System.out.println(password);
				}
			else
				System.out.println("The data not found...");break;*/ //Haha funny
		}
	if(found == false)
		System.out.println("The data not found...");
	 readFile.close();
	}
}
