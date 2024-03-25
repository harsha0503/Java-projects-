package Transaction;
import Account.Account;
public class Fundtransfer {
	public boolean transfer(Account arg,Account arg2,double withdraw) {
		if(arg.getBalance()>withdraw) 
		{
			System.out.println("withdraw is successful");
			arg.setBalance(arg.getBalance()-withdraw);
			System.out.println("after withdraw to frist account balance: "+arg.getBalance());
			arg2.setBalance(arg2.getBalance()+withdraw);
			System.out.println("after deposit"+arg.getBalance());
			return true;
		}
		return false;
	}

}
