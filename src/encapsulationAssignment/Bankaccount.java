package encapsulationAssignment;

public class Bankaccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
	}
	
	public void withdraw(double amount) {
		balance = balance-amount;
	}
	
	public void printStatement() {
		System.out.println("Owner: "+owner);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);


	}
	
	

}
