
public class Movie {
	private String id,name;
	private Director director;
	
	Movie(String id,String name,Director Director){
		this.id = id;
		this.name = name;
		this.director = Director;
	}
	Movie(){
		this.id = null;
		this.name = null;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Director getDirector() {
		return this.director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String toString() {
		return id+name+"direct by "+ getDirector();
	}
}
