import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//create object for input data from console(keyboard)
		Scanner scan = new Scanner(System.in);
		int currentNumber,previousNumber;
		
		System.out.print("Input Number : ");
		previousNumber = scan.nextInt();
	
		while(true) {
			System.out.print("Input Number : ");
			currentNumber = scan.nextInt();
			if (currentNumber < previousNumber) {
			break;
			}
			previousNumber = currentNumber;
		}System.out.print("Bye Bye");
		
		/*if (currentNumber < previousNumber) {
			System.out.print("Bye Bye");
		}*/
	
	}

}
