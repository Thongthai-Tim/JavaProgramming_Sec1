import java.util.*;
public class TestPiggyBank {
		static PiggyBank pb = new PiggyBank();
		static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		PiggyBank pb = new PiggyBank();
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Baht Money : "+13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		int sizeofPiggybank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggybank);
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		Mainmenu();
	}
	
	public static void Mainmenu() {
		while(true) {
		System.out.println("===========================");
		System.out.println("Menu of PiggyBank");
		System.out.println("===========================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		System.out.println("===========================");
		System.out.print("Please Select Menu[1-5] : ");
		int selectMenu = scan.nextInt();
		
		int total = 0;
		
		if(selectMenu == 1) {
			System.out.print("Insert 1 Baht Money: ");
			total = scan.nextInt();
			pb.addOne(total);
			System.out.println("Money Total : "+pb.getTotal());
			System.out.println("");
		}
		else if(selectMenu == 2) {
			System.out.print("Insert 2 Baht Money: ");
			total = scan.nextInt();
			pb.addTwo(total);
			System.out.println("Money Total : "+pb.getTotal());
			System.out.println("");
		}
		else if(selectMenu == 3) {
			System.out.print("Insert 5 Baht Money: ");
			total = scan.nextInt();
			pb.addFive(total);
			System.out.println("Money Total : "+pb.getTotal());
			System.out.println("");
		}
		else if(selectMenu == 4) {
			System.out.print("Insert 10 Baht Money: ");
			total = scan.nextInt();
			pb.addTen(total);
			System.out.println("Money Total : "+pb.getTotal());
			System.out.println("");
		}
		else {
			System.out.println("Bye bye");
			break;	
		}
		}
	}
}