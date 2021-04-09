package nghichchoi;

public class BankAccount {
	private String name;
	private String accountNumber;
	private double balance; // at least 50k VND in any case

//	getter & setter:

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

//	constructor
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// methods
	public void increaseBalance(double d) {
		setBalance(getBalance() + d);
		System.out.println("Successfully!");
	}

	public boolean decreaseBalance(double d) {
		if (getBalance() >= (50000 + d)) {
			setBalance(getBalance() - d);
			System.out.println("Successfully!");
			return true;
		} else {
			System.out.println("Invalid amount!");
			return false;
		}
	}

	public void deposit(double d) {
		setBalance(getBalance() + d);
		System.out.println("Successfully!");
	}

	public boolean withdraw(double d) {
		if (getBalance() < 50000) {
			System.out.println("Failed!!!Your account is less than 50000 VND");
			return false;
		} else if (getBalance() < (50000 + d)) {
			System.out.println("Failed!! You only can withdraw max: " + (getBalance() - 50000) + "VND");
			return false;
		} else {
			setBalance(getBalance() - d);
			System.out.println("Successfully!!!");
			return true;
		}
	}
}
