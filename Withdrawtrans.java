package Transaction;
import Account.Account;
public class Withdrawtrans {
	void withdraw(Account arg,double Balance,double withdraw) {
		if(withdraw<=arg.getBalance()) {
			Balance=Balance-withdraw;
			arg.setBalance(withdraw);
			System.out.println("wihdrwa sucessful");	
		}
		else {
			System.out.println("insufficient balance");
		}

	}

}
