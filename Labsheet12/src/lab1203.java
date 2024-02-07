import java.io.*;//if use buffered reader only use "import java.util"
public class lab1203 {

	public static void main(String[] args) throws IOException {
		//use BufferedReader read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0,i = 1;
		
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			System.out.println(i+"."+data[0]+"("+data[1]+"), Rating "+data[2]+" publist on " +data[5]);
			countBook++;
			i++;
		}
		System.out.println("=================================================");
		System.out.println("Total number of book : " + countBook);
		readFile.close();
		}

}
