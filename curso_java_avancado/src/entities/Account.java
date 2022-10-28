package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public Account(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
	//Number nunca pode ser setado diferente
	//Balance só pode ser setado pelos métodos deposit e withdraw
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withdraw(double withdraw) {
		balance -= withdraw + 5.00;
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: "
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f",balance);
	}
	
}
