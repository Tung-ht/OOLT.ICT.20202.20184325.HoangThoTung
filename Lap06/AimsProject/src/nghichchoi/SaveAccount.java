package nghichchoi;

public class SaveAccount extends BankAccount {
	private double annualInterestRate;
	
	public SaveAccount() {
		super();
	}

	public double MonthlyInterest() {
		return getBalance() * (1 + annualInterestRate/12);
	}

	@Override
	public boolean withdraw(double d) {
		return false;
	}
}
