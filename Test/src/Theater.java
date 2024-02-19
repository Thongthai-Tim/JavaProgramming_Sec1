
public class Theater extends Movie{
	private int theaterNo;
	
	Theater(String id,String name,Director director,int theater){
		super(id,name,director);
		this.theaterNo = theater;
	}
	Theater(){
		super();
		this.theaterNo = 0;
	}
	public String getTheaterName() {
		if (theaterNo >= 1 && theaterNo <=11) {
			return "Basic Theater";
		}
		else if (theaterNo >= 12 && theaterNo <=14) {
			return "Sweet Theater";
		}
		else if (theaterNo == 15) {
			return "Premiun Theater";
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return getTheaterName()+":"+super.toString();
	}
}
