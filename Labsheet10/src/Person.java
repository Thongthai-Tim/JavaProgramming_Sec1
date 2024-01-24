
public class Person {
	private String firstName,lastName;
	
	Person(){
		firstName = "";
		lastName = "";
	}
	
	Person(String first,String last){
		//firstName = first;
		//lastName = last;
		setName(first,last);//เรียกจาก Method setName
	}
	
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return firstName+" "+lastName;
	}
}
