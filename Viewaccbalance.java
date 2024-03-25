package Transaction;

import Account.Account;

public class Viewaccbalance {
void viewbalance(Account arg) {
	arg.getBalance();
	System.out.print("total balance "+arg.getAccno());
}
}
