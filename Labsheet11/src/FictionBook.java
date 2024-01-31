import java.time.Year;

public class FictionBook implements Author{
	private String author_name,email,title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void  setAuthorName(String name) {
		this.author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastName() {
		 return this.author_name.substring(this.author_name.indexOf("")).trim().toUpperCase();
	}
	public String getFirstName() {
		 return this.author_name.substring(this.author_name.indexOf("")).toUpperCase();
	}
	public boolean checkEmail() {
		if(this.email == "@hotmail.com"||this.email == "windowslive.com") {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkFormatName() {
		return this.author_name.indexOf("")>0;
	}
	public int totalPublicYear() {
		return Year.now().getValue()-this.publicYear;
	}
	public String toString() {
		return this.title+"write by "+getLastName().substring(0,1) + "."+getFirstName()+ "("+this.email+")\nPublished for"+this.totalPublicYear()+"years.";
	}
}
