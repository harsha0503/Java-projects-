package Account;

public class Account {
	private double Accno;
	private String Cu_name;
	private double Balance;
	
	public Account(double Accno,String Cu_name,double Balance) {
		this.Accno=Accno;
		this.Cu_name=Cu_name;
		this.Balance=Balance;
	}
public double getAccno() {
	return Accno;
}
public String getCuts_name() {
	return Cu_name;
}
public double getBalance() {
	return Balance;
}
public void  setAccno() {
	this.Accno=Accno;
}
public void  setCust_name() {
	this.Cu_name=Cu_name;
}
public void  setBalance(double d) {
	this.Balance=Balance;
}
}
