import java.text.DecimalFormat;
import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		int sales;
		double salary,contributableSalary;
		
		while(true) {
		System.out.print("Enter sales in dollars (or -1 to end) : ");
		salary = scan.nextInt();
		if (salary == SENTINEL) {
			System.out.print("Bye");
			break;
		}
		contributableSalary = 1000+ (salary*COMMISSION_RATE);
		System.out.print("Salary is : $"+frm.format(contributableSalary));
		System.out.print("\n");
		}
		
	}

}
