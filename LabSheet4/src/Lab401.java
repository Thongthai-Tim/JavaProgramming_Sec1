import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int currentNumber,previousNumber;
		
		System.out.print("Input value of X : ");
		previousNumber = scan.nextInt();
	
		
			System.out.print("Input vaule of Y : ");
			currentNumber = scan.nextInt();
			while(true) {
			if(currentNumber <= previousNumber) {
				System.out.print("Input vaule of Y, again : ");
				currentNumber = scan.nextInt();
			}
			System.out.print("");
			
			for (int i = previousNumber ;i <= currentNumber; i++)
			{
				System.out.print(previousNumber + currentNumber + "="+ previousNumber);
			
			}
		

	}
	}
}
