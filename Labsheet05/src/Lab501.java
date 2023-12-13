import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String Fullname = scan.nextLine();
		
		int spaceIndex = Fullname.indexOf(" ");
		
		if (spaceIndex != -1) {
			 System.out.println("First Name : "+Fullname.substring(0,spaceIndex));
			 System.out.print("Last Name  :" +Fullname.substring(spaceIndex));
		}
		
		else {
			System.out.print("Incorrect Name");
		}
			
	}

}
