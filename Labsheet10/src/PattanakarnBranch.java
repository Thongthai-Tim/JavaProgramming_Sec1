
public class PattanakarnBranch extends Product{
	private int payUnit() {
		return super.getUnit() / 2;
	}
	
	public int getfreeUnit() {
		return super.getUnit() - this.payUnit();
	}
	
	public int getTotalprice() {
		return this.payUnit() * 100;
	}
	
	public String toString() {
		return "You buy"+this.payUnit()+"unit,get free"+this.getfreeUnit()+"unit("+getTotalprice()+")";
	}
}
