import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		System.out.println("");
		
		System.out.print("Input director name : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char gender = scan.nextLine().charAt(0);
		while(!(gender == 'f'||gender == 'F'||gender == 'm'||gender=='M'))
		{
			System.out.print("Input director gender, agian :");
			gender = scan.nextLine().charAt(0);

		}
		
		Director obj1 = new Director(dName,dEmail,gender);
		
		Movie obj2 = new Movie(id,name,obj1);
		
		System.out.print("Input movie theater no. : ");
		int theaterNum = scan.nextInt();
		while(!(theaterNum >= 1 && theaterNum <=15)) {
			System.out.print("Please input 1-15 only : ");
			theaterNum = scan.nextInt();
		}
		
		Theater obj3 = new Theater(id,name,obj1,theaterNum);
		System.out.println(obj3);
	}

}
