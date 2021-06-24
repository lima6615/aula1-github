package entities;

public class Account {

	private Integer number;
	private String name;
	private double balance;

	public Account(Integer number, String name) {
		this.number = number;
		this.name = name;
	}

	public Account(Integer number, String name, Double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + name +", Balance: $ " 
				+ String.format("%.2f", balance);
	}
}
