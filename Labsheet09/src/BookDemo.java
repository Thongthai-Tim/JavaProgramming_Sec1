import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input book price : ");
		float price = scan.nextFloat();
		System.out.print("Input publish year : ");
		int year = scan.nextInt();
		
		Book a1 = new Book();
		a1.setTitle(title);
		a1.setPrice(price);
		a1.setPublishyear(year);
		System.out.print(a1);

	}

}
