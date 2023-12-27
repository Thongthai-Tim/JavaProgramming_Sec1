import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[7];
		int odd = 0;
		for(int i= 0;i<number.length;i++) {
			System.out.print("input number"+(i+1)+":");
			number[i]=scan.nextInt();
			if(number[i]%2 != 0)
			{
				odd++;
			}
		}
		System.out.println();
		System.out.print("There are "+ odd +" of odd number.");
		int j = 0;
		System.out.print("\nList of odd number : ");
		for(int newNumber:number) {
			if(newNumber%2 != 0)
			{
				System.out.print(newNumber+" ");
			}
		}
		

	}

}
