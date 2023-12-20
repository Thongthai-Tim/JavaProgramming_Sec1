import java.util.*;
public class Example03 {
	static Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		System.out.print("please enter your name, separated by a space: ");
		String inputfullName = scan.nextLine();
		String firstName = inputfullName.substring(0,inputfullName.indexOf(" "));
		System.out.println(abbreviatName(inputfullName)+firstName);
	}

	
	
	
	
	
	
	
	public static String abbreviatName(String fullname) {
		String newName = "";
		
		for(int i=0;i<fullname.length()-1;i++) {
			if(fullname.charAt(i)==' ') {
					  newName = newName + fullname.charAt(i+1)+".";
				}
			}return newName; 
		
	}
}
