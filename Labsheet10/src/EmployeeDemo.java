import java.util.Scanner;
import java.text.*;
public class EmployeeDemo {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Input employee id       : ");
		String id = scan.nextLine();
		System.out.print("Input employee name     : ");
		String name = scan.nextLine();
		System.out.print("Input employee salary   : ");
		double salary = scan.nextDouble();
		System.out.print("Input employee sales    : ");
		double sales = scan.nextDouble();
		Sales1 Em = new Sales1(name,id,salary,sales);
		System.out.println(Em);
		DecimalFormat frm=new DecimalFormat("#,###.00");
		System.out.print("Total salary "+frm.format(Em.getCommission()+Em.getSalary())+" baht.");
	}
 
}