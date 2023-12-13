import java.text.DecimalFormat;
import java.util.*;
public class Lab01 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit : ");
		float pricePerUnit = input.nextFloat();
		float totalPrice = productUnit * pricePerUnit;
		System.out.print("---------------------------------");
		System.out.print("Total Price is " + totalPrice +"baht.");
		System.out.print("---------------------------------");
	}

}
