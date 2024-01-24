
public class PersonalInfo {
	private Person name;
	private Date bDay;
	
	private int personID;
	
	//Default constructor
	//Postcondition: fristName = "", lastName = ""
	//dMonth=1, dDay=1,and dYear=1990
	//personID=0
	PersonalInfo(){
		name = new Person();
		bDay = new Date();//dMonth=1,dDay=1, and dYear-1990
		personID = 0;
	}
	
	//Constructor with parameter
	PersonalInfo(String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last); //firstName = first , lastName = last
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	//invoke set method from class Person and class Date
	public void setPersonalInfo(String first, String last,int month,int day,int year,int ID) {
		name.setName(first,last);
		bDay.setDate(month,day,year);
		personID = ID;
	}
	
	public String toString() {
		return "Name : "+name+"Date of birth : "+bDay+"\n"+"Personal ID :"+personID;
	}
}
