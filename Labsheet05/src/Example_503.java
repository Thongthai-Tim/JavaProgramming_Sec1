import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, agian : ");
			sentence = scan.nextLine();
		}
		int countSpace = 0;
		for(int i = 0; i < sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				countSpace+=1;
			}
		}
		System.out.println("This sentence has "+ countSpace+" spaces.");
		System.out.print("This sentence has "+ (countSpace+1)+" word.");
	}

}
