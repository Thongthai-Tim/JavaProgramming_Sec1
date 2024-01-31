import java.text.*;
public class Sales1 extends Employee1{
	private double sales;
	
	public Sales1(String id,String name,double salary,double sales) {
		super(id,name,salary);
		this.sales=sales;	
	}
	public Sales1(String id,String name, double sales) {
		super(id,name);
		this.sales=sales;
	}
	public double getCommission() {
		if(sales<10000) {
			return 0;
		}
		else if(sales<50000) {
			return (sales-10000)*10/100;
		}
		else {
			return (sales-50000)*15/100;
		}
	}
	public String toString() {
		DecimalFormat frm=new DecimalFormat("#,###.00");
		return super.getName()+" ("+super.getId()+") "+"get commission "+frm.format(getCommission()) +" B.";
	}
}