package nghichchoi;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankAccount ba = new BankAccount();
//		ba.increaseBalance(50000);
//		ba.decreaseBalance(50);
//		ba.deposit(10000);
//		ba.withdraw(15000);
		
		SaveAccount ba = new SaveAccount();
		ba.increaseBalance(50000);
		ba.decreaseBalance(50);
		ba.deposit(10000);
		System.out.println(ba.withdraw(15000));
		System.out.println(ba.MonthlyInterest());
	}
}
