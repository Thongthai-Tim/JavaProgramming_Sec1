import java.util.*;
public class Example04 {
	static Scanner scan = new Scanner(System.in);//สิงที่อยู่หลังจากนี้จะใช้ร่วมกันได้หมดทุกmethod
	static String studentId,strSubjectID;
	static int subjectId;
	public static void main(String[] args) {
		inputStudent();
	}//end of main
	
	public static void inputStudent() {
		do {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
			
			strSubjectID = subjectId+"";
		}
		while(!(isLength(studentId,strSubjectID)));
		{
			System.out.println();
			displayData(isITStudent(studentId),isITSubject(strSubjectID));
		}
	}//end inputStudent();
	
	public static boolean isLength(String id,String sub_id) {
		if(id.length()==10 && sub_id.length()==7) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isITStudent(String id) {
		if(id.substring(0,2).equals("21")&&id.substring(4,5).equals("1")){
			return true;
		}else {
			return false;
		}
	}
		public static boolean isITSubject(String sub_id) {
			if(sub_id.substring(0,2).equals("21")&&sub_id.substring(4,5).equals("1")){
				return true;
			}
			else {
				return false;
			}
	}

	public static void displayData(boolean sid,boolean subid) {
		if(sid) {
			System.out.println("Student id: "+studentId+" 1st year student in IT");
		}else {
			System.out.println("Student id: "+studentId+" is not 1st year student in IT");
		}
		if(subid) {
			System.out.println("Emroll in courses for Year 1");
		}else {
			System.out.println("Not enroll in courses for Year 1");
		}
			
	}
}
