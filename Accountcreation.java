package Transaction;
import Account.Account;
public class Accountcreation {
	Account createaccount(double Accno,String Cu_name,double Balance) {
		Account ac1=new Account( Accno,Cu_name, Balance);
		return ac1;
	}
 

}
