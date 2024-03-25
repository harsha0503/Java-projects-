package Transaction;

import Account.Account;

public class DepsitTransc {
	public void deposit(Account arg,double depositamt) {
		arg.setBalance(arg.getBalance()+depositamt);
		System.out.println("After deposit amount"+arg.getBalance());
	}

}
