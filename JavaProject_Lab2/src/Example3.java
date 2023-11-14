import java.text.DecimalFormat;
import java.util.*;//import for input data from keyboard
public class Example3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.create class Scanner for input data from keyboard
		Scanner input = new Scanner(System.in);
		//3.displat and input data
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice) + "baht.");
		float totalVat =  totalPrice + (totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(totalVat) + "baht.");
	}

}
