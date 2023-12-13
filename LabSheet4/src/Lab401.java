import java.util.Scanner;

public class Lab401 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valueFirst , valueSecond;
        
        System.out.print("Input value of X : ");
        valueFirst = scan.nextInt();
        System.out.print("Input value of Y : ");
        valueSecond = scan.nextInt();
        
        do {
        	if(valueFirst > valueSecond) {
        		System.out.print("Input value of Y,again : ");
        		valueSecond = scan.nextInt();
        		}
        	else {
        		break;
        	}
        }while(true);
        
        for(int i = valueFirst+1 ; i <= valueSecond ; i++) {
        	System.out.println(valueFirst + " + " + i + " = " + (valueFirst+=i));
        }
    } 
    
}

