import java.util.*;
import java.io.*;
public class Example1201 {
	public static void main(String[] args) throws IOException{
		// use Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next(); //read name
			String lname = readFile.next(); //read surname 
			readFile.next();//read password data //if not use some variable, use"readFile.next" because don't setting variable
			String email = readFile.next().toUpperCase();//email
			
			System.out.println(fname+""+"("+email+")");
		}
		readFile.close();
	}

}
