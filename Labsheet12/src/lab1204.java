import java.util.*;
import java.io.*;
public class lab1204 {
	public static void main(String[] args) throws IOException {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		float rate = Input.nextFloat();
		System.out.println("----------------------------------------------------------");
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		String bookName = "";
		String authorName ="";
		String review = "";
		int i = 0,countBook = 0;
		while((tmp = readFile.readLine()) !=null) {
			String[] data = tmp.split("\t");
			float rating = Float.parseFloat(data[2]);
			bookName = data[0];
			authorName = data[1];
			review = data[3];
			i++;
			if(rating >= rate) {
				System.out.println("Book"+i+":"+bookName+" write by "+authorName+" ("+review+") reviews");
				countBook++;
 
			}
			
		}
		readFile.close();
		System.out.println("----------------------------------------------------------");
		System.out.println("There are "+countBook+" book get rating more than "+rate);
	}
 
}
 