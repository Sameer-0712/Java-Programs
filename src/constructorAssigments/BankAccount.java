package constructorAssigments;

public class BankAccount {

	String accNum;
	double balance;
	
	public BankAccount(String accNum, double balance) {
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
	}
	
	public void withdraw(double amount) {
		balance = balance-amount;
	}
	
}
